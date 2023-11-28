import { Component, OnInit } from '@angular/core';
import * as L from 'leaflet';
import { MapChartService } from './map-chart.service';
import 'leaflet-polylinedecorator';


@Component({
  selector: 'app-map-chart',
  templateUrl: './map-chart.component.html',
  styleUrls: ['./map-chart.component.css']
})
export class MapChartComponent implements OnInit {

  ngOnInit() {
    this.getMovementCoordinates();
  }

  constructor(private mapChartService: MapChartService) { }

  private getMovementCoordinates() {
    this.mapChartService.getMovementCoordinates().subscribe(
      (data) => {
        const latlang: L.LatLngExpression[][]=[]
        for(let i=0; i<data.length; i++) {
          const moveCoords = data[i].split(",");
          latlang.push([
            [parseFloat(moveCoords[0]), parseFloat(moveCoords[1])],
            [parseFloat(moveCoords[2]), parseFloat(moveCoords[3])]
          ])
        }
        this.createMap(latlang);
      },
      (error) => {
        console.log("Error Fetching States of all the Farms")
      }
    )
  }

  createMap(latlang: L.LatLngExpression[] | L.LatLngExpression[][]) {
    const mapOptions: L.MapOptions = {
      center: [41.8781, -87.6298],
      zoom: 4.5,
    };

    const map = L.map('map', mapOptions);

    const layer = L.tileLayer('https://{s}.basemaps.cartocdn.com/dark_all/{z}/{x}/{y}.png');

    map.addLayer(layer);

    const multiPolyLineOptions: L.PolylineOptions = { color: 'pink' };

    const multipolyline = L.polyline(latlang, multiPolyLineOptions);

    const arrowOptions = {
      patterns: [
        {
          offset: 25,
          repeat: 50,
          symbol: L.Symbol.arrowHead({
            pixelSize: 15,
            polygon: false,
            pathOptions: { color: 'pink' }
          })
        }
      ]
    };

    const arrDecorator = L.polylineDecorator(multipolyline, arrowOptions);

    arrDecorator.addTo(map);
    multipolyline.addTo(map);
  }

}

import { Component, OnInit } from '@angular/core';
import * as L from 'leaflet';


@Component({
  selector: 'app-map-chart',
  templateUrl: './map-chart.component.html',
  styleUrls: ['./map-chart.component.css']
})
export class MapChartComponent implements OnInit {

  ngOnInit() {
    this.createMap();
  }

  createMap() {
    // Creating map options
    const mapOptions: L.MapOptions = {
      center: [16.506174, 80.648015],
      zoom: 7,
    };

    // Creating a map object
    const map = L.map('map', mapOptions);

    // Creating a Layer object
    const layer = L.tileLayer('http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png');

    // Adding layer to the map
    map.addLayer(layer);


    // Creating latlng object
    const latlang:L.LatLngExpression[][] = [
      [[17.385044, 78.486671], [16.506174, 80.648015], [17.686816, 83.218482]],
      [[13.082680, 80.270718], [12.971599, 77.594563],[15.828126, 78.037279]]
    ];

    // Creating poly line options
    const multiPolyLineOptions: L.PolylineOptions = { color: 'red' };

    // Creating multi poly-lines
    const multipolyline = L.polyline(latlang, multiPolyLineOptions);

    // Adding multi poly-line to map
    multipolyline.addTo(map);
  }

}

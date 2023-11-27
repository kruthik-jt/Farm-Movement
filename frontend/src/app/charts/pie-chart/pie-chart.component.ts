import { Component, OnInit } from '@angular/core';
import { ChartType } from 'chart.js';
import { PieChartService } from './pie-chart.service';
@Component({
  selector: 'app-pie-chart',
  templateUrl: './pie-chart.component.html',
  styleUrls: ['./pie-chart.component.css']
})
export class PieChartComponent implements OnInit {

  pieChart: any;
  pieChartData: number[] = [];
  pieChartLabels: string[] = [];
  colors: any[] = [
    {
      backgroundColor: ['#26547c', "#ff6b6b", "#ffd166"]
    }
  ];
  pieChartType: ChartType = 'pie';

  constructor(private pieChartService: PieChartService) { }

  ngOnInit(): void {
    this.getFarmStatesData();
  }

  private getFarmStatesData() {
    this.pieChartService.getFarmStatesData().subscribe(
      (data) => {
        this.pieChart = {}
        for (let i=0;i<data.length;i++) {
          if (data[i] in this.pieChart) {
            this.pieChart[data[i]]+=1
          } else {
            this.pieChart[data[i]] = 1
          }
        }
        this.pieChartData = Object.values(this.pieChart);
        this.pieChartLabels = Object.keys(this.pieChart)
      },
      (error) => {
        console.log("Error Fetching States of all the Farms")
      }
    )
  }

}

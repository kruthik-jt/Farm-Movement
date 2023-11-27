import { Component, OnInit } from '@angular/core';
import { ChartType } from 'chart.js';
import { DonutChartService } from './donut-chart.service';

@Component({
  selector: 'app-donut-chart',
  templateUrl: './donut-chart.component.html',
  styleUrls: ['./donut-chart.component.css']
})
export class DonutChartComponent implements OnInit {

  donutChart: any;

  constructor(private donutChartService: DonutChartService) { }

  donutChartData: number[] = []
  donutChartLabels: string[] = []
  colors: any[] = [
    {
      backgroundColor: ['#26547c', "#ff6b6b", "#ffd166"]
    }
  ];
  donutChartType: ChartType = 'doughnut';

  ngOnInit(): void {
    this.getMovementReason();
  }

  private getMovementReason() {
    this.donutChartService.getFarmStatesData().subscribe(
      (data) => {
        this.donutChart = {}
        for (let i=0;i<data.length;i++) {
          if (data[i] in this.donutChart) {
            this.donutChart[data[i]]+=1
          } else {
            this.donutChart[data[i]] = 1
          }
        }
        this.donutChartData = Object.values(this.donutChart);
        this.donutChartLabels = Object.keys(this.donutChart)
      },
      (error) => {
        console.log("Error Fetching States of all the Farms")
      }
    )
  }

}

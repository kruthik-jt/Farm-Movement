import { Component, OnInit } from '@angular/core';
import { ChartType } from 'chart.js';

@Component({
  selector: 'app-donut-chart',
  templateUrl: './donut-chart.component.html',
  styleUrls: ['./donut-chart.component.css']
})
export class DonutChartComponent implements OnInit {

  constructor() { }

  donutChartData: number[] = [350, 450, 120]
  donutChartLabels: string[] = ['FarmA', 'FarmB', 'FarmC']
  colors: any[] = [
    {
      backgroundColor: ['#26547c', "#ff6b6b", "#ffd166"]
    }
  ];
  donutChartType: ChartType = 'doughnut';

  ngOnInit(): void {
  }

}

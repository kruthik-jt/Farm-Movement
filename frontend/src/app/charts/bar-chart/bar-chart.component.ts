import { Component, OnInit } from '@angular/core';
import { ChartType } from 'chart.js';
import { BarChartService } from './bar-chart.service';

@Component({
  selector: 'app-bar-chart',
  templateUrl: './bar-chart.component.html',
  styleUrls: ['./bar-chart.component.css']
})
export class BarChartComponent implements OnInit {

  barData: any[] = [];
  constructor(private barChartService: BarChartService) { }

  public barChartData: any[] = [
    {data: [], label:'Move In'},
    {data: [], label:'Move Out'}
  ];;
  public barChartLabels: string[] = [];
  public barChartType: ChartType = 'bar';
  public barChartLegend = true;
  public barChartOptions: any = {
    scaleShowVerticalLines: false,
    responsive: true,
    scales: {
      yAxes: [
        {
          ticks: {
            beginAtZero: true
          }
        }
      ]
    }
  }


  ngOnInit(): void {
    this.getBarGraphData();
  }

  private getBarGraphData() {
    this.barChartService.getBarChartData().subscribe(
      (data: any) => {
        let inData = data['IN']
        let inDataDic:any = {};
        let outDataDic:any = {};
        let outData = data['OUT']
        for (let i=0;i<inData.length;i++) {
          if (inData[i] in inDataDic) {
            inDataDic[inData[i]]+=1
          } else {
            inDataDic[inData[i]] = 1
          }
        }

        for (let i=0;i<outData.length;i++) {
          if (outData[i] in outDataDic) {
            outDataDic[outData[i]]+=1
          } else {
            outDataDic[outData[i]] = 1
          }
        }

        this.barChartLabels = Array.from(new Set((Object.keys(inDataDic)).concat(Object.keys(outDataDic))));
        this.barChartLabels.forEach(state => {
          this.barChartData[0].data.push(inDataDic[state]);
          this.barChartData[1].data.push(outDataDic[state]);
        });

      },
      (error) => {
        console.log("Error in retreiving State Movement Data")
      }
    )
  }

}

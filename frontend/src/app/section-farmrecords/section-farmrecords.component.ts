import { Component, OnInit } from '@angular/core';
import { SectionFarmrecordsService } from './section-farmrecords.service';

@Component({
  selector: 'app-section-farmrecords',
  templateUrl: './section-farmrecords.component.html',
  styleUrls: ['./section-farmrecords.component.css']
})
export class SectionFarmrecordsComponent implements OnInit {

  constructor(private farmRecordService: SectionFarmrecordsService) { }

  records: any = []

  ngOnInit(): void {
    this.getFarmRecords();
  }

  private getFarmRecords() {
    this.farmRecordService.getFarmRecords().subscribe(
      (data) => {
        data.forEach((farm) => {
          const farmRec:any = {}
          farmRec['id'] = farm[0];
          farmRec['farmName'] = farm[1];
          farmRec['premiseId'] = farm[2];
          farmRec['animalCount'] = farm[3];
          this.records.push(farmRec);
        });
      },
      (error) => {
        console.log("Error Fetching States of all the Farms")
      }
    )
  }

}

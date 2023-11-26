import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {ChartsModule} from 'ng2-charts'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { SectionDashboardComponent } from './section-dashboard/section-dashboard.component';
import { SectionFarmrecordsComponent } from './section-farmrecords/section-farmrecords.component';
import { RouterModule } from '@angular/router';
import { appRoutes } from 'src/routes';
import { BarChartComponent } from './charts/bar-chart/bar-chart.component';
import { PieChartComponent } from './charts/pie-chart/pie-chart.component';
import { DonutChartComponent } from './charts/donut-chart/donut-chart.component';
import { MapChartComponent } from './charts/map-chart/map-chart.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SidebarComponent,
    SectionDashboardComponent,
    SectionFarmrecordsComponent,
    BarChartComponent,
    PieChartComponent,
    DonutChartComponent,
    MapChartComponent,
  ],
  imports: [
    BrowserModule,
    ChartsModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

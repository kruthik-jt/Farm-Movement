import { Routes } from "@angular/router";
import { SectionDashboardComponent } from "./app/section-dashboard/section-dashboard.component";
import { SectionFarmrecordsComponent } from "./app/section-farmrecords/section-farmrecords.component";

export const appRoutes: Routes = [
  {path: 'dashboard', component: SectionDashboardComponent},
  {path: 'farmrecords', component: SectionFarmrecordsComponent},
  {path: '', redirectTo: '/dashboard', pathMatch: 'full'}
]

package com.jjx51.geotrack.Repository;

import com.jjx51.geotrack.Data.Model.StatusGeofenceModel;
import com.jjx51.geotrack.Data.Network.StatusGeofenceFirebase;

public class StatusGeofenceRepository {
   StatusGeofenceFirebase statusGeofenceFirebase= new StatusGeofenceFirebase();

   public void createData(StatusGeofenceModel statusGeofence) {
      statusGeofenceFirebase.createData(statusGeofence);
   }

   public void readData(){
      statusGeofenceFirebase.readData();
   }

}

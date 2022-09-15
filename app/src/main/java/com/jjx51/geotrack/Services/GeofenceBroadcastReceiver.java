package com.jjx51.geotrack.Services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.jjx51.geotrack.Data.Model.StatusGeofenceModel;
import com.jjx51.geotrack.Repository.StatusGeofenceRepository;

import java.util.List;

public class GeofenceBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = "GeofenceBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        GeofencingEvent geofencingEvent = GeofencingEvent.fromIntent(intent);

        if (geofencingEvent.hasError()) {
            Log.d(TAG, "onReceive: Error receiving geofence event...");
            return;
        }

        List<Geofence> geofenceList = geofencingEvent.getTriggeringGeofences();
        for (Geofence geofence: geofenceList) {
            Log.d(TAG, "onReceive: " + geofence.getRequestId());
        }
        Location location = geofencingEvent.getTriggeringLocation();
        //Toast.makeText(context, "Location latitud: "+location.getLatitude(), Toast.LENGTH_SHORT).show();
        //Toast.makeText(context, "Location longitude: "+location.getLongitude(), Toast.LENGTH_SHORT).show();

        StatusGeofenceModel statusGeofence= new StatusGeofenceModel(location.getLongitude(),location.getLatitude(),false);

        int transitionType = geofencingEvent.getGeofenceTransition();

        switch (transitionType) {
            case Geofence.GEOFENCE_TRANSITION_ENTER:
                Toast.makeText(context, "GEOFENCE_TRANSITION_ENTER", Toast.LENGTH_SHORT).show();
                statusGeofence.setActive(true);
                break;
            case Geofence.GEOFENCE_TRANSITION_DWELL:
                Toast.makeText(context, "GEOFENCE_TRANSITION_DWELL", Toast.LENGTH_SHORT).show();
                statusGeofence.setActive(true);
                break;
            case Geofence.GEOFENCE_TRANSITION_EXIT:
                Toast.makeText(context, "GEOFENCE_TRANSITION_EXIT", Toast.LENGTH_SHORT).show();
                break;
        }
        //Upload to firebase
        saveData(statusGeofence);
    }

    private void saveData(StatusGeofenceModel statusGeofence) {
        StatusGeofenceRepository statusGeofenceRepository = new StatusGeofenceRepository();
        statusGeofenceRepository.createData(statusGeofence);
    }

}
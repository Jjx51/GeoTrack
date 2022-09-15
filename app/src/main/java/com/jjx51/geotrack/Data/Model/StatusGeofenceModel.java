package com.jjx51.geotrack.Data.Model;

import com.google.type.DateTime;

public class StatusGeofenceModel {
    private double longitude;
    private double latitude;
    private boolean active;

    public StatusGeofenceModel() {
    }

    public StatusGeofenceModel(double longitude, double latitude,boolean active) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.active = active;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}

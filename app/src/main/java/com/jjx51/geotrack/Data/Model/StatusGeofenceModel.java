package com.jjx51.geotrack.Data.Model;

import com.google.type.DateTime;

class StatusGeofenceModel {
    private String id;
    private double longitude;
    private double latitude;
    private DateTime timeStamp;
    private boolean active;
    
    public StatusGeofenceModel() {
    }

    public StatusGeofenceModel(String id, double longitude, double latitude, DateTime timeStamp, boolean active) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.timeStamp = timeStamp;
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public DateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(DateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}

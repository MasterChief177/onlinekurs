class GeoPos {
    double latitude;
    double longitude;
    double altitude;

    public GeoPos(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public String toString() {
        return "GeoPosition:" +
                " Lat:" + this.latitude + " | " +
                "Long:" + this.longitude + " | " +
                "Alt:" + this.altitude
        ;
    }
}

class GeoCalculator {

    private static final double EARTH_RADIUS = 6371.0; // Radius der Erde in Kilometern

    public static double getDistance(GeoPos pos1, GeoPos pos2) {
        // Horizontale Distanz (Haversine-Formel)
        double lat1Rad = Math.toRadians(pos1.latitude);
        double horizontalDistance = getHorizontalDistance(pos1, pos2, lat1Rad);

        // Vertikale Distanz (Euklidischer Abstand)
        double verticalDistance = pos1.altitude - pos2.altitude;

        // Gesamte 3D-Distanz (Pythagoras)
        return Math.sqrt(horizontalDistance * horizontalDistance + verticalDistance * verticalDistance);
    }

    private static double getHorizontalDistance(GeoPos pos1, GeoPos pos2, double lat1Rad) {
        double lon1Rad = Math.toRadians(pos1.longitude);
        double lat2Rad = Math.toRadians(pos2.latitude);
        double lon2Rad = Math.toRadians(pos2.longitude);

        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return EARTH_RADIUS * c;
    }
}

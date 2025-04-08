import java.util.ArrayList;
import java.util.List;

public class FlightCalculator {

    static List<GeoPos> calculateFlight(List<GeoPos> geoPositions) {

        List<GeoPos> flightPositions = new ArrayList<>(geoPositions.size());

        // Position 0 als Startposition
        flightPositions.add(geoPositions.get(0));
        GeoPos currentPos = geoPositions.get(0);

        // Aus dem Array der noch anzufliegenden Positionen entfernen
        geoPositions.remove(0);

        do {
            double kleinsteDistanz = Double.MAX_VALUE;
            int kleinsteDistanzPos = 0;

            for (int i = 0; i < geoPositions.size(); i++) {

                GeoPos position = geoPositions.get(i);
                double distanz = GeoCalculator.getDistance(currentPos, position);
                if (distanz < kleinsteDistanz) {
                    kleinsteDistanz = distanz;
                    kleinsteDistanzPos = i;
                }

            }

            flightPositions.add(geoPositions.get(kleinsteDistanzPos));
            currentPos = geoPositions.get(kleinsteDistanzPos);

            geoPositions.remove(kleinsteDistanzPos);

        } while (!geoPositions.isEmpty());

        // Gibt das Array der angeflogenen Positionen zurück
        return flightPositions;
    }
}

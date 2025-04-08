import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<GeoPos> geoPositions = new ArrayList<>();

        geoPositions.add(new GeoPos(12.123123, 45.6456323, 20.4));
        geoPositions.add(new GeoPos(12.420000, 45.940000, 70.7));
        geoPositions.add(new GeoPos(12.360000, 45.880000, 60.9));
        geoPositions.add(new GeoPos(12.270000, 45.790000, 45.3));
        geoPositions.add(new GeoPos(12.180000, 45.700000, 21.2));
        geoPositions.add(new GeoPos(12.150000, 45.670000, 25.0));
        geoPositions.add(new GeoPos(12.330000, 45.850000, 55.6));
        geoPositions.add(new GeoPos(12.210000, 45.730000, 16.5));
        geoPositions.add(new GeoPos(12.240000, 45.760000, 40.1));
        geoPositions.add(new GeoPos(12.300000, 45.820000, 50.8));

        List<GeoPos> flightPath = FlightCalculator.calculateFlight(geoPositions);

        System.out.println("\n\nSortierter Array:");
        for (GeoPos pos : flightPath) {
            System.out.println(pos.toString());
        }

    }
}


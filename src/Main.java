import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Plant> plants = new ArrayList<>();

        // Alla växter läggs in i lista.
        plants.add(new Cactus(PlantHotelConstants.IGGE, PlantHotelConstants.IGGE_HEIGHT));
        plants.add(new Palm(PlantHotelConstants.LAURA, PlantHotelConstants.LAURA_HEIGHT));
        plants.add(new CarnivorousPlant(PlantHotelConstants.MEATLOAF, PlantHotelConstants.MEATLOAF_HEIGHT));
        plants.add(new Palm(PlantHotelConstants.OLOF, PlantHotelConstants.OLOF_HEIGHT));

        boolean running = true;

        // While fortsätter tills användaren väljer att avsluta.
        while (running) {

            System.out.println(PlantHotelConstants.QUESTION);
            String input = scanner.nextLine().trim();

            // kontrollerar om inmatningen är tom
            if (input.isEmpty()) {
                System.out.println(PlantHotelConstants.EMPTY_INPUT);
                continue;
            }

            String searchName = input.toLowerCase(Locale.ROOT);

            // hanterar avslutning
            if (searchName.equals(PlantHotelConstants.EXIT)) {
                running = false;
                System.out.println(PlantHotelConstants.EXIT_MESSAGE);
                continue;
            }

            // avvisar siffror
            if (input.matches(PlantHotelConstants.DIGIT_PATTERN)) {
                System.out.println(PlantHotelConstants.INVALID_INPUT);
                continue;
            }

            // tillåter endast bokstäver
            // avisar siffror mellanslag och specialtecken
            if (!input.matches(PlantHotelConstants.LETTER_PATTERN)) {
                System.out.println(PlantHotelConstants.INVALID_INPUT);
                continue;
            }


            Plant selectedPlant = null;

            switch (searchName) {

                case PlantHotelConstants.IGGE_SEARCH:
                    selectedPlant = plants.get(PlantHotelConstants.INDEX_IGGE);
                    break;

                case PlantHotelConstants.LAURA_SEARCH:
                    selectedPlant = plants.get(PlantHotelConstants.INDEX_LAURA);
                    break;

                case PlantHotelConstants.MEATLOAF_SEARCH:
                    selectedPlant = plants.get(PlantHotelConstants.INDEX_MEATLOAF);
                    break;

                case PlantHotelConstants.OLOF_SEARCH:
                    selectedPlant = plants.get(PlantHotelConstants.INDEX_OLOF);
                    break;

                default:
                    System.out.println(PlantHotelConstants.UNKNOWN_PLANT);
                    System.out.println(PlantHotelConstants.AVAILABLE_PLANTS);




            }
        }

            scanner.close();





    }
}
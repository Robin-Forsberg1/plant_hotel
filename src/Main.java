import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {


        ArrayList<Plant> plants = new ArrayList<>();

        // Polyformism: listan har typen plant men kan innehålla
        // olika subklasser, t.ex. Cactus, Palm, Carnivorousplant.
        plants.add(new Cactus(PlantHotelConstants.IGGE, PlantHotelConstants.IGGE_HEIGHT));
        plants.add(new Palm(PlantHotelConstants.LAURA, PlantHotelConstants.LAURA_HEIGHT));
        plants.add(new CarnivorousPlant(PlantHotelConstants.MEATLOAF, PlantHotelConstants.MEATLOAF_HEIGHT));
        plants.add(new Palm(PlantHotelConstants.OLOF, PlantHotelConstants.OLOF_HEIGHT));

        boolean running = true;

        JOptionPane.showMessageDialog(
                null, PlantHotelConstants.WELCOME
        );

        // While fortsätter tills användaren väljer att avsluta.
        while (running) {

            String input = JOptionPane.showInputDialog(
                    PlantHotelConstants.QUESTION
            );


            if (input == null) {
                break;
            }

            input = input.trim();

            // kontrollerar om inmatningen är tom
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, PlantHotelConstants.EMPTY_INPUT
                );
                continue;
            }

            String searchName = input.toLowerCase(Locale.ROOT);

            // avvisar siffror
            if (input.matches(PlantHotelConstants.DIGIT_PATTERN)) {
                JOptionPane.showMessageDialog(
                        null, PlantHotelConstants.INVALID_INPUT
                );
                continue;
            }

            // tillåter endast bokstäver
            // avisar siffror mellanslag och specialtecken
            if (!input.matches(PlantHotelConstants.LETTER_PATTERN)) {
                JOptionPane.showMessageDialog(
                        null, PlantHotelConstants.INVALID_INPUT
                );
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
                    JOptionPane.showMessageDialog(
                            null, PlantHotelConstants.UNKNOWN_PLANT
                    );
                    JOptionPane.showMessageDialog(
                            null, PlantHotelConstants.AVAILABLE_PLANTS
                    );


            }

            // Polyformism: Samma metodanrop ger olika resultat
            // beroende på vilken växttyp seclectedPlant refererar till.
            // Metoderna calculateLiquidAmount() och getLiquidType()
            // använder respektive underklass implemenation.
            if (selectedPlant != null) {
                JOptionPane.showMessageDialog(
                        null, selectedPlant.getLiquidInformation()
                );
            }

        }


    }
}
// Arv: plant är basklassen som innehåller gemensamma
// egenskaper från alla vätsker, t.ex. namn och höjd.
// Palm, Cactus och Carnivorousplant ärver från plant
public abstract class Plant implements IPlant {

    // Inkapsling: privata fält så att andra klasser
    // inte kan läsa dem direkt utan behöver getters
    // för att läsas utifrån.
    private String name;
    private double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public abstract double calculateLiquidAmount();

    public abstract LiquidType getLiquidType();


    public String getLiquidInformation() {
        return getName()
                + PlantHotelConstants.RESULT_SEPARATOR
                + calculateLiquidAmount()
                + PlantHotelConstants.LITER_UNIT
                + PlantHotelConstants.RESULT_SEPARATOR
                + getLiquidType();
    }


}

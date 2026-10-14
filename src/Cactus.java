public class Cactus extends Plant {

    // ARV: Cactus ärver namn och höjd från Plant
    public Cactus(String name, double height) {
        super(name, height);
    }


    public double calculateLiquidAmount() {
        return PlantHotelConstants.CACTUS_LITERS;
    }


    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}

public class Palm extends Plant{

    // ARV: Palm ärver namn och höjd från Plant.
    public Palm(String name, double height) {
        super(name, height);
    }

    public double calculateLiquidAmount() {
        return PlantHotelConstants.PALM_FACTOR * getHeight();
    }

    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }
}

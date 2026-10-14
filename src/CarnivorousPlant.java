public class CarnivorousPlant extends Plant {

    // ARV: CarnivorousPlant ärver namn och höjd från Plant.
    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }


    @Override
    public double calculateLiquidAmount() {
        return PlantHotelConstants.CARNIVOROUS_BASE + (PlantHotelConstants.CARNIVOROUS_FACTOR * getHeight());
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
public abstract class Plant implements IPlant {


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

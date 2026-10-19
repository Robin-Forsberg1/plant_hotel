// Interface: IPlant definerar vilka metoder en växt
// ska ha för att beräkna vätskemängd och vilken typ av
// vätska.
public interface IPlant {

    double calculateLiquidAmount();

    LiquidType getLiquidType();
}

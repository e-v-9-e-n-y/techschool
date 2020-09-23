package Task5p2.PcParts;

public class GraphicsCard {
    private String memoryType;
    private int memorySize;
    private GraphicsCoolingType coolingType;
    private String manufacturer;

    public GraphicsCard(String memoryType, int memorySize, GraphicsCoolingType coolingType, String manufacturer) {
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.coolingType = coolingType;
        this.manufacturer = manufacturer;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public GraphicsCoolingType getCoolingType() {
        return coolingType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "memoryType='" + memoryType + '\'' +
                ", memorySize=" + memorySize +
                ", coolingType=" + coolingType +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

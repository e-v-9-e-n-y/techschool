package Task5p2.PcParts;

public class Ram {
    private String memoryType;
    private int memorySize;
    private int memoryFrequency;
    private String manufacturer;

    public Ram(String memoryType, int memorySize, int memoryFrequency, String manufacturer) {
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.memoryFrequency = memoryFrequency;
        this.manufacturer = manufacturer;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getMemoryFrequency() {
        return memoryFrequency;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "memoryType='" + memoryType + '\'' +
                ", memorySize=" + memorySize +
                ", memoryFrequency=" + memoryFrequency +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

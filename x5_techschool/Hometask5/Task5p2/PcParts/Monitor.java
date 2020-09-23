package Task5p2.PcParts;

public class Monitor {
    private String manufacturer;
    private int Size;

    public Monitor(String manufacturer, int size) {
        this.manufacturer = manufacturer;
        Size = size;
    }

    public int getSize() {
        return Size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", Size=" + Size +
                '}';
    }
}

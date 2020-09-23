package Task5p2.PcParts;

public class Cpu {
    private int clockFrequency;
    private int coreCount;
    private int cacheSize;
    private String title;
    private String manufacturer;

    public Cpu(int clockFrequency, int coreCount, int cacheSize, String title, String manufacturer) {
        this.clockFrequency = clockFrequency;
        this.coreCount = coreCount;
        this.cacheSize = cacheSize;
        this.title = title;
        this.manufacturer = manufacturer;
    }

    public int getClockFrequency() {
        return clockFrequency;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public String getTitle() {
        return title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "clockFrequency=" + clockFrequency +
                ", coreCount=" + coreCount +
                ", cacheSize=" + cacheSize +
                ", title='" + title + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

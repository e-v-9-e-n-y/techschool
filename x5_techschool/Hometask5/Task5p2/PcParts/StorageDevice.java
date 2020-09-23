package Task5p2.PcParts;

public class StorageDevice {
    private int memorySize;
    private StorageType storageType;
    private String formFactor;
    private String manufacturer;

    public StorageDevice(int memorySize, StorageType storageType, String formFactor, String manufacturer) {
        this.memorySize = memorySize;
        this.storageType = storageType;
        this.formFactor = formFactor;
        this.manufacturer = manufacturer;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public StorageType getStorageType() {
        return storageType;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "StorageDevice{" +
                "memorySize=" + memorySize +
                ", storageType=" + storageType +
                ", formFactor='" + formFactor + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

package Task5p2.Strategies;

import Task5p2.PcParts.*;

public class GamerPcBuildStrategy implements PCBuilderStrategy {
    @Override
    public Cpu buildCpu() {
        return new Cpu(3700, 10, 12, "TheMostExpensiveGamerCpu", "TheMostFamousCpuManufacturer");
    }

    @Override
    public Ram buildRam() {
        return new Ram("DDR4", 32768, 25600, "TheMostFamousRamMemoryManufacturer");
    }

    @Override
    public GraphicsCard buildGraphicsCard() {
        return new GraphicsCard("GDDR6", 11264, GraphicsCoolingType.activeCooling, "TheMostFamousGraphicsManufacturer");
    }

    @Override
    public StorageDevice buildStorageDevice() {
        return new StorageDevice(4096, StorageType.ssd, "3,5\"", "TheMostFamousHddManufacturer");
    }

    @Override
    public Monitor buildMonitor() {
        return new Monitor("TheMostFamousMonitorManufacturer", 55);
    }
}

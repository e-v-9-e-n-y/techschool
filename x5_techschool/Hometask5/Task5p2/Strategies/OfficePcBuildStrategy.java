package Task5p2.Strategies;

import Task5p2.PcParts.*;

public class OfficePcBuildStrategy implements PCBuilderStrategy {
    @Override
    public Cpu buildCpu() {
        return new Cpu(3000, 4, 4, "AverageCpu", "TheMostFamousCpuManufacturer");
    }

    @Override
    public Ram buildRam() {
        return new Ram("DDR3", 8192, 10600, "TheMostFamousRamMemoryManufacturer");
    }

    @Override
    public GraphicsCard buildGraphicsCard() {
        return new GraphicsCard("DDR3", 2048, GraphicsCoolingType.activeCooling, "TheMostFamousGraphicsManufacturer");
    }

    @Override
    public StorageDevice buildStorageDevice() {
        return new StorageDevice(512, StorageType.hdd, "3,5\"", "TheMostFamousHddManufacturer");
    }

    @Override
    public Monitor buildMonitor() {
        return new Monitor("TheMostFamousMonitorManufacturer", 24);
    }
}

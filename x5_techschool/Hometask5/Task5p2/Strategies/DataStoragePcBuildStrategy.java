package Task5p2.Strategies;

import Task5p2.PcParts.*;

public class DataStoragePcBuildStrategy implements PCBuilderStrategy {
    @Override
    public Cpu buildCpu() {
        return new Cpu(1500, 2, 4, "LowCostCpu", "TheMostFamousCpuManufacturer");
    }

    @Override
    public Ram buildRam() {
        return new Ram("DDR3", 4096, 10600, "TheMostFamousRamMemoryManufacturer");
    }

    @Override
    public GraphicsCard buildGraphicsCard() {
        return new GraphicsCard("DDR2", 128, GraphicsCoolingType.passiveCooling, "TheMostFamousGraphicsManufacturer");
    }

    @Override
    public StorageDevice buildStorageDevice() {
        return new StorageDevice(32768, StorageType.sas, "3,5\"", "TheMostFamousHddManufacturer");
    }

    @Override
    public Monitor buildMonitor() {
        return new Monitor("какой-то древний монитор, который до этого много лет жил в шкафу", 19);
    }
}

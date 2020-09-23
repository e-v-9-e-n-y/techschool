package Task5p2.Strategies;

import Task5p2.PcParts.*;

public class ServerPcBuildStrategy implements PCBuilderStrategy {
    @Override
    public Cpu buildCpu() {
        return new Cpu(2500, 20, 32, "ServerMultiCoreCpu", "TheMostFamousCpuManufacturer");
    }

    @Override
    public Ram buildRam() {
        return new Ram("DDR4", 65536, 25600, "TheMostFamousRamMemoryManufacturer");
    }

    @Override
    public GraphicsCard buildGraphicsCard() {
        // будем майнить ))
        return new GraphicsCard("GDDR6", 11264, GraphicsCoolingType.activeCooling, "TheMostFamousGraphicsManufacturer");
    }

    @Override
    public StorageDevice buildStorageDevice() {
        return new StorageDevice(32768, StorageType.sas, "3,5\"", "TheMostFamousHddManufacturer");
    }

    @Override
    public Monitor buildMonitor() {
        // не нужен, поэтому null
        return null;
    }
}

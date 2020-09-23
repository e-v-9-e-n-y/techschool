package Task5p2.Strategies;

import Task5p2.PcParts.Cpu;
import Task5p2.PcParts.GraphicsCard;
import Task5p2.PcParts.Monitor;
import Task5p2.PcParts.Ram;
import Task5p2.PcParts.StorageDevice;

public interface PCBuilderStrategy {
    public Cpu buildCpu();

    public Ram buildRam();

    public GraphicsCard buildGraphicsCard();

    public StorageDevice buildStorageDevice();

    public Monitor buildMonitor();
}

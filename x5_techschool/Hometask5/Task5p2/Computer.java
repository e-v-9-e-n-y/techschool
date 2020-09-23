package Task5p2;

import Task5p2.PcParts.*;
import Task5p2.Strategies.PCBuilderStrategy;

public class Computer {
    private Cpu cpu;
    private Ram ram;
    private GraphicsCard graphicsCard;
    private StorageDevice storageDevice;
    private Monitor monitor;

    public Computer(PCBuilderStrategy builderStrategy) {
        cpu = builderStrategy.buildCpu();
        ram = builderStrategy.buildRam();
        graphicsCard = builderStrategy.buildGraphicsCard();
        storageDevice = builderStrategy.buildStorageDevice();
        monitor = builderStrategy.buildMonitor();
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public StorageDevice getStorageDevice() {
        return storageDevice;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Computer{" + "\n" +
                "cpu=" + cpu + "\n" +
                ", ram=" + ram + "\n" +
                ", graphicsCard=" + graphicsCard + "\n" +
                ", storageDevice=" + storageDevice + "\n" +
                ", monitor=" + monitor + "\n" +
                '}';
    }
}

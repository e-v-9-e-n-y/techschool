package Task5p2;

import Task5p2.Strategies.DataStoragePcBuildStrategy;
import Task5p2.Strategies.GamerPcBuildStrategy;
import Task5p2.Strategies.OfficePcBuildStrategy;
import Task5p2.Strategies.ServerPcBuildStrategy;

public class Task5p2 {
    public static void main(String[] args) {
        Computer dataStoragePc = new Computer(new DataStoragePcBuildStrategy());
        Computer gamerPc = new Computer(new GamerPcBuildStrategy());
        Computer officePc = new Computer(new OfficePcBuildStrategy());
        Computer serverPc = new Computer(new ServerPcBuildStrategy());

        System.out.println("DataStoragePC config is:" + dataStoragePc.toString());
        System.out.println("GamerPC config is:" + gamerPc.toString());
        System.out.println("OfficePC config is:" + officePc.toString());
        System.out.println("ServerPC config is:" + serverPc.toString());
    }
}

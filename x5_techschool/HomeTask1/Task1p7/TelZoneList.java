package Task1p7;

import java.util.HashMap;

public class TelZoneList {
    private HashMap<Integer, RegionTelInfo> phoneCodes = new HashMap<Integer, RegionTelInfo>();

    private void addRegionToMap(RegionTelInfo pRegion) {
        phoneCodes.put(pRegion.getRegCode(), pRegion);
    }

    private void initRegionTelephoneCodes() {
        // задаём регионы и их коды
        addRegionToMap(new RegionTelInfo(905, "Москва", 415, 100));
        addRegionToMap(new RegionTelInfo(194, "Ростов", 198, 100));
        addRegionToMap(new RegionTelInfo(491, "Краснодар", 269, 100));
        addRegionToMap(new RegionTelInfo(800, "Киров", 269, 100));
    }

    public void processCode(int pCode) {
        //
        RegionTelInfo vReg = phoneCodes.get(pCode);
        if (vReg == null) {
            System.out.print( "Не удалось найти регион, соответствующий заданному коду " + pCode);
        }
        else {
           System.out.print(vReg.getRegName() +  ". Стоимость разговора " + vReg.getCost(10) + " руб.");
        }
    }

    public TelZoneList() {
        initRegionTelephoneCodes();
    }
}

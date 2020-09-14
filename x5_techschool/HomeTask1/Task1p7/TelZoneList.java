package Task1p7;

public class TelZoneList {

    private RegionTelInfo getRegion(int code) {
        switch (code) {
            case (905): {
                return new RegionTelInfo(905, "Москва", 415, 100);
            }
            case (194): {
                return new RegionTelInfo(194, "Ростов", 198, 100);
            }
            case (491): {
                return new RegionTelInfo(491, "Краснодар", 269, 100);
            }
            case (800): {
                return new RegionTelInfo(800, "Киров", 269, 100);
            }
            default: {
                return null;
            }
        }
    }

    public void processCode(int code) {
        //
        RegionTelInfo reg = getRegion(code);
        if (reg == null) {
            System.out.print("Не удалось найти регион, соответствующий заданному коду " + code);
        } else {
            System.out.print(reg.getRegName() + ". Стоимость разговора " + reg.getCost(10) + " руб.");
        }
    }

    public TelZoneList() {
    }
}

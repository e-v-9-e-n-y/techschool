package Task1p7;

public class RegionTelInfo {
    private final Integer regCode;
    private final String regName;
    private final Integer regPrice;
    private final Integer regDivisor;

    public RegionTelInfo(Integer regCode, String regName, Integer regPrice, Integer regDivisor) {
        this.regCode = regCode;
        this.regName = regName;
        this.regPrice = regPrice;
        this.regDivisor = regDivisor;
    }

    public double getCost(int minuteCount) {
        return (double) minuteCount * regPrice / regDivisor;
    }

    public String getRegName() {
        return regName;
    }

    public Integer getRegPrice() {
        return regPrice;
    }

    public Integer getRegDivisor() {
        return regDivisor;
    }

    public Integer getRegCode() {
        return regCode;
    }
}

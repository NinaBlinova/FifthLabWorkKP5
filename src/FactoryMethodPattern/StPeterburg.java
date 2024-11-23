package FactoryMethodPattern;

public class StPeterburg extends DutyFree{
    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public int getBonusPoints() {
        return 0;
    }

    @Override
    public String getConditions() {
        return "";
    }
}

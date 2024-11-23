package FactoryMethodPattern;

public abstract class DutyFree {
    // Метод для получения скидки
    public abstract double getDiscount();

    // Метод для получения количества бонусов
    public abstract int getBonusPoints();

    // Метод для получения условий применения скидки и бонусов
    public abstract String getConditions();
}

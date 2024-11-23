package FactoryMethodPattern;

public abstract class LoyaltyProgram {

    protected double cashAvailable; // Наличные
    protected double cardBalance;    // Баланс на карте
    protected double ticketPrice;     // Цена билета

    public LoyaltyProgram(double cashAvailable, double cardBalance, double ticketPrice) {
        this.cashAvailable = cashAvailable;
        this.cardBalance = cardBalance;
        this.ticketPrice = ticketPrice;
    }

    // Метод для расчета скидки
    public abstract double calculateDiscount();

    // Метод для расчета бонусов
    public abstract int calculateBonusPoints();

    // Метод для получения условий применения программы
    public abstract String getConditions();

}

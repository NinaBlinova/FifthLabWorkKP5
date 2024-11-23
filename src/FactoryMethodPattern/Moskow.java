package FactoryMethodPattern;

public class Moskow extends DutyFree {

    private double cashAvailable; // Наличные средства
    private double cardBalance;    // Деньги на карте
    private double ticketPrice;    // Цена билета
    LoyaltyProgram loyaltyProgram = null;
    public String airportName;    // Название аэропорта

    public Moskow(double cashAvailable, double cardBalance, double ticketPrice, String airportName) {
        this.cashAvailable = cashAvailable;
        this.cardBalance = cardBalance;
        this.ticketPrice = ticketPrice;
        this.airportName = airportName;
    }

    public void create(String airportName) {
        // Сравниваем строку с названиями аэропортов
        if (airportName.equalsIgnoreCase("Domodedovo")) {
            loyaltyProgram = new Domodedovo(cashAvailable, cardBalance, ticketPrice);
        } else if (airportName.equalsIgnoreCase("Sheremetyevo")) {
            loyaltyProgram = new Sheremetyevo(cashAvailable, cardBalance, ticketPrice);
        } else if (airportName.equalsIgnoreCase("Vnukovo")) {
            loyaltyProgram = new Vnukovo(cashAvailable, cardBalance, ticketPrice);
        }
    }

    @Override
    public double getDiscount() {
        return loyaltyProgram.calculateDiscount();
    }

    @Override
    public int getBonusPoints() {
        return loyaltyProgram.calculateBonusPoints();
    }

    @Override
    public String getConditions() {
        return loyaltyProgram.getConditions();
    }
}

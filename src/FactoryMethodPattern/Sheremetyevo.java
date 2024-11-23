package FactoryMethodPattern;

public class Sheremetyevo extends LoyaltyProgram {
    public Sheremetyevo(double cashAvailable, double cardBalance, double ticketPrice) {
        super(cashAvailable, cardBalance, ticketPrice);
    }

    @Override
    public double calculateDiscount() {
        // Условия для расчета скидки
        if (cashAvailable >= 15000 && ticketPrice >= 30000) {
            return 20.0; // Скидка 20% для клиентов с наличными от 15,000 и ценой билета от 30,000
        } else if (cardBalance >= 20000) {
            return 15.0; // Скидка 15% для клиентов с балансом на карте от 20,000
        } else if (cashAvailable >= 8000 || cardBalance >= 8000) {
            return 10.0; // Скидка 10% для клиентов с наличными или балансом от 8,000
        }
        return 0; // Без скидки
    }

    @Override
    public int calculateBonusPoints() {
        // Условия для начисления бонусов
        if (ticketPrice >= 25000) {
            return (int) (ticketPrice / 100) * 3; // 3 бонусных балла за каждые 100 рублей при цене билета от 25,000
        } else if (ticketPrice >= 15000) {
            return (int) (ticketPrice / 100) * 2; // 2 бонусных балла за каждые 100 рублей при цене билета от 15,000
        }
        return 0; // Без бонусов
    }

    @Override
    public String getConditions() {
        return "Скидка: 20% при наличии более 15,000 рублей наличными и цене билета от 30,000 рублей;\n" +
                "Скидка: 15% при наличии более 20,000 рублей на карте;\n" +
                "Скидка: 10% при наличии более 8,000 рублей наличными или на карте;\n" +
                "Бонусные баллы: 3 балла за каждые 100 рублей при цене билета от 25,000 рублей;\n" +
                "Бонусные баллы: 2 балла за каждые 100 рублей при цене билета от 15,000 рублей.";
    }
}

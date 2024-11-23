package FactoryMethodPattern;

public class Vnukovo extends LoyaltyProgram {
    public Vnukovo(double cashAvailable, double cardBalance, double ticketPrice) {
        super(cashAvailable, cardBalance, ticketPrice);
    }

    @Override
    public double calculateDiscount() {
        // Условия для расчета скидки
        if (cashAvailable >= 20000 || cardBalance >= 20000) {
            return 15.0; // Скидка 15% для клиентов с наличными или балансом от 20,000
        } else if (cashAvailable >= 15000 || cardBalance >= 15000) {
            return 10.0; // Скидка 10% для клиентов с наличными или балансом от 15,000
        }
        return 0; // Без скидки
    }

    @Override
    public int calculateBonusPoints() {
        // Условия для начисления бонусов
        if (ticketPrice >= 20000) {
            return (int) (ticketPrice / 100) * 5; // 5 бонусных баллов за каждые 100 рублей при цене билета от 20,000
        } else if (ticketPrice >= 10000) {
            return (int) (ticketPrice / 100); // 1 бонусных балла за каждые 100 рублей при цене билета от 10,000
        }
        return 0; // Без бонусов
    }

    @Override
    public String getConditions() {
        return "Скидка: 25% при наличии более 1000 бонусных баллов;\n" +
                "Скидка: 15% при наличии более 500 бонусных баллов;\n" +
                "Скидка: 5% при наличии более 100 бонусных баллов;\n" +
                "Бонусные баллы: 5 баллов за каждые 100 рублей при цене билета от 20,000 рублей;\n" +
                "Бонусные баллы: 3 балла за каждые 100 рублей при цене билета от 10,000 рублей.";
    }
}

package FactoryMethodPattern;

public class PulkovoA extends LoyaltyProgram {
    public PulkovoA(double cashAvailable, double cardBalance, double ticketPrice) {
        super(cashAvailable, cardBalance, ticketPrice);
    }

    @Override
    public double calculateDiscount() {
        // Условия для расчета скидки
        if (cashAvailable >= 50000 || cardBalance >= 50000) {
            return 15.0; // Скидка 15% для клиентов с наличными или балансом от 50,000
        } else if (cashAvailable >= 20000 || cardBalance >= 20000) {
            return 10.0; // Скидка 10% для клиентов с наличными или балансом от 20,000
        }
        return 0; // Без скидки
    }

    @Override
    public int calculateBonusPoints() {
        // Условия для начисления бонусов
        if (ticketPrice >= 30000) {
            return (int) (ticketPrice / 100) * 6; // 6 бонусных баллов за каждые 100 рублей при цене билета от 30,000
        } else if (ticketPrice >= 20000) {
            return (int) (ticketPrice / 100) * 4; // 4 бонусных балла за каждые 100 рублей при цене билета от 20,000
        } else if (ticketPrice >= 10000) {
            return (int) (ticketPrice / 100) * 2; // 2 бонусных балла за каждые 100 рублей при цене билета от 10,000
        }
        return 0; // Без бонусов
    }

    @Override
    public String getConditions() {
        return "Скидка: 15% при наличии более 50000 рублей как на карте, так и наличкой;\n" +
                "Скидка: 10% при наличии более 20000 рублей как на карте, так и наличкой;\n" +
                "Бонусные баллы: 6 баллов за каждые 100 рублей при цене билета от 30,000 рублей;\n" +
                "Бонусные баллы: 4 балла за каждые 100 рублей при цене билета от 20,000 рублей;\n" +
                "Бонусные баллы: 2 балла за каждые 100 рублей при цене билета от 10,000 рублей.";
    }
}

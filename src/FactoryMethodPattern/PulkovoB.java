package FactoryMethodPattern;

public class PulkovoB extends LoyaltyProgram {
    public PulkovoB(double cashAvailable, double cardBalance, double ticketPrice) {
        super(cashAvailable, cardBalance, ticketPrice);
    }

    @Override
    public double calculateDiscount() {
        // Условия для расчета скидки
        if (cashAvailable >= 25000 || cardBalance >= 25000) {
            return 5.0; // Скидка 15% для клиентов с наличными или балансом от 50,000
        } else if (cashAvailable >= 15000 || cardBalance >= 15000) {
            return 2.0; // Скидка 10% для клиентов с наличными или балансом от 20,000
        }
        return 0; // Без скидки
    }

    @Override
    public int calculateBonusPoints() {
        // Условия для начисления бонусов
        if (ticketPrice >= 30000) {
            return (int) (ticketPrice / 100) * 3; // 3 бонусных баллов за каждые 100 рублей при цене билета от 30,000
        } else if (ticketPrice >= 20000) {
            return (int) (ticketPrice / 100) * 2; // 2 бонусных балла за каждые 100 рублей при цене билета от 20,000
        } else if (ticketPrice >= 10000) {
            return (int) (ticketPrice / 100); // 1 бонусных балла за каждые 100 рублей при цене билета от 10,000
        }
        return 0; // Без бонусов
    }

    @Override
    public String getConditions() {
        return "Скидка: 5% при наличии более 25000 рублей как на карте, так и наличкой;\n" +
                "Скидка: 2% при наличии более 15000 рублей как на карте, так и наличкой;\n" +
                "Бонусные баллы: 3 баллов за каждые 100 рублей при цене билета от 30,000 рублей;\n" +
                "Бонусные баллы: 2 балла за каждые 100 рублей при цене билета от 20,000 рублей;\n" +
                "Бонусные баллы: 1 балла за каждые 100 рублей при цене билета от 10,000 рублей.";
    }
}

package FactoryMethodPattern;

public class Domodedovo extends LoyaltyProgram {

    public Domodedovo(double cashAvailable, double cardBalance, double ticketPrice) {
        super(cashAvailable, cardBalance, ticketPrice);
    }

    @Override
    public double calculateDiscount() {
        // Условия для расчета скидки
        if (cashAvailable >= 10000 && cardBalance >= 10000) {
            return 15.0; // Скидка 15% для клиентов с наличными или балансом от 10,000
        } else if (cashAvailable >= 5000 && cardBalance >= 5000) {
            return 10.0; // Скидка 10% для клиентов с наличными или балансом от 5,000
        }
        return 0; // Без скидки
    }

    @Override
    public int calculateBonusPoints() {
        // Условия для начисления бонусов
        if (ticketPrice >= 20000) {
            return (int) (ticketPrice / 100) * 2; // 2 бонусных балла за каждые 100 рублей при цене билета от 20,000
        } else if (ticketPrice >= 10000) {
            return (int) (ticketPrice / 100); // 1 бонусный балл за каждые 100 рублей при цене билета от 10,000
        }
        return 0; // Без бонусов
    }

    @Override
    public String getConditions() {
        return "Скидка: 15% при наличии более 10,000 рублей наличными или на карте;\n" +
                "Скидка: 10% при наличии более 5,000 рублей;\n" +
                "Бонусные баллы: 2 балла за каждые 100 рублей при цене билета от 20,000 рублей;\n" +
                "Бонусные баллы: 1 балл за каждые 100 рублей при цене билета от 10,000 рублей.";
    }
}

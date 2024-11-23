import FactoryMethodPattern.Domodedovo;
import FactoryMethodPattern.Moskow;
import FactoryMethodPattern.StPeterburg;

public class Main {
    public static void main(String[] args) {
        Moskow moskowAirport = new Moskow(10000, 7000, 100000, "Sheremetyevo");
        moskowAirport.create(moskowAirport.airportName);
        System.out.println("Аэропорт: " + moskowAirport.airportName);
        System.out.println("Скидка: " + moskowAirport.getDiscount());
        System.out.println("Бонусы: " + moskowAirport.getBonusPoints());
        System.out.println(moskowAirport.getConditions());
        System.out.println("--------------------------");

        Moskow moskowAirport2 = new Moskow(33000, 2000, 40000, "Domodedovo");
        moskowAirport2.create(moskowAirport2.airportName);
        System.out.println("Аэропорт: " + moskowAirport2.airportName);
        System.out.println("Скидка: " + moskowAirport2.getDiscount());
        System.out.println("Бонусы: " + moskowAirport2.getBonusPoints());
        System.out.println(moskowAirport2.getConditions());
        System.out.println("--------------------------");


        Moskow moskowAirport3 = new Moskow(15000, 44000, 78000, "Vnukovo");
        moskowAirport3.create(moskowAirport3.airportName);
        System.out.println("Аэропорт: " + moskowAirport3.airportName);
        System.out.println("Скидка: " + moskowAirport3.getDiscount());
        System.out.println("Бонусы: " + moskowAirport3.getBonusPoints());
        System.out.println(moskowAirport3.getConditions());
        System.out.println("--------------------------");

        StPeterburg stPeterburg = new StPeterburg(11000, 7000, 66000, "PulkovoA");
        stPeterburg.create(stPeterburg.airportName);
        System.out.println("Аэропорт: " + stPeterburg.airportName);
        System.out.println("Скидка: " + stPeterburg.getDiscount());
        System.out.println("Бонусы: " + stPeterburg.getBonusPoints());
        System.out.println(stPeterburg.getConditions());
        System.out.println("--------------------------");


        StPeterburg stPeterburg2 = new StPeterburg(50000, 5000, 11000, "PulkovoB");
        stPeterburg2.create(stPeterburg2.airportName);
        System.out.println("Аэропорт: " + stPeterburg2.airportName);
        System.out.println("Скидка: " + stPeterburg2.getDiscount());
        System.out.println("Бонусы: " + stPeterburg2.getBonusPoints());
        System.out.println(stPeterburg2.getConditions());
        System.out.println("--------------------------");
    }
}
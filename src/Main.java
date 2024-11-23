import FactoryMethodPattern.Domodedovo;
import FactoryMethodPattern.Moskow;

public class Main {
    public static void main(String[] args) {
        Moskow moskowAirport = new Moskow(10000, 7000, 100000, "Sheremetyevo");
        moskowAirport.create(moskowAirport.airportName);
        System.out.println(moskowAirport.getDiscount());
        System.out.println(moskowAirport.getBonusPoints());
        System.out.println(moskowAirport.getConditions());
    }
}
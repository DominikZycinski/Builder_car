package pl.zycinski;

/**
 * @author Dominik Zycinski
 * @version 1.01, 25/03/2018
 * @see java.util
 * @since 1.2
 */

public class TestBuilder {
    /**Main method*
     *@param args  command-line arguments*/
    public static void main(String[] args) {
        Car Punto = new Car.Builder("Fiat", "Punto")
                .FuelType(FuelType.Diesel)
                .TypeOfCar(TypeOfCar.CityCars)
                .carModelYear(2006)
                .colorCar("Blue")
                .carMilleage(200000)
                .airConditioning(true)
                .carRadio(true)
                .electricWindows(true)
                .heatedSeats(false)
                .gps(false)
                .parkAssistant(false)
                .build();
        System.out.println(Punto);

        Car Carnival = new Car.Builder("Kia", "Carnival")
                .FuelType(FuelType.Diesel)
                .TypeOfCar(TypeOfCar.Suv)
                .carModelYear(2009)
                .colorCar("Gold")
                .carMilleage(100000)
                .airConditioning(true)
                .carRadio(true)
                .electricWindows(true)
                .heatedSeats(true)
                .gps(true)
                .parkAssistant(true)
                .build();
        System.out.println(Carnival);



    }
}

package pl.zycinski;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dominik Zycinski
 * @version 1.01, 25/03/2018
 * @see java.util
 * @since 1.2
 */

/**The class that represents Car*/
public class Car {
    /**Information about the car*/
    private String make;
    private String model;
    private int modelYear;
    private int carMileage;
    private FuelType fuelType;
    private TypeOfCar typeOfCar;
    private String color;
    private boolean heatedSeats;
    private boolean electricWindows;
    private boolean parkAssistant;
    private boolean airConditioning;
    private boolean gps;
    private boolean carRadio;

    /**Private constructor*/
    private Car() {
    }


    public static class Builder {
        /**Obligatory attribute*/
        private String make;
        private String model ;

        /**Optional attribute*/
        private FuelType fuelType = FuelType.Diesel;
        private TypeOfCar typeOfCar = TypeOfCar.Coupe;
        private int modelYear = 1996;
        private int carMileage = 0;
        private String color = "";
        private boolean heatedSeats = false;
        private boolean electricWindows = false;
        private boolean parkAssistant = false;
        private boolean airConditioning = false;
        private boolean gps = false;
        private boolean carRadio = false;


        /**Constructor with necessary parameters
         * @param make Make of your car
         * @param model Model of your car*/
        public Builder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        /**Car model year
         * @param model_year car model year of your car
         * @return Builder with parameters about car */
        public Builder carModelYear(int model_year) {
            this.modelYear = model_year;
            return this;
        }

        /**Car milleage
         * @param carMileage car milleage of your car
         * @return Builder with parameters about car */
        public Builder carMilleage(int carMileage) {
            this.carMileage = carMileage;
            return this;
        }

        /**Type of car
         * @param typeOfCar type of your car which is an enumerated type*
         * @return Builder with parameters about car */
        public Builder TypeOfCar(TypeOfCar typeOfCar) {
            this.typeOfCar = typeOfCar;
            return this;
        }

        /**Fuel type
         * @param fuelType fuel type of your car which is an enumerated type*
         * @return Builder with parameters about car */
        public Builder FuelType(FuelType fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        /**Color car
         * @param color color of your car
         * @return Builder with parameters about car */
        public Builder colorCar(String color) {
            this.color = color;
            return this;
        }

        /**Heated seats
         * @param equipment true if your car have heated seats, false if your car do not have them
         * @return Builder with parameters about car */
        public Builder heatedSeats(boolean equipment) {
            this.heatedSeats = equipment;
            return this;
        }

        /**Electric windows
         * @param equipment true if your car have electric windows, false if your car do not have them
         * @return Builder with parameters about car */
        public Builder electricWindows(boolean equipment) {
            this.electricWindows = equipment;
            return this;
        }

        /**Park assistans
         * @param equipment true if your car have park assistans, false if your car do not have it
         * @return Builder with parameters about car */
        public Builder parkAssistant(boolean equipment) {
            this.parkAssistant = equipment;
            return this;
        }

        /**Air conditioning
         * @param equipment true if your car have air conditioning, false if your car do not have it
         * @return Builder with parameters about car */
        public Builder airConditioning(boolean equipment) {
            this.airConditioning = equipment;
            return this;
        }

        /**GPS
         * @param equipment true if your car have gps, false if your car do not have it
         * @return Builder with parameters about car */
        public Builder gps(boolean equipment) {
            this.gps = equipment;
            return this;
        }


        /**Car radio
         * @param equipment true if your car have car radio, false if your car do not have it
         * @return Builder with parameters about car */
        public Builder carRadio(boolean equipment) {
            this.carRadio = equipment;
            return this;
        }

        /**Constructor with parameters of your car based on builder
         * @return Parameters of your car*/
        public Car build() {
            Car car = new Car();
            car.make = this.make;
            car.model = this.model;
            car.fuelType = this.fuelType;
            car.typeOfCar = this.typeOfCar;
            car.modelYear = this.modelYear;
            car.carMileage = this.carMileage;
            car.color = this.color;
            car.heatedSeats = this.heatedSeats;
            car.electricWindows = this.electricWindows;
            car.parkAssistant = this.parkAssistant;
            car.airConditioning = this.airConditioning;
            car.gps = this.gps;
            car.carRadio = this.carRadio;
            return car;
        }
    }

        /**Method returns description of car*/
        @Override
        public String toString() {
            List<String> equipment = new ArrayList<>();
            if (heatedSeats) {
                equipment.add("Heated Seats");
            }
            if (electricWindows) {
                equipment.add("Electric Windows");
            }
            if (parkAssistant) {
                equipment.add("Park Assistant");
            }
            if (airConditioning) {
                equipment.add("Air conditioning");
            }
            if (gps) {
                equipment.add("GPS");
            }
            if (carRadio) {
                equipment.add("Car Radio");
            }
          return String.format("Car: %n"
                          + "Make:  %s%n"
                          + "Model: %s%n"
                          + "Fuel type: %s%n"
                          + "Type ofCar: %s%n"
                          + "Model Year: %s%n"
                          + "Car milleage: %s km%n"
                          + "Color: %s%n"
                          + "Car equipment: %s%n",

                    make,model,fuelType,typeOfCar,modelYear,carMileage,color,equipment);


        }

}


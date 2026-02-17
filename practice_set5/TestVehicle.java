abstract class vehicle {
    abstract String fuelType();
    abstract int wheels();
}

class car extends vehicle {
    public String fuelType(){
        return "Petrol or Diesel";
    }

    public int wheels(){
        return 4;
    }
}

class bike extends vehicle {
    public String fuelType(){
        return "Petrol";
    }

    public int wheels(){
        return 2;
    }
}
public class TestVehicle {
    public static void main(String[] args){
        car myCar = new car();
        bike myBike = new bike();

        System.out.println("Car Fuel Type: " + myCar.fuelType());
        System.out.println("Car Wheels: " + myCar.wheels());

        System.out.println("Bike Fuel Type: " + myBike.fuelType());
        System.out.println("Bike Wheels: " + myBike.wheels());
    }
    
}

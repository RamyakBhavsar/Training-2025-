import java.util.Scanner;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops with brakes.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a button.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops with hand brakes.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vehicle type (Car/Bike): ");
        String vehicleType = scanner.nextLine();

        Vehicle vehicle;
        if (vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car();
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            vehicle = new Bike();
        } else {
            System.out.println("Unknown vehicle type!");
            return;
        }

        vehicle.start();
        vehicle.stop();
    }
}


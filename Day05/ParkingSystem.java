package Day05;

public class ParkingSystem {
    /*
     * Parking System
     * This class implements a parking system that can hold a certain number of cars of different types.
     * It has three types of parking slots: big, medium, and small. 
     * The class provides a method to add a car of a specific type to the parking system.
     * If the parking slot for that type is available, it decrements the count of that type and returns true.
     * If the parking slot is full, it returns false.
     */
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public  boolean addCar(int carType) {
        /*
         * This method adds a car of a specific type to the parking system.
         * It checks if there is an available slot for the car type and decrements the count if successful.
         * Returns true if the car was added, false otherwise.
         */
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
        } else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
        }
        return false;
    }
}

class Client {
    // This class contains the main method to test the ParkingSystem class.
    // It initializes a ParkingSystem object with a specific number of slots for each car type
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        
        System.out.println(parkingSystem.addCar(3)); 
        System.out.println(parkingSystem.addCar(2)); 
        System.out.println(parkingSystem.addCar(3)); 
        System.out.println(parkingSystem.addCar(1));
    }
}
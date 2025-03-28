
import java.util.ArrayList;
// Imports the ArrayList class, which provides a resizable array implementation

import java.util.HashMap;
// Imports the HashMap class, which implements the Map interface using a hash table.

import java.util.Scanner;
import java.util.Random;


public class Main {

        // Static lists and maps for saving the data
        private static ArrayList<Flight> flights = new ArrayList<>();
        private static HashMap<String, Booking> bookings = new HashMap<>();
        private static Scanner scanner = new Scanner (System.in);
        private static Random random = new Random();

        public static void main(String[] args) {

                initializeFlights();

                boolean running = true;

                System.out.println("Welcome to your Flight Booking App!");

                while (running) {


                }
        }


        // Initiate the system with sample-flights
        private static void initializeFlights () {
                // Creating some sample-flights
                flights.add
                        (new Flight("SK1429", "Stockholm", "Köpenhamn", "2025-03-28", "10:30", 150, 899.00));
                flights.add
                        (new Flight("SK1430", "Köpenhamn", "Stockholm", "2025-03-15", "13:00", 150, 899.00));
                flights.add
                        (new Flight("BA777", "Stockholm", "London", "2025-02-15", "08:45", 200, 1599.00));
                flights.add
                        (new Flight("BA778", "London", "Stockholm", "2025-01-15", "11:30", 200, 1499.00));
                flights.add
                        (new Flight("KL1109", "Amsterdam", "Stockholm", "2025-02-15", "16:10", 180, 1299.00));
                flights.add
                        (new Flight("KL1110", "Stockholm", "Amsterdam", "2025-02-15", "19:30", 180, 1299.00));
        }

}

import java.awt.print.Book;
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
                        displayMenu();
                        int choice = getIntInput ("Choose: ");

                        switch (choice) {
                                case 1:
                                        displayAllFlights();
                                        break;
                                case 2:
                                        makeBooking();
                                        break;

                        }

                }
        }

        // Show all available flights
        private static void displayAllFlights() {
                System.out.println("\n===== Available Flights =====");

                if (flights.isEmpty()) {
                        System.out.println("No Flights Available");
                } else {
                        for (int i = 0; i < flights.size(); i++) {
                                System.out.println("\n[" + (i+1) + "] " + flights.get(i));
                        }
                }
        }

        // Manage flight booking
        private static void makeBooking() {
                System.out.println("\n===== Book Your Flight =====");

                // Show all flights
                displayAllFlights();

                // Choose the flight
                int flightIndex = getIntInput("\nChoose the flight (1-" + flights.size() + "): ") - 1;

                if (flightIndex < 0 || flightIndex >= flights.size()) {
                        System.out.println("Invalid Choice.");
                        return;
                }

                Flight selectedFlight = flights.get(flightIndex);

                if (!selectedFlight.hasAvailableSeats()) {
                        System.out.println("Sorry, This flight is fully booked!");
                        return;
                }

                // Collect passenger data
                scanner.nextLine();             // Cleaning the buffer

                System.out.println("Name: ");
                String name = scanner.nextLine();

                System.out.println("E-mail: ");
                String email = scanner.nextLine();

                // Number of seats
                int seats = getIntInput("Number of seats you need to book: ");

                if (seats <= 0) {
                        System.out.println("Number of seats has to be positive.");
                        return;
                }

                if (seats > selectedFlight.getAvailableSeats()) {
                        System.out.println("Not enough seats on this flight. This flight has "
                        + selectedFlight.getAvailableSeats() + " available seats.");

                        return;
                }


                // Book the seats on the flight
                boolean booked = selectedFlight.bookSeats(seats);

                if (booked) {
                        // We need to create the Booking Reference
                        String reference = generateBookingReference();

                        // Create the booking
                        Booking booking = new Booking(reference, selectedFlight, name, email, seats);
                        bookings.put(reference, booking);

                        System.out.println("\nThe booking succeeded! Your booking's details: ");
                        System.out.println(booking);
                        System.out.println("\nSave your booking reference: " + reference);

                } else {
                        System.out.println("The booking failed! Please try again.");
                }
        }

        // Generate Random Booking Reference
        private static String generateBookingReference () {
                // 3 Random letters + 4 Random numbers
                String letters = "ABCDEFGHJKLMNOPQRSTUVXYZ";
                StringBuilder reference = new StringBuilder();

                // Put 3 random letters
                for (int i = 0; i < 3; i++) {
                        reference.append(letters.charAt(random.nextInt(letters.length())));
                }

                // Now put 4 random numbers
                for (int i = 0; i < 4; i++) {
                        reference.append(random.nextInt(10));
                }


                return reference.toString();
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


        // Show the details for a specifik flight
        private static void viewBooking () {
                System.out.println("\n=====  Show the Details of a Booking =====");

                System.out.println("Write your Booking Reference: ");
                String reference = scanner.next().toUpperCase();

                Booking booking = bookings.get(reference);

                if (booking == null) {
                        System.out.println("Unable to find the Booking. Please check your Booking Reference.");

                } else {
                        System.out.println("\nYour Booking's Detail: ");
                        System.out.println(booking);
                }


        }
}
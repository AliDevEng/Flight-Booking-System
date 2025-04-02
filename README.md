# Flight Booking System

A simple Java console application for booking flights, designed as a learning project to improve my Java fundamentals.

## Project Overview

The Flight Booking Application is a console-based program that simulates a basic flight booking system. The program allows users to:

- View available flights
- Book seats on flights
- View booking details
- Cancel bookings

This project was created to strengthen my understanding of Java fundamentals while building something practical that demonstrates core programming concepts.

## Project Structure

The application consists of three main classes:

### Flight.java
- Represents a flight with all necessary details (flight number, origin, destination, etc.)
- Manages available seats
- Includes methods for booking and canceling seats

### Booking.java
- Represents a booking in the system
- Links a passenger to a flight
- Calculates total price and stores booking details

### Main.java
- Serves as the entry point for the application
- Contains the menu system and user interface
- Manages the collections of flights and bookings
- Handles user input and performs basic validation

## Development Process

### Planning Phase
I started by defining the requirements for a basic flight booking system. I focused on the most essential features that would demonstrate object-oriented programming concepts while keeping the project manageable for a beginner.

### Design Phase
I designed the class structure with a focus on:
- Clear separation of concerns
- Simple data structures for a beginner project
- Minimal but complete functionality

### Implementation Phase
I implemented the classes one by one:
1. Flight class - to represent flight information
2. Booking class - to handle bookings
3. Main class - to create the user interface and manage the program flow

### Testing Phase
I tested the application by:
- Running through each menu option
- Booking flights and checking if seats were properly updated
- Canceling bookings and verifying that seats were returned to inventory
- Trying various input combinations to ensure the program handled them correctly

## Features

- **Flight Management**: Store and display basic flight information
- **Booking System**: Allow users to book seats on available flights
- **Booking Reference**: Generate unique booking references for each booking
- **Booking Retrieval**: View booking details using the booking reference
- **Cancellation**: Cancel bookings and return seats to inventory

## Skills Demonstrated

Through this project, I demonstrated:

- **Object-Oriented Programming**: Creating classes and objects with proper encapsulation
- **Data Structures**: Using ArrayList and HashMap to store collections of data
- **User Input Handling**: Processing and validating user input from the console
- **String Manipulation**: Generating unique identifiers and formatting output
- **Logical Thinking**: Implementing the business logic for flight booking and cancellation


## Reflection

This project was a valuable learning experience that helped me solidify my understanding of Java basics. By creating a complete, working application from scratch, I gained practical experience in designing and implementing object-oriented software. The project also highlighted areas where I can continue to improve my skills, particularly in user input validation and error handling.

Building this flight booking system has given me confidence to tackle more complex Java projects in the future, and has provided me with a foundation that I can continue to build upon as I progress in my Java learning journey.
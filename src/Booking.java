public class Booking {

    private String bookingReference;
    private Flight flight;
    private String passengerName;
    private String passengerEmail;
    private int numberOfSeats;
    private double totalPrice;


    // Constructor to make a new booking
    public Booking
    (String bookingReference, Flight flight, String passengerName, String passengerEmail, int numberOfSeats) {
        this.bookingReference = bookingReference;
        this.flight = flight;
        this.passengerName = passengerName;
        this.passengerEmail = passengerEmail;
        this.numberOfSeats = numberOfSeats;
        this.totalPrice = flight.getPrice() * numberOfSeats;
    }


    // Getters for booking properties
    public String getBookingReference() {
        return bookingReference;
    }

    public Flight getFlight() {
        return flight;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerEmail () {
        return passengerEmail;
    }

    public int getNumberOfSeats () {
        return numberOfSeats;
    }

    public double getTotalPrice () {
        return totalPrice;
    }


    // Return a String containing booking
    @Override
    public String toString() {
        return "Booking Reference: " + bookingReference +
                "\nPassenger: " + passengerName +
                "\nEmail: " + passengerEmail +
                "\nFlight: " + flight.getFlightNumber() +
                " from " + flight.getOrigin() +
                " to " + flight.getDestination() +
                "\nDeparture: " + flight.getDepartureDate() + " " + flight.getDepartureTime() +
                "\nNumber of setas: " + numberOfSeats +
                "\nTotal Price: " + totalPrice + " SEK"
                ;
    }
}

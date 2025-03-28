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




}

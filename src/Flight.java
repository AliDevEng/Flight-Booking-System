// All flight function

public class Flight {

    private String flightNumber;
    private String origin;
    private String destination;
    private String departureDate;
    private String departureTime;
    private int totalSeats;
    private int availableSeats;
    private double price;

    // We need a constructor to creating a new flight-object
    public Flight
    (String flightNumber, String origin, String destination, String departureDate, String departureTime, int totalSeats, double price) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this. destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;       // All seats are available at the beginning
        this.price = price;
    }

    // We need some Getters to create our object
    public String getFlightNumber() {
        return flightNumber;
    }
}

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


    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getPrice() {
        return price;
    }


    // Book some seats on the flight
    // Return true if the booking succeed

    public boolean bookSeats(int seats) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            // availableSeats = availableSeats - seats;
            // Update available seat count by removing the allocated seats

            return true;
        }
            return false;
    }



}

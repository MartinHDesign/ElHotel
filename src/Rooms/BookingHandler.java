package Rooms;

import java.util.ArrayList;
import java.util.List;

public class BookingHandler {
    private List<Booking> bookings = new ArrayList<>();
    public void addBooking(String bookingName, int amountOfNights, int pricePerNight){
        bookings.add(new Booking(bookingName,amountOfNights, pricePerNight));
    }
    public void removeBooking(String bookingName){
        for (Booking b : bookings){
            if (b.getBookingName().equalsIgnoreCase(bookingName)){
                bookings.remove(b);
            }
        }
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}

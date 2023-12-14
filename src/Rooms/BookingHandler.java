package Rooms;

import java.util.ArrayList;
import java.util.List;

public class BookingHandler {
    private List<Booking> bookings = new ArrayList<>();
    public void addBooking(Booking booking){
        bookings.add(booking);
    }
    public void removeBooking(String bookingName){
        for (Booking b : bookings){
            if (b.getName().equalsIgnoreCase(bookingName)){
                bookings.remove(b);
            }
        }
    }
}

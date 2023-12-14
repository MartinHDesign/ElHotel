package Bookings;

import java.time.LocalDate;

public class Booking {
    private LocalDate startDate;
    private LocalDate endDate;
    private String name;
    private int price;
    public Booking(LocalDate startDate, LocalDate endDate, String name, int pricePerNight){
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.price = pricePerNight;
    }

    public String getName() {
        return name;
    }
}

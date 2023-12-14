package Rooms;

public class DeluxeRoom extends Room {

    int jacuzzi;
    boolean conciergeService;
    int bathrooms;

    public DeluxeRoom(boolean occupied, int amountOfBeds, int price, String description, int jacuzzi, boolean conciergeService, int bathrooms) {
        super(occupied, amountOfBeds, price, description);
        this.jacuzzi = jacuzzi;
        this.conciergeService = conciergeService;
        this.bathrooms = bathrooms;
    }

    @Override
    public String getInfo() {
        return "Room{" +
                "Upptaget: " + isOccupied() +
                "\nAntal sängar: " + getAmountOfBeds() +
                "\nPris: " + getPrice() +
                "\nBeskrivning: " + getDescription() +
                "\nAntal Jacuzzi: " + jacuzzi +
                "\nConcierge:  " + conciergeService +
                "\nAntal badrum: " + bathrooms +
                "}";
    }
}

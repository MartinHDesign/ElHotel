package Rooms;

import java.time.LocalDate;

abstract class Room implements RoomTemplate {

    private boolean occupied;
    private int amountOfBeds;
    private int price;
    private String description;



    public Room(boolean occupied, int amountOfBeds, int price, String description) {
        this.occupied = occupied;
        this.amountOfBeds = amountOfBeds;
        this.price = price;
        this.description = description;
    }

    public Room() {
    }



    public boolean isOccupied() {
        return occupied;
    }

    public String getDescription() {
        return description;
    }

    public int getAmountOfBeds() {
        return amountOfBeds;

    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getInfo() {
        return "Room{" +
                "Upptaget: " + occupied +
                "\nAntal sängar: " + amountOfBeds +
                "\nPris: " + price +
                "}";
    }
}



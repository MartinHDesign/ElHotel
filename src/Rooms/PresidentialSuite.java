package Rooms;

import java.time.LocalDate;

public class PresidentialSuite extends Room {

    boolean highTechSecuritySystem;
    int wetBar;
    int firePlace;
    int prepKitchen;



    public PresidentialSuite(boolean occupied, int amountOfBeds, int price, String description,
                             boolean highTechSecuritySystem, int wetBar, int firePlace, int prepKitchen) {
        super(occupied, amountOfBeds, price, description);
        this.highTechSecuritySystem = highTechSecuritySystem;
        this.wetBar = wetBar;
        this.firePlace = firePlace;
        this.prepKitchen = prepKitchen;
    }


    @Override
    public String getInfo() {
        String securitySystemStatus = highTechSecuritySystem ? "Ja" : "Nej";
        return "PresidentialSuit{" +
                "Upptaget: " + isOccupied() +
                "\nAntal sängar: " + getAmountOfBeds() +
                "\nPris: " + getPrice() +
                "\nBeskrivning: " + getDescription() +
                "\nSecurity System ingår: " + securitySystemStatus +
                "\nBar:" + wetBar +
                "\nÖppen spis:" + firePlace +
                "\nKök: " + prepKitchen +
                "}";
    }
}

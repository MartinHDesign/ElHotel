package Rooms;

import java.time.LocalDate;

public class RoomFactory {



    public EconomyRoom createEconomyRoom() {
        return new EconomyRoom(false, 2, 500, "Its a room", 1);
    }


    public LuxuryRoom createLuxuryRoom() {
        return new LuxuryRoom(false, 1, 1300, "Its a very luxurious room", 1);
    }

    public DeluxeRoom createDeluxeRoom() {
        return new DeluxeRoom(false, 4, 3000, "Its an even more luxurious room than the luxury room", 2, true, 3);
    }

    public PresidentialSuite createPresidentialsuite() {
        return new PresidentialSuite(false,2,8000,"bla bla",true,1,1,1);

    }


}

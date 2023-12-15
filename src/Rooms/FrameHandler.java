package Rooms;

import GUI.CardLayoutContainer;
import GUI.Panels;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FrameHandler extends JFrame {
    private final CardLayout layout = new CardLayout();
    private final CardLayoutContainer allPanels = new CardLayoutContainer(layout, this);
    private String page = Panels.MENU.name();
    private BookingHandler bookingHandler;
    private List<Room> availableRooms = new RoomHandler().getAvailableRooms();
    public FrameHandler(){
        bookingHandler = new BookingHandler();
        add(allPanels);
        showPage(page);

        setSize(new Dimension(500,500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    public void showPage(String page){
        layout.show(allPanels, page);
    }

    public BookingHandler getBookingHandler() {
        return bookingHandler;
    }
    public int availableRoomSize(){
        return availableRooms.size();
    }

    public String getAvailableRoomsData(int number) {
        return availableRooms.get(number).getDataRoom();
    }
    public String getAvailableRoomsImagePath(int number){
        return availableRooms.get(number).getPath();
    }
    public int getRoom(int index){
        return availableRooms.get(index).getPrice();
    }

    public static void main(String[] args) {
        new FrameHandler();
    }
}

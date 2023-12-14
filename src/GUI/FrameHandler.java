package GUI;

import Bookings.BookingHandler;

import javax.swing.*;
import java.awt.*;

public class FrameHandler extends JFrame {
    private final CardLayout layout = new CardLayout();
    private final CardLayoutContainer allPanels = new CardLayoutContainer(layout, this);
    private String page = Panels.MENU.name();
    private BookingHandler bookingHandler;
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

    public static void main(String[] args) {
        new FrameHandler();
    }
}

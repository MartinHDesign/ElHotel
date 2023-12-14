package GUI;

import javax.swing.*;
import java.awt.*;

public class BookingsPanel extends JPanel {
    private String info = "Luxury room for 4 nights 4000 kr";
    private JLabel bookingInfo = new JLabel(info);
    private JButton menu = new JButton("Back to menu");
    private JButton cancelBooking = new JButton("Cancel booking");
    private JPanel bookOrders = new JPanel();
    public BookingsPanel(FrameHandler frameHandler){
        setLayout(new BorderLayout());

        JPanel bookOrders = new JPanel();
        bookOrders.setLayout(new GridLayout(10,1));
        bookOrders.add(bookingInfo);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setSize(new Dimension(500,10));

        menu.addActionListener(e -> frameHandler.showPage(Panels.MENU.name()));

        cancelBooking.addActionListener(e -> {
            bookOrders.remove(bookingInfo);
            frameHandler.revalidate();
            frameHandler.repaint();
//            String bookingName = JOptionPane.showInputDialog(null,"Booking name that you want to cancel");
//            frameHandler.getBookingHandler().removeBooking(bookingName);
        });
        buttonPanel.add(menu);
        buttonPanel.add(cancelBooking);

        add(bookOrders, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

    }
}

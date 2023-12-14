package GUI;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    private JLabel image = new JLabel(new ImageIcon("src/GUI/images/Hotel.jpg"));
    private JButton availableRooms = new JButton("See available rooms");
    private JButton myBookings = new JButton("My bookings");
    private JButton infoHotel = new JButton("About the hotel");
    public MenuPanel(Frame frame){
        setVisible(true);
        setLayout(new BorderLayout());

        infoHotel.addActionListener(e -> {frame.showPage(Panels.INFO.name());});
        availableRooms.addActionListener(e -> {frame.showPage(Panels.SHOWROOM.name());});
        myBookings.addActionListener(e -> frame.showPage(Panels.BOOKINGS.name()));


        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(3,1));
        southPanel.setSize(new Dimension(500, 20));
        southPanel.add(availableRooms);
        southPanel.add(myBookings);
        southPanel.add(infoHotel);





        add(image, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }

}

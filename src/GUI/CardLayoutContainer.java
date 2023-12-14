package GUI;

import javax.swing.*;
import java.awt.*;

public class CardLayoutContainer extends JPanel {
    public CardLayoutContainer(CardLayout layout, Frame frame){

        ShowRoom showRoom = new ShowRoom(frame);
        BookRoomPanel bookRoom = new BookRoomPanel(frame);
        MenuPanel menuPanel = new MenuPanel(frame);
        InfoHotel infoHotel = new InfoHotel(frame);
        PaymentPanel paymentPanel = new PaymentPanel(frame);
        BookingsPanel bookingsPanel = new BookingsPanel(frame);

        setLayout(layout);
        add(menuPanel, Panels.MENU.name());
        add(showRoom,Panels.SHOWROOM.name());
        add(bookRoom, Panels.BOOKROOM.name());
        add(infoHotel, Panels.INFO.name());
        add(paymentPanel,Panels.PAYMENT.name());
        add(bookingsPanel, Panels.BOOKINGS.name());
    }


}

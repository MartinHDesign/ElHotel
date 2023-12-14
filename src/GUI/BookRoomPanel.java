package GUI;

import javax.swing.*;
import java.awt.*;

public class BookRoomPanel extends JPanel {
    private String roomInfoText = """
            lyxigt rum med badkar 
            bla
            bla
            bla
            bla
            499 kr/natt
            """;
    private JTextArea roomInfo = new JTextArea(roomInfoText);
    private JPanel textAndFields = new JPanel();
    private JLabel name = new JLabel("namn:");
    private JTextField writeName = new JTextField();
    private JLabel amountOfNights = new JLabel("How many nights do you wish to stay?");
    private JTextField writeAmountOfNigths = new JTextField();

    private JPanel buttonPanel = new JPanel();
    private JButton book = new JButton("To payment");
    private JButton cancel = new JButton("Cancel");

    public BookRoomPanel(Frame frame){
        setLayout(new BorderLayout());

        textAndFields.setLayout(new GridLayout(2,2));
        textAndFields.setSize(new Dimension(500,20));
        textAndFields.add(name);
        textAndFields.add(writeName);
        textAndFields.add(amountOfNights);
        textAndFields.add(writeAmountOfNigths);

        buttonPanel.setSize(new Dimension(500,20));
        buttonPanel.setLayout(new GridLayout(1,2));
        buttonPanel.add(book);
        buttonPanel.add(cancel);

        cancel.addActionListener(e -> {frame.showPage(Panels.MENU.name());});
        book.addActionListener(e -> frame.showPage(Panels.PAYMENT.name()));


        add(textAndFields, BorderLayout.NORTH);
        add(roomInfo, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

    }

}

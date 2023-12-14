package GUI;

import javax.swing.*;
import java.awt.*;

public class ShowRoom extends JPanel {
    private JLabel image = new JLabel(new ImageIcon("src/GUI/images/hottelrum1.jpg"));

    private JPanel buttonPanel = new JPanel();
    private JButton boka = new JButton("book");
    private JButton next = new JButton(">>");
    private JButton previous = new JButton("<<");

    private JButton cancel = new JButton("Back to Menu");

    public ShowRoom(FrameHandler frameHandler){
        setLayout(new BorderLayout());

        buttonPanel.setLayout(new GridLayout(1,3));
        buttonPanel.add(previous);
        buttonPanel.add(boka);
        buttonPanel.add(next);

        boka.addActionListener(e -> {
            frameHandler.showPage(Panels.BOOKROOM.name());});
        cancel.addActionListener(e -> {
            frameHandler.showPage(Panels.MENU.name());});

        add(image,BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(cancel, BorderLayout.NORTH);
        setVisible(true);
    }
}

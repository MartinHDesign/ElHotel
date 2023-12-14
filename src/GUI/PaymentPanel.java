package GUI;

import javax.swing.*;
import java.awt.*;

public class PaymentPanel extends JPanel {
    private JLabel payment = new JLabel("Implement payment method");
    private JButton confirm = new JButton("Confirm payment");
    private JButton cancel = new JButton("Cancel");
    public PaymentPanel(Frame frame){
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,1));
        buttonPanel.setSize(new Dimension(500,10));

        confirm.addActionListener(e -> {
            frame.showPage(Panels.MENU.name());
        });
        cancel.addActionListener(e -> {
            frame.showPage(Panels.MENU.name());
        });

        buttonPanel.add(confirm);
        buttonPanel.add(cancel);

        add(payment, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

    }
}

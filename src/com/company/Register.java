package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JButton blizzardsButton;
    private JPanel panelMain;
    private JButton iceCreamButton;
    private JButton button2;
    private JButton moolatesButton;
    private JButton royalsHotDesertsButton;
    private JButton conesButton;
    private JButton milkshakesButton;
    private JButton sundaesButton;
    private JLabel totalLabel;

    JList<Blizzards> cart = new JList<>();
    DefaultListModel<Blizzards> cartDisplay = new DefaultListModel<>();

    public Register() {

        cart.setModel(cartDisplay);

        blizzardsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cartDisplay.addElement(new Blizzards("Smores", "Small", 3.69));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        frame.setContentPane(new Register().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

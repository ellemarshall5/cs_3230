package com.github.ellemarshall5.cs3230.GUI;

import javax.swing.*;

public class MainGui {
    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        MainGui gui = new MainGui();
        gui.getTabbedPane1().addTab("Math", new GUI().getRootPanel());
        gui.getTabbedPane1().addTab("Crypto Compare", new CryptoClient().getRootPanel());
        frame.setContentPane(gui.rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

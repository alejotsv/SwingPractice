package com.java21days;

import javax.swing.*;
import java.awt.*;

public class BasicSwing extends JFrame{

    BasicSwing(String title, Dimension d){
        super(title);
        setSize(d);
        setLocationRelativeTo(null);
        setLookAndFeel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void setLookAndFeel(){
        String style = "sun.swing.plaf.nimbus to com.sun.swing.plaf.nimbus";
        try {
            UIManager.setLookAndFeel(style);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

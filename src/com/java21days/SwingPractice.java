package com.java21days;

import java.awt.*;

public class SwingPractice {
    public static void main(String[] args) {
        BasicSwing swing = new BasicSwing("This thing");
        Dimension d = new Dimension(50,50);
        swing.setSize(d);
        swing.setVisible(true);
    }
}

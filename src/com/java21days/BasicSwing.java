package com.java21days;

import javax.swing.*;
import java.awt.*;

public class BasicSwing extends JFrame{

    BasicSwing(String title, Dimension d){
        super(title);
        setSize(d);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}

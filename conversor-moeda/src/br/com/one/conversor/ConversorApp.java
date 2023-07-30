package br.com.one.conversor;

import javax.swing.*;
import java.awt.*;

public class ConversorApp {
    public static void main(String[] args) {
        JFrame frame;

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewConversor window = new ViewConversor();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
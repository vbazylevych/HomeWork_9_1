package com.goit.javaonline3.musicshop;

/**
 * Created by vbazylevych on 7/6/2016.
 */

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyTable extends JFrame{
    public static void createGUI(MusicShop musicShop) {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "Name",
                "Last modified",
                "lera",
                "kot"
        };



        JTable table = new JTable(musicShop.printAssortment() , columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}

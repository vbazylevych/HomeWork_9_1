package com.goit.javaonline3.musicshop;

/**
 * Created by vbazylevych on 7/8/2016.
 */
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyTable {
    public static void createGUI(MusicShop musicShop) {
        JFrame frame = new JFrame("Caesar Work");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "Producer",
                "Encoded Producer",
                "Decoded Producer"
        };

        JTable table = new JTable(musicShop.prepareDataForTable(), columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

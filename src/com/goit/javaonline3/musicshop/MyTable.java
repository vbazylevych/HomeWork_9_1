package com.goit.javaonline3.musicshop;

/**
 * Created by vbazylevych on 7/6/2016.
 */

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyTable extends JFrame{
    public static void createGUI() {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "Name",
                "Last modified",
        };

        String[][] test = new String[2][2];
        test[0][0] = "lera";
        test[0][1] = "kot";
        test[1][0] = "lera2";
        test[1][1] = "kot2";

        JTable table = new JTable(test, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}

import com.goit.javaonline3.musicshop.MusicShop;
import com.goit.javaonline3.musicshop.MyScanner;
import com.goit.javaonline3.musicshop.MyTable;

import javax.swing.*;


/**
 * Created by Ler4enko on 11.06.2016.
 */
public class Runner {

    public static void main(String[] arg) {

        MusicShop musicShop = new MusicShop();
        musicShop.openShop();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                MyTable.createGUI(musicShop);
            }
        });

        MyScanner.close();
    }
}

import com.goit.javaonline3.musicshop.MusicShop;
import com.goit.javaonline3.musicshop.MyScanner;
import com.goit.javaonline3.musicshop.MyTable;

import javax.swing.*;

/**
 * Created by Ler4enko on 11.06.2016.
 */
public class Runner {

    public static void main(String[] arg) {
        MyScanner myScanner = new MyScanner();

        MusicShop musicShop = new MusicShop();
        musicShop.openShop(myScanner);
        musicShop.sortMusicInstrumentsByPrice();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                MyTable.createGUI(musicShop);
            }
        });

        myScanner.close();
    }
}

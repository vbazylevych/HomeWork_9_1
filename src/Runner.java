import com.goit.javaonline3.musicshop.MusicShop;
import com.goit.javaonline3.musicshop.MyScanner;
import com.goit.javaonline3.musicshop.MyTable;
import com.goit.javaonline3.musicshop.Order;

import javax.swing.*;

/**
 * Created by Ler4enko on 11.06.2016.
 */
public class Runner {

    public static void main(String[] arg) {

        MyScanner myScanner = new MyScanner();

     //   MusicShop musicShop = new MusicShop();
      //  musicShop.openShop(myScanner);
      //  musicShop.printRestOfInstruments();
       // musicShop.printAssortment();

        /*Order order = new Order();
        order.createOrder(myScanner);
        order.printOrder();

        musicShop.handleOrder(order.getOrder());
        musicShop.printRestOfInstruments(); */



        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                MyTable.createGUI();
            }
        });
        myScanner.close();
    }
}

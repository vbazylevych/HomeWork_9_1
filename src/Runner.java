import com.goit.javaonline3.musicshop.MusicShop;
import com.goit.javaonline3.musicshop.MyScanner;
import com.goit.javaonline3.musicshop.Order;

/**
 * Created by Ler4enko on 11.06.2016.
 */
public class Runner {

    public static void main(String[] arg) {

        MyScanner myScanner = new MyScanner();

        MusicShop musicShop = new MusicShop();
        musicShop.openShop(myScanner);
        musicShop.printRestOfInstruments();

        Order order = new Order();
        order.createOrder(myScanner);
        order.printOrder();

        musicShop.handleOrder(order.getOrder());
        musicShop.printRestOfInstruments();

        myScanner.close();
    }
}

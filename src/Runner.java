import com.goit.javaonline3.musicshop.MusicShop;
import com.goit.javaonline3.musicshop.Order;

/**
 * Created by Ler4enko on 11.06.2016.
 */
public class Runner {

    public static void main(String[] arg) {

        MusicShop musicShop = new MusicShop();
        musicShop.openShop();
        musicShop.printRestOfInstruments();

        Order order = new Order();
        order.createOrder();
        order.printOrde();

        musicShop.handleOrder(order.getOrder());
        musicShop.printRestOfInstruments();
    }
}

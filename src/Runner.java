import com.goit.javaonline3.shop.MusicShop;
import com.goit.javaonline3.shop.Order;

import java.util.Scanner;

/**
 * Created by Ler4enko on 11.06.2016.
 */
public class Runner {

    public static void main(String[] arg) {

        MusicShop musicSpop = new MusicShop();
        musicSpop.openShop();

        Order order = new Order();
        order.createOrder();

        musicSpop.handleOrder(order.getOrder());
        musicSpop.getMusicInstruments();
    }
}

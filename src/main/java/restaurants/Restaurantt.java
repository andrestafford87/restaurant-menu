package restaurants;

import java.util.*;

public class Restaurantt {



    public static void main(String[] args) {
        MyMenuItem item1 = new MyMenuItem("Menue Item 1: Sp", "Good Brockali", 7.99, "Veggie", false);
        MyMenuItem item2 = new MyMenuItem("Menue Item 2: Sp", "Good Brockali", 7.99, "Veggie", false);
        MyMenu menu1 = new MyMenu();
        menu1.addMenuItem(item1);
//        System.out.println(menu1);
        menu1.removeMenuItem(item1);
        System.out.println(menu1);



    }
}

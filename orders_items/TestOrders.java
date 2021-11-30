import java.util.*;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    
        // Order variables -- order1, order2 etc.
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 4.99;
        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 3.99;
        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 2.99;
        Item item4 = new Item();
        item4.name = "Capuccino";
        item4.price = 5.99;
        // System.out.println(item1.name);
        // System.out.println(item2.name);
        // System.out.println(item3.name);
        // System.out.println(item4.name);

        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.ready = true;
        System.out.println(order1.total);
        
        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items.add(item1);
        order2.total += item1.price;
        order2.ready = true;
        System.out.println(order2.total);
        
        Order order3 = new Order();
        order3.name = "Noah";
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.println(order3.total);
        
        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(item2);
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (item2.price * 3);
        System.out.println(order4.total);
        
    }
}

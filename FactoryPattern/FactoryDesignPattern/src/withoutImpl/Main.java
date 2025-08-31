package withoutImpl;

import withoutImpl.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        System.out.println(restaurant.orderBurger("BEEF"));
        System.out.println(restaurant.orderBurger("VEGGIE"));
    }
}
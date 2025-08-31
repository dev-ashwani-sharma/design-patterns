package withImpl;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new BeefBurgerRestaurant();
        restaurant.orderBurger();
        
        restaurant = new VeggieBurgerRestaurant();
        restaurant.orderBurger();
    }
}
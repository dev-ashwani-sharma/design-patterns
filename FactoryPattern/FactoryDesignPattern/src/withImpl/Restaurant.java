package withImpl;

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger(); // factory method
/*
* as factory method relies heavily on inheritance, it delegates the object creation to subclasses that implement the factory method
* */
}

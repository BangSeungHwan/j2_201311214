package headfirst.factory.pizzas;

public class PotatoPizza extends Pizza {
  public PotatoPizza() {
    name = "Potato Pizza";
    dough = "Thin";
    sauce = "Tomato Sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parsley");
  }
}
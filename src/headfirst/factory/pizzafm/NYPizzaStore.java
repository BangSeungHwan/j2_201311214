package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
  public Pizza createPizza(String type) {
     Pizza pizza = null;
     if (type.equals("cheese")) {
       pizza = new NYStyleCheesePizza();
     } else if (type.equals("potato")){
       pizza = new SMStylePotatoPizza();
     }
     return pizza;
  }
}


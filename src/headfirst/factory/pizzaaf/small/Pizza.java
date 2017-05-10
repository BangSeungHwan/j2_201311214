package headfirst.factory.pizzaaf.small;

import java.util.ArrayList;

public abstract class Pizza {
 String name;
 Dough dough;
 Cheese cheese;
 ArrayList<String> toppings = new ArrayList<String>();
 abstract void prepare();
 void bake() {
  System.out.println("Baking..." + name);
 }
 void cut() {
  System.out.println("Cutting..." + name);
 }
 void box() {
  System.out.println("Boxing..." + name);
 }
}
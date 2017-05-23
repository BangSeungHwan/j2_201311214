package headfirst.iterator.dinermerger.before;

import java.util.ArrayList;

public class PancakeHouseMenu {
  ArrayList menuItems;
  //MenuItem[] menuItems;
  //static final int MAX_ITEMS = 3;
  //int numberOfItems = 0;
  public PancakeHouseMenu() {
    //menuItems = new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList();
    addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
    addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
  }
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem m = new MenuItem(n, d, v, p);
    //menuItems[numberOfItems] = m;
    //numberOfItems++;
    menuItems.add(m);
  }
  //public MenuItem[] getMenuItems() {
  public ArrayList getMenuItems() {
    return menuItems;
  }
  public String toString() {
    return "Objectville Pancake House Menu";
  }
}
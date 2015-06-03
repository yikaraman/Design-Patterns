
package org.developer.patterns;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

   private String  name;
   private String  description;
   private boolean spicy;
   private double  price;

   public MenuItem(String name, String description, boolean spicy, double price) {
      super();
      this.name = name;
      this.description = description;
      this.spicy = spicy;
      this.price = price;
   }

   @Override
   public Iterator<MenuComponent> createIterator() {
      return new NullIterator();
   }

   @Override
   public String toString() {
      return "* [name=" + getName() + ", description=" + getDescription() + ", spicy=" + isSpicy() + ", price=" + getPrice() + "]";
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public boolean isSpicy() {
      return spicy;
   }

   public void setSpicy(boolean spicy) {
      this.spicy = spicy;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

}

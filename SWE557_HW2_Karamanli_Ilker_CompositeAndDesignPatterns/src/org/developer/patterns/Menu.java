
package org.developer.patterns;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

   private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
   private String                   name           = null;
   private String                   description    = null;
   private Iterator<MenuComponent>  iterator;

   public Menu() {
      super();
   }

   public String getName() {
      return name;
   }

   public ArrayList<MenuComponent> getMenuComponents() {
      return menuComponents;
   }

   public void setMenuComponents(ArrayList<MenuComponent> menuComponents) {
      this.menuComponents = menuComponents;
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

   @Override
   public void add(MenuComponent menuComponent) {
      menuComponents.add(menuComponent);
   }

   @Override
   public void remove(MenuComponent menuComponent) {
      menuComponents.remove(menuComponent);
   }

   @Override
   public Iterator<MenuComponent> createIterator() {
      if (iterator == null) {
         iterator = menuComponents.iterator();
      }
      return iterator;
   }

   @Override
   public void executeList() {
      System.out.println(" Menu Name:" + name + " Menu Description: " + description);
      System.out.println("--------------------------------------------");
      for (MenuComponent menu : menuComponents) {
         menu.executeList();
      }
      System.out.println("--------------------------------------------");
   }
}

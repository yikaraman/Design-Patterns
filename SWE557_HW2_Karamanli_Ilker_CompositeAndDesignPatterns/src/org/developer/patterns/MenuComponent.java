
package org.developer.patterns;

import java.util.Iterator;

public abstract class MenuComponent {

   public void add(MenuComponent menuComponent) {
      throw new UnsupportedOperationException();
   }

   public void remove(MenuComponent menuComponent) {
      throw new UnsupportedOperationException();
   }

   public MenuComponent getChild(int i) {
      throw new UnsupportedOperationException();
   }

   public Iterator<MenuComponent> createIterator() {
      return null;
   }
   
   public abstract void executeList();

}
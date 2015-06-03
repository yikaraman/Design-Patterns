package org.developer.patterns;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

   @Override
   public boolean hasNext() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public MenuComponent next() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void remove() {
      // TODO Auto-generated method stub

   }

}

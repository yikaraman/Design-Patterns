
package org.developer.patterns;

import java.util.Iterator;

public class MenuManager {

   private MenuBuilder menuBuilder;

   public Menu createMenu(String name, String description) {

      if (name.equals("Adana")) {
         menuBuilder = new MenuTypeAdanaKebab();
      }
      else if (name.equals("Kebab")) {
         menuBuilder = new MenuTypeKebab();
      }
      else if (name.equals("Lahmacun")) {
         menuBuilder = new MenuTypeLahmacun();
      }
      else if (name.equals("Fuzyon")) {
         menuBuilder = new MenuTypeFuzyon();
      }
      else {
         menuBuilder = new MenuType();
      }

      this.menuBuilder.setName(name);
      this.menuBuilder.setDescription(description);
      return this.menuBuilder.getMenu();

   }

   @Override
   public String toString() {
      String string = new String();
      Iterator<MenuComponent> iterator = this.menuBuilder.getMenu().getMenuComponents().iterator();// menuComponents.iterator();
      string = this.menuBuilder.getMenu().getName().toString() + ":" + this.menuBuilder.getMenu().getDescription() + "\n";
      string = string + "--------------------------------\n";
      while (iterator.hasNext()) {
         string = string + iterator.next().toString() + "\n";
      }
      return string;
   }
}

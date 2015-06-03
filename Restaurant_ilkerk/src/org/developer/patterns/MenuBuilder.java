package org.developer.patterns;

public abstract class MenuBuilder {
   
   private Menu menu = null;
   
   
   public MenuBuilder() {
      // TODO Auto-generated constructor stub
   }
   
   public Menu getMenu(){
      if(menu==null)
         menu = new Menu();
      return menu;
   }

   public abstract void setName(String name);
   public abstract void setDescription(String description);
}

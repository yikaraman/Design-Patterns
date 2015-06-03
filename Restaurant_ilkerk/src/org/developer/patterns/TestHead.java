
package org.developer.patterns;

public class TestHead {

   public static void main(String[] args) {
      
      MenuManager menuManager = new MenuManager();
      
      Menu adanaMenu = menuManager.createMenu("Adana", "Adana Kebab Menusu");
      adanaMenu.add(new MenuItem("Adana", "Adana Kebap", true, 10.00d));
      adanaMenu.add(new MenuItem("Urfa", "Urfa Kebap", false, 10.00d));
      
      
      //System.out.println(menuManager.toString());
      
      Menu lahmacunMenu = menuManager.createMenu("Lahmacun", "Lahmacun Menu");
      lahmacunMenu.add(new MenuItem("Lahmacun", "Normal Lahmacun", false, 4.50d));
      lahmacunMenu.add(new MenuItem("Acili", "Acili Lahmacun", true, 4.50d));
      lahmacunMenu.add(new MenuItem("Peymacun", "Peynirli Lahmacun", false, 3.50d));
      
      //System.out.println(menuManager.toString());
      
      Menu kebapMenu = menuManager.createMenu("Kebap", "Kebap Menusu");
      kebapMenu.add(new MenuItem("Doner", "Sade Doner", false, 12.9d));
      kebapMenu.add(new MenuItem("Beyti", "Beyti Kebap", false, 15.00d));
      kebapMenu.add(adanaMenu);
      
      //System.out.println(menuManager.toString());
      
      Menu fuzyonMenu = menuManager.createMenu("Fuzyon", "Fuzyon Adana");
      fuzyonMenu.add(new MenuItem("Zurfa", "Zurafa etinden", false, 20.00d));
      fuzyonMenu.add(new MenuItem("Madana", "Manda etinden", true, 15.00d));   
      
      
//      Menu anamenu = menuManager.createMenu("dsads", "sdfsdfdg");
//      anamenu.add(adanaMenu);
//      anamenu.add(lahmacunMenu);
      
      System.out.println(menuManager.toString());
      
      //System.out.println(anamenu);
   }

}


package org.developer.patterns.strategy;

import java.util.ResourceBundle;

public class FileManager {

   private Strategy                strategy;

   public static final FileManager manager = new FileManager();

   private FileManager() {
      String strategy = ResourceBundle.getBundle("" + "org/developer/patterns/strategy/strategy").getString("strategy");

      try {
         setStrategy(((Strategy) Class.forName(strategy).newInstance()));
      }
      catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   public static FileManager instance() {
      return manager;
   }

   public Strategy getStrategy() {
      return strategy;
   }

   public void setStrategy(Strategy strategy) {
      this.strategy = strategy;
   }

   public void saveBean(Bean bean) {
      getStrategy().save(bean);
   }
}

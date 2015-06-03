package org.developer.pattern.state;

public class Test {

   public static void main(String[] args) {
      
      Engine engine  = new Engine();
      
      engine.stop();
      engine.start();
      engine.start();
   }
}

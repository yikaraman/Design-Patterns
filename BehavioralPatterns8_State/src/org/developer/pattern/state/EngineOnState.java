package org.developer.pattern.state;

public class EngineOnState implements State {

   @Override
   public void on(Engine engine) {
      // TODO Auto-generated method stub
      System.out.println("Engine is ON State..");

   }

   @Override
   public void off(Engine engine) {
      // TODO Auto-generated method stub
      engine.setState(new EngineOffState());
      System.out.println("ENgine Stopped..");

   }

}

package org.developer.pattern.state;

public class Engine {

   private State state;
   
   public Engine() {
      // TODO Auto-generated constructor stub
      setState(new EngineOffState());
      System.out.println("ENgine is OFF!!");
   }

   public void start(){
      getState().on(this);
   }
   
   public void stop(){
      getState().off(this);
   }
   public State getState() {
      return state;
   }

   public void setState(State state) {
      this.state = state;
   }
}

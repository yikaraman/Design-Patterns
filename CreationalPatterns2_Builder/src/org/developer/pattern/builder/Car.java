
package org.developer.pattern.builder;

public class Car {

   private Label  label = null;
   private Model  model = null;
   private String color = null;
   private int    Power = 0;

   public Car() {

   }

   public Label getLabel() {
      return label;
   }

   public void setLabel(Label label) {
      this.label = label;
   }

   public Model getModel() {
      return model;
   }

   public void setModel(Model model) {
      this.model = model;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getPower() {
      return Power;
   }

   public void setPower(int power) {
      Power = power;
   }

}

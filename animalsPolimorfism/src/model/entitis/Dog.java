package model.entitis;

public class Dog extends Animal {
  protected String bark;

  public Dog(){
    super();
  }
  
  public Dog(String name, Integer age, Double weight, Boolean tick, String bark){
    super(name, age, weight, tick);
    this.bark = bark;
  }


  @Override
  public String treatTick(){
    return "Take a bath";
  }

  @Override 
  public String mover(){
    return "Andar em 4 patas";
  }

  public String bark(){
    return "Au au";
  }

  @Override
  public String toString(){
    return super.toString() + "Sound: " + bark();
  }

}

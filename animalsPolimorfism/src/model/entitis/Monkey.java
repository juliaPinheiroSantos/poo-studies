package model.entitis;

public class Monkey extends Animal {
  protected String chatter;

  public Monkey(){
    super();
  }

  public Monkey(String name, Integer age, Double weight, Boolean tick, String chatter){
    super(name, age, weight, tick);
    this.chatter = chatter;
  }

  @Override
  public String treatTick(){
    return "Take medicine";
  }

  @Override
  public String mover(){
    return "Andar em 4 patas";
  }

  public String chatter(){
    return "u u á á";
  }

  public String toString(){
    return super.toString() + "\nSound: " + chatter() + "\n";
  }
}

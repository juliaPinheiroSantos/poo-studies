package model.entitis;

public class Animal {
  protected String name;
  protected Integer age;
  protected Double weight;
  protected Boolean tick;

  public Animal(){}

  public Animal(String name, Integer age, Double weight, Boolean tick){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.tick = tick;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public Integer getAge(){
    return this.age;
  }

  public void setAge(Integer age){
    this.age = age;
  }

  public Double getWeight(){
    return this.weight;
  }

  public void setWeight(Double weight){
    this.weight = weight;
  }

  public Boolean getTick(){
    return this.tick;
  }

  public void setTick(Boolean tick){
    this.tick = tick;
  }

  public String hasTick(){
    if(tick){
      return "yes";
    }
      return "no";
  }

  public String treatTick(){
    return " ";
  }

  public String mover(){return " ";}

  public String toString(){
    return "Nome: " + getName() + "\nIdade: " + getAge() + "\nPeso: " + getWeight() + "\nHas tick? " + hasTick() + "\nHow to treat? " + treatTick() + "\nHow it moves?" + mover() + "\n";
  }

}

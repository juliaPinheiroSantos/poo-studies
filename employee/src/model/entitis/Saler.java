package model.entitis;

public class Saler extends Employee {
  public Saler(){
    super();
  }

  public Saler(String firstName, String lastName, String cpf, String registration, Double salary){
    super(firstName, lastName, cpf, registration, salary);
  }

  @Override
  public Double calculateSalary(){
    return getSalary() + getSalary()*0.25;
  }

  @Override
  public String toString(){
    return super.toString();
  }

}

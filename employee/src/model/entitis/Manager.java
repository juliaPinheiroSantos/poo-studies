package model.entitis;

public class Manager extends Employee {

  public Manager(){
    super();
  }
  public Manager(String firstName, String lastName, String cpf, String registration, Double salary){
    super(firstName, lastName, cpf, registration, salary);
  }

  @Override
  public Double calculateSalary(){
    return getSalary() + getSalary()*0.45;
  }

  @Override
  public String toString(){
    return super.toString();
  }

}

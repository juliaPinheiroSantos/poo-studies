package model.entitis;

public class Employee extends Person {
  
  protected String registration;
  protected Double salary;

  public Employee(){
    super();
    
  }

  public Employee(String firstName, String lastName, String cpf, String registration, Double salary){
    super(firstName, lastName, cpf);
    this.registration = registration;
    this.salary = salary;
  }

  public String getRegistration(){
    return this.registration;
  }

  public Double getSalary(){
    return this.salary;
  }

  public Double calculateSalary(){
    return getSalary();
  }

  @Override
  public String toString(){
    return super.toString() + "\nRegistration: " + getRegistration() +"\nSalary: " + calculateSalary() + "\n";
  }

}

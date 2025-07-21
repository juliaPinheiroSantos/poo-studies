package model.entitis;

public class TelephoneOperator extends Employee{
  public TelephoneOperator(){
    super();
  }

  public TelephoneOperator(String firstName, String lastName, String cpf, String registration, Double salary){
    super(firstName, lastName, cpf, registration, salary);
  }

  @Override
  public Double calculateSalary(){
    return getSalary() + getSalary()*0.1;
  }

  @Override
  public String toString(){
    return super.toString();
  }

}

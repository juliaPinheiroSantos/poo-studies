package model.entitis;

public class Rectangle {
  protected Double length;
  protected Double width;

  public Rectangle(){}

  public Rectangle(Double length, Double width){
    this.length = length;
    this.width = width;
  }

  public Double getLength(){
    return this.length;
  }

  public void setLength(Double length){
    if (length > 0 && length < 20){
      this.length = length;
    }
  }

  public Double getWidth(){
    return this.width;
  }

  public void setWidth(Double width){
    if (width > 0 && width < 20){
      this.width = width;
    }
  }

  public Double calculateArea(){
    return getLength()*getWidth();
  }

  public Double calculatePerimeter(){
    return (2*getLength()) + (2*getWidth());
  }

  public String toString(){
    return "Length: " + getLength() + "\nWidth: " + getWidth() + "\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter() + "\n";
  }



}

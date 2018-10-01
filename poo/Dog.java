public class Dog{
  //definir propiedades o atributos
  public String color;
  public String eyeColor;
  public double height;
  public double leight;
  public double weight;


  //motodos o comportamientos
  public String sit(){
    return "estoy acostado";
//  System.out.println("estoy sentado");
  }
  public void bark(){
    System.out.println("wauff");
  }
  public void layDown(String name){
    System.out.println(name + " estoy recostado");
  }
  public void eat(){
    System.out.println("estoy comiendo");
  }
  public void slepp(){
    System.out.println("zzzzzzzZZZZZZZZ");
  }

}

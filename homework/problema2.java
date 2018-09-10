import java.util.Scanner;
public class problema2{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double PI= 3.1416;
    System.out.println("escribe el radio");
      double radio = input.nextDouble();
       double area = PI * radio *radio;
       System.out.println("el area de la circunferencia es"+"\t" + area);
  }
}

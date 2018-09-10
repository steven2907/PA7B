import java.util.Scanner;
public class problema6{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
double sueldo;
      System.out.println("introduzca las horas");
        double H= input.nextDouble();
          System.out.println("ingrese el pago de horas trabajadas");
            double HP = input.nextDouble();
sueldo = (HP*H);



    System.out.println("el sueldo semanal es " + sueldo);
  }
}

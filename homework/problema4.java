import java.util.Scanner;
public class problema4{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double A;
        double AT;
          double AC;
            double c;

      System.out.println("ingrese el radio y la base del triangulo rectangulo");
        double B= input.nextDouble();
          System.out.println("ingrese la hipotenusa");
            double H = input.nextDouble();
c= Math.sqrt ((H*H)-(B*B));
AT=2*(B*c)/2;
AC=(3.1416*B*B)/2;
A= (AT+AC);


    System.out.println("el area es: " + A);
  }
}

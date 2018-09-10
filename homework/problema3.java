import java.util.Scanner;
public class problema3{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double A;
        double al;
          double ac;
            double cr;

      System.out.println("ingrese la base de la figura");
        double x= input.nextDouble();
          System.out.println("ingrese la altura de la figura");
            double y = input.nextDouble();

    cr= y/2;

    al= (x*cr)/2;

    ac= x*cr;

    A= al + ac;

    System.out.println("el area es: " + A);
  }
}

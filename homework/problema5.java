import java.util.Scanner;
public class problema5{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
double gt;
double ag;

      System.out.println("introduzca la cantidad en litros");
        double li= input.nextDouble();
          System.out.println("ingrese el precio del galon");
            double ga = input.nextDouble();
gt=(li/3.78);
ag=(ga*gt);


    System.out.println("la ganancia total del dia es: " + ag );
  }
}

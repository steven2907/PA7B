import java.util.Scanner;
public class problema8{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
double cm;
double pago;
      System.out.println("introduzca cuanto tiene de largo la alberca en m3");
        double largo= input.nextDouble();
        System.out.println("introduzca cuanto tiene de ancho la alberca en m3");
          double ancho= input.nextDouble();
          System.out.println("introduzca cuanto tiene de altura la alberca en m3");
            double altura= input.nextDouble();
            System.out.println("ingrese el precio por m3");
              double pag= input.nextDouble();

  cm=(largo*ancho*altura);
  pago=(cm*pag);

 System.out.println("usted va a pagar "+ pago);
}
}

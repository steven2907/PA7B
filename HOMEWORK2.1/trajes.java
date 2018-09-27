import java.util.Scanner;
public class trajes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double pag;

    System.out.println("Ingresa la cantidad del traje");
      double tr = input.nextDouble();


      if(tr > 2500){
      pag = tr * .15;
      System.out.println("el traje con descuento cuesta " + (tr-pag));
      System.out.println("el descuento es " + pag);
      } {
          if(tr <= 2500){
            pag = tr * .08;
              System.out.println("el traje con descuento cuesta " + (tr-pag));
              System.out.println("el descuento es " + pag);
          }
      }
    }
  }

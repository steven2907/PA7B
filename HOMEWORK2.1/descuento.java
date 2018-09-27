import java.util.Scanner;
public class descuento{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double pag;
    System.out.println("Ingresa la cantidad");
      int x = input.nextInt();


      if(x < 1000){
      pag = x *.90;
      System.out.println("la cantidad que vas a pagar es" + pag);
      } {
          if(x >= 1000){
            pag = x *.85;
              System.out.println("La cantidad que vas a apagar es" + pag);
          }
      }
    }
  }

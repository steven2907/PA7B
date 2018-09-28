import java.util.Scanner;
public class uvas{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double sum;
    double reba;
    Double incre;

    System.out.println("ingresa 1 si el tipo de uva es A");
    System.out.println("ingresa 2 si el tipo de uva es B");
    System.out.println("Ingresa la tipo de uva");
     int tipo = input.nextInt();

      if(tipo == 1){
        System.out.println("ingresa el tamaño de la uva");
        System.out.println("solo puedes ingresar el tamaño 1 y el tamaño 2");
          int tam = input.nextInt();
          if (tam == 1) {
          System.out.println("ingresa cuantos kilos compraste");
          int kilo = input.nextInt();
          incre = (kilo*.20);
          sum = ((kilo*20)+incre);
          System.out.println("tu vas a pagar " + sum);
             }else
             System.out.println("ingresa cuantos kilos compraste");
             int kilo = input.nextInt();
             incre = (kilo*.30);
             sum = ((kilo*20)+incre);
             System.out.println("tu vas a pagar " + sum);
      } {
          if(tipo == 2){
            System.out.println("ingresa el tamaño de la uva");
            System.out.println("solo puedes ingresar el tamaño 1 y el tamaño 2");
              int tam = input.nextInt();
              if (tam == 1) {
              System.out.println("ingresa cuantos kilos compraste");
              int kilo = input.nextInt();
              reba = (kilo*.20);
              sum = ((kilo*20)-reba);
              System.out.println("tu vas a pagar " + sum);
                 }else
                 System.out.println("ingresa cuantos kilos compraste");
                 int kilo = input.nextInt();
                 reba = (kilo*.50);
                 sum = ((kilo*20)-reba);
                 System.out.println("tu vas a pagar " + sum);
          }

      }
    }
  }

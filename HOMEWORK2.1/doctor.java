import java.util.Scanner;
public class doctor{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double pago;
    double pagoc;
    System.out.println("ingrese el numero de consultas que ha venido");
     int nc = input.nextInt();



   if (nc <= 3) {
     pago=200;
     pagoc=nc*200;
  System.out.println("usted va a pagar por la consulta "+pago);
  System.out.println("pago por el tratamiento "+pagoc);
   }
    else if (nc <=5) {
     pago=150;
     pagoc=(nc-3)*150+600;
     System.out.println("usted va a pagar por la consulta "+pago);
     System.out.println("pago por el tratamiento "+pagoc);
   }
      else if (nc<= 8) {
        pago=100;
        pagoc=(nc-5)*100+900;
        System.out.println("usted va a pagar por la consulta "+pago);
        System.out.println("pago por el tratamiento "+pagoc);
      }
        else{
          pago=50;
          pagoc=(nc-9)*50+1200;
          System.out.println("usted va a pagar por la consulta "+pago);
          System.out.println("pago por el tratamiento "+pagoc);
        }
        
  }
}

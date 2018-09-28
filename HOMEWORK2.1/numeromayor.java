import java.util.Scanner;
public class numeromayor{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


System.out.println("Ingresa primer numero ");
      int pri = input.nextInt();
      System.out.println("Ingresa segundo numero ");
      int seg = input.nextInt();
      System.out.println("Ingresa tercer numero ");
      int ter = input.nextInt();
      if(pri > seg && pri > ter){
      System.out.println("El numero mayor es " + pri);
      }else{
          if(seg > pri && seg > ter){
          System.out.println("El numero mayor es " + seg);
          }else{
          System.out.println("El numero mayor es " + ter);
        }
      }
      
    }
  }

import java.util.Scanner;
public class positivo{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa un numero");
      int num= input.nextInt();
      if(num==0){
      System.out.println("El numero "+num+" es nulo");
      } else{
          if(num>0){
              System.out.println("El numero "+num+" es positivo");
          }else{
          System.out.println("El numero "+num+" es negativo");
          }
      }
      }
}

import java.util.Scanner;
public class problema1{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    System.out.println("escribe la base");
      double base = input.nextDouble();
    System.out.println("escribe la altura");
      double altura = input.nextDouble();
       double area = (base*altura);
       System.out.println("el area es"+"\t" + area);
  }
}

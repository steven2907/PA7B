import java.util.Scanner;
public class numeros{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("ingresa el primer numero:");
    int A = input.nextInt();
    System.out.println("ingresa el segudo numero:");
    int B = input.nextInt();

if (A>B)
  System.out.println(A + "es mayor que" + B);
else
System.out.println(B + "es mayor que " + A);

}
}

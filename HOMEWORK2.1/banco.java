import java.util.Scanner;
public class banco{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
double total;
double N;
    System.out.println("introdusca el tipo de tarjeta:");
    double t = input.nextDouble();

    System.out.println("introduca la cantidad del pago");
    double c = input.nextDouble();


if (t==1){
total=c*.25;
System.out.println("nuevo credito es "+total);
}
else if (t==2)
{
  total=c*.35;
  System.out.println("nuevo credito es "+total);
}
else if (t==3)
{
  total=c*.40;
System.out.println("nuevo credito es "+total);
}
else
{
  total=c*.50;
System.out.println("nuevo credito es" +total);
}

N=c+total;
  System.out.println("nuevo limite de credito es " + N);
  }
}

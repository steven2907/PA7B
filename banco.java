import java.util.Scanner;
public class banco{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
double total;
double incre;
    System.out.println("introdusca el tipo de tarjeta:");
    double tipo = input.nextDouble();

    System.out.println("introduca la cantidad del pago");
    double pag = input.nextDouble();


if (tipo ==1){
incre=pag*.25;
total=pag+incre;
System.out.println("tu credit incremento " + incre);
System.out.println("tu nuevo limite de credito sera " + total);
}
if (tipo==2){
incre=pag*.35;
total=pag+incre;
System.out.println("tu credit incremento " + incre);

  System.out.println("tu nuevo limite de credito sera " + total);
}if (tipo==3){
incre=pag*.40;
total=pag+incre;
System.out.println("tu credit incremento " + incre);
System.out.println("tu nuevo limite de credito sera " + total);
}
else if(tipo==4){
incre=pag*.50;
total=pag+incre;
System.out.println("tu credit incremento " + incre);
System.out.println("tu nuevo limite de credito sera " + total);
}

  }
}

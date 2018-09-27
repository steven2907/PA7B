import java.util.Scanner;
public class ahumada{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

double total;
double tarifa;
System.out.println("Ingresa el numero  de personas ");
      int personas = input.nextInt();


if(personas>300){;
  tarifa=75;
}
if (personas>=200 && personas<=300) {
tarifa=85;
}
else{
  tarifa=95;
}
  total=personas*tarifa;
System.out.println("el total es de: " + total);
}
}

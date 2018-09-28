import java.util.Scanner;
public class camion{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
float total;
float tol;

    System.out.println("introdusca el numero de alumnos:");
    int t = input.nextInt();



if (t>=100){
total=t*65;
tol=total/t;
System.out.println("cada alumno paga "+tol);
System.out.println("sepago por los autobuse "+total);
}
else if (t<100 && t>=50)
{
  total=t*70;
  tol=total/t;
  System.out.println("cada alumno paga "+tol);
  System.out.println("sepago por los autobuse "+total);
}
else if (t<50 && t>=30)
{
  total=t*95;
  tol=total/t;
  System.out.println("cada alumno paga "+tol);
System.out.println("sepago por los autobuse "+total);
}
else
{
  total=4000/t;
  tol=total*t;
  System.out.println("cada alumno paga "+total);
System.out.println("sepago por los autobuse "+tol);
}
  }
}

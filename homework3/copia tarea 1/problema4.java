import javax.swing.JOptionPane;;
public class problema4{
  public static void main(String[] args) {

      double A;
        double AT;
          double AC;
            double c;

      int B=
      Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el radio y la base del triangulo rectangulo"));
          int H=
          Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la hipotenusa"));

c= Math.sqrt ((H*H)-(B*B));
AT=2*(B*c)/2;
AC=(3.1416*B*B)/2;
A= (AT+AC);


    JOptionPane.showMessageDialog(null,"el area es: " + A);
  }
}

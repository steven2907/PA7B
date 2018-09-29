import javax.swing.JOptionPane;;
public class problema3{
  public static void main(String[] args) {
      double A;
        double al;
          double ac;
            double cr;
int x=
    Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la base de la figura"));
        int y=
          Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la altura de la figura"));


    cr= y/2;

    al= (x*cr)/2;

    ac= x*cr;

    A= al + ac;

    JOptionPane.showMessageDialog(null,"el area es: " + A);
  }
}

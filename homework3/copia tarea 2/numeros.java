import javax.swing.JOptionPane;
public class numeros{
  public static void main(String[] args) {


    int A=
    Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el primer numero:"));
    int B=
    Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el segudo numero:"));


if (A>B)
  JOptionPane.showMessageDialog(null,A + " es mayor que" + B);
else
JOptionPane.showMessageDialog(null,B + " es mayor que " + A);

}
}

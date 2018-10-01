import javax.swing.JOptionPane;
public class problema6{
  public static void main(String[] args) {

double sueldo;
      int H=
      Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca las horas"));

        int HP=
        Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el pago de horas trabajadas"));

sueldo = (HP*H);
JOptionPane.showMessageDialog(null,"el sueldo semanal es " + sueldo);
}
}

import javax.swing.JOptionPane;;
public class problema2{
  public static void main(String[] args) {

      double PI= 3.1416;
      int radio=
      Integer.parseInt(JOptionPane.showInputDialog(null,"escribe el radio"));
       double area = PI * radio *radio;
       JOptionPane.showMessageDialog(null,"el area de la circunferencia es"+"\t" + area);
  }
}

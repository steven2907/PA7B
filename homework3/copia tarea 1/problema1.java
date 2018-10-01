import javax.swing.JOptionPane;
public class problema1{
  public static void main(String[] args) {

      int data=
    Integer.parseInt(JOptionPane.showInputDialog(null,"escribe la base"));
    int data2=
    Integer.parseInt(JOptionPane.showInputDialog(null,"escribe la altura"));

       double area = (data*data2);
       JOptionPane.showMessageDialog(null,"el area es"+"\t" + area);
  }
}

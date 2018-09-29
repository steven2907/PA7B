import javax.swing.JOptionPane;
public class camion{
  public static void main(String[] args) {

float total;
float tol;

      int t=
    Integer.parseInt(JOptionPane.showInputDialog(null,"introdusca el numero de alumnos:"));




if (t>=100){
total=t*65;
tol=total/t;
JOptionPane.showMessageDialog(null,"cada alumno paga "+tol);
JOptionPane.showMessageDialog(null,"sepago por los autobuse "+total);
}
else if (t<100 && t>=50)
{
  total=t*70;
  tol=total/t;
  JOptionPane.showMessageDialog(null,"cada alumno paga "+tol);
  JOptionPane.showMessageDialog(null,"sepago por los autobuse "+total);
}
else if (t<50 && t>=30)
{
  total=t*95;
  tol=total/t;
  JOptionPane.showMessageDialog(null,"cada alumno paga "+tol);
JOptionPane.showMessageDialog(null,"sepago por los autobuse "+total);
}
else
{
  total=4000/t;
  tol=total*t;
  JOptionPane.showMessageDialog(null,"cada alumno paga "+total);
JOptionPane.showMessageDialog(null,"sepago por los autobuse "+tol);
}
  }
}

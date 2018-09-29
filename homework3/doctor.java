import javax.swing.JOptionPane;
public class doctor{
  public static void main(String[] args) {

    double pago;
    double pagoc;
    int nc=
    Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de consultas que ha venido"));




   if (nc <= 3) {
     pago=200;
     pagoc=nc*200;
  JOptionPane.showMessageDialog(null,"usted va a pagar por la consulta "+pago);
  JOptionPane.showMessageDialog(null,"pago por el tratamiento "+pagoc);
   }
    else if (nc <=5) {
     pago=150;
     pagoc=(nc-3)*150+600;
     JOptionPane.showMessageDialog(null,"usted va a pagar por la consulta "+pago);
     JOptionPane.showMessageDialog(null,"pago por el tratamiento "+pagoc);
   }
      else if (nc<= 8) {
        pago=100;
        pagoc=(nc-5)*100+900;
        JOptionPane.showMessageDialog(null,"usted va a pagar por la consulta "+pago);
        JOptionPane.showMessageDialog(null,"pago por el tratamiento "+pagoc);
      }
        else{
          pago=50;
          pagoc=(nc-9)*50+1200;
          JOptionPane.showMessageDialog(null,"usted va a pagar por la consulta "+pago);
          JOptionPane.showMessageDialog(null,"pago por el tratamiento "+pagoc);
        }

  }
}

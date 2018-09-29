import javax.swing.JOptionPane;
public class banco{
  public static void main(String[] args) {

double total;
double N;
    int t=
    Integer.parseInt(JOptionPane.showInputDialog(null,"introdusca el tipo de tarjeta:"));

    int c=
    Integer.parseInt(JOptionPane.showInputDialog(null,"introduca la cantidad del pago"));



if (t==1){
total=c*.25;
JOptionPane.showMessageDialog(null,"nuevo credito es "+total);
}
else if (t==2)
{
  total=c*.35;
  JOptionPane.showMessageDialog(null,"nuevo credito es "+total);
}
else if (t==3)
{
  total=c*.40;
JOptionPane.showMessageDialog(null,"nuevo credito es "+total);
}
else
{
  total=c*.50;
JOptionPane.showMessageDialog(null,"nuevo credito es "+total);
}

N=c+total;
  JOptionPane.showMessageDialog(null,"nuevo limite de credito es " + N);

  }
}

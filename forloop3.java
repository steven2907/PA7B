import javax.swing.JOptionPane;
public class forloop3{
  public static void main(String[] args) {
int tabla= Integer.parseInt(JOptionPane.showInputDialog(null,"enter the number"));
do {
    String salida ="";
    for (int i = 0;i <=9 ;i++ ){
      salida += tabla + "x" + (i +1) + "=" + (i + 1)*tabla +"\n";
    }
JOptionPane.showMessageDialog(null,salida);
tabla= Integer.parseInt(JOptionPane.showInputDialog(null,"consulta otra tabla"));
}while(tabla !=0);
}
}

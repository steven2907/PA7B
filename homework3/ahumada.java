import javax.swing.JOptionPane;
public class ahumada{
  public static void main(String[] args) {
double total;
double tarifa;
  int personas=
  Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero  de personas "));



if(personas>300){;
  tarifa=75;
}
if (personas>=200 && personas<=300) {
tarifa=85;
}
else{
  tarifa=95;
}
  total=personas*tarifa;
JOptionPane.showMessageDialog(null,"el total es de: " + total);

}
}

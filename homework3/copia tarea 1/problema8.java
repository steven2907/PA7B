import javax.swing.JOptionPane;;
public class problema8{
  public static void main(String[] args) {

double cm;
double pago;
      int largo=
      Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca cuanto tiene de largo la alberca en m3"));
        int ancho=
        Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca cuanto tiene de ancho la alberca en m3"));
          int altura=
          Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca cuanto tiene de altura la alberca en m3"));
            int pag=
            Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el precio por m3"));


  cm=(largo*ancho*altura);
  pago=(cm*pag);

 JOptionPane.showMessageDialog(null,"usted va a pagar "+ pago);
}
}

import javax.swing.JOptionPane;
public class descuento{
  public static void main(String[] args) {

    double pag;
    int x=
    Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad"));



      if(x < 1000){
      pag = x *.90;
      JOptionPane.showMessageDialog(null,"la cantidad que vas a pagar es" + pag);
      } {
          if(x >= 1000){
            pag = x *.85;
              JOptionPane.showMessageDialog(null,"La cantidad que vas a apagar es" + pag);
          }
      }

    }
  }

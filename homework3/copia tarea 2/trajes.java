import javax.swing.JOptionPane;;
public class trajes{
  public static void main(String[] args) {

    double pag;

    int tr=
    Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad del traje"));



      if(tr > 2500){
      pag = tr * .15;
      JOptionPane.showMessageDialog(null,"el traje con descuento cuesta " + (tr-pag));
      JOptionPane.showMessageDialog(null,"el descuento es " + pag);
      } {
          if(tr <= 2500){
            pag = tr * .08;
              JOptionPane.showMessageDialog(null,"el traje con descuento cuesta " + (tr-pag));
              JOptionPane.showMessageDialog(null,"el descuento es " + pag);
          }

      }
    }
  }

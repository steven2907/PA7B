import javax.swing.JOptionPane;;
public class problema5{
  public static void main(String[] args) {

double gt;
double ag;

    int li=
    Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca la cantidad en litros"));

        int ga=
        Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el precio del galon"));
            
gt=(li/3.78);
ag=(ga*gt);


    JOptionPane.showMessageDialog(null,"la ganancia total del dia es: " + ag );
  }
}

import javax.swing.JOptionPane;

public class SentinelValue{
  public static void main(String[] args) {

    int value = Integer.parseInt( JOptionPane.showInputDialog(null,"enter a int value"));
int fact=1;
int numero=1;

while ( numero <=0) {
  factorial=factorial*numero;
  numero++;

}
JOptionPane.showMessageDialog(null,"el factorial es "+numero+" es "+ fact);
  }
}

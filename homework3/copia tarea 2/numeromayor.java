import javax.swing.JOptionPane;;
public class numeromayor{
  public static void main(String[] args) {



int pri=
Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa primer numero "));
      int seg=
      Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa segundo numero "));
        int ter=
        Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tercer numero "));

      if(pri > seg && pri > ter){
      JOptionPane.showMessageDialog(null,"El numero mayor es " + pri);
      }else{
          if(seg > pri && seg > ter){
          JOptionPane.showMessageDialog(null,"El numero mayor es " + seg);
          }else{
          JOptionPane.showMessageDialog(null,"El numero mayor es " + ter);
        }
      }

    }
  }

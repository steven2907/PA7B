import javax.swing.JOptionPane;
public class positivo{
  public static void main(String[] args) {

    int num=
    Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));

      if(num==0){
      JOptionPane.showMessageDialog(null,"El numero "+num+" es nulo");
      } else{
          if(num>0){
              JOptionPane.showMessageDialog(null,"El numero "+num+" es positivo");
          }else{
          JOptionPane.showMessageDialog(null,"El numero "+num+" es negativo");
          }
      }

      }
}

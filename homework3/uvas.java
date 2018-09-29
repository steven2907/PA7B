import javax.swing.JOptionPane;
public class uvas{
  public static void main(String[] args) {

    double sum;
    double reba;
    Double incre;

    JOptionPane.showMessageDialog(null,"ingresa 1 si el tipo de uva es A");
    JOptionPane.showMessageDialog(null,"ingresa 2 si el tipo de uva es B");
    int tipo=
    Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la tipo de uva"));


      if(tipo == 1){
        JOptionPane.showMessageDialog(null,"ingresa el tamaño de la uva");
        int tam=
        Integer.parseInt(JOptionPane.showInputDialog(null,"solo puedes ingresar el tamaño 1 y el tamaño 2"));
          if (tam == 1) {
            int kilo=
            Integer.parseInt(JOptionPane.showInputDialog("ingresa cuantos kilos compraste"));

          incre = (kilo*.20);
          sum = ((kilo*20)+incre);
          JOptionPane.showMessageDialog(null,"tu vas a pagar " + sum);
        } else{
             int kilo=
             Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa cuantos kilos compraste"));
             incre = (kilo*.30);
             sum = ((kilo*20)+incre);
             JOptionPane.showMessageDialog(null,"tu vas a pagar " + sum);
  }    } {
          if(tipo == 2){
            JOptionPane.showMessageDialog(null,"ingresa el tamaño de la uva");
            int tam=
            Integer.parseInt(JOptionPane.showInputDialog("solo puedes ingresar el tamaño 1 y el tamaño 2"));

              if (tam == 1) {
              int kilo=
              Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa cuantos kilos compraste"));

              reba = (kilo*.20);
              sum = ((kilo*20)-reba);
              JOptionPane.showMessageDialog(null,"tu vas a pagar " + sum);
            }else{
                 int kilo=
                 Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa cuantos kilos compraste"));

                 reba = (kilo*.50);
                 sum = ((kilo*20)-reba);
                 JOptionPane.showMessageDialog(null,"tu vas a pagar " + sum);
        }  }

      }
    }
  }

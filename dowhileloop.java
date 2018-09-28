import javax.swing.JOptionPane;
public class dowhileloop{
  public static void main(String[] args) {
    int data;
    int sum =0;


      do {
        data=
          Integer.parseInt(JOptionPane.showInputDialog(null,"enter an int value the program exits if the imput is 0 "));

        sum += data;
      } while (data != 0);
          JOptionPane.showMessageDialog(null,"the value is "+ data);
  }
}

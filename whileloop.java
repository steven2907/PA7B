import javax.swing.JOptionPane;
public class whileloop{
  public static void main(String[] args) {
    int number= (int)(Math.random()*100);

      int guess = -1;
      //mientras(condicion)
      while(guess !=number){
        guess=
        Integer.parseInt(JOptionPane.showInputDialog("guess a magic number between 0 and 100"));
        if (guess == number){
          JOptionPane.showMessageDialog(null,"yes the number is"+number);
        }else if (guess > number){
          JOptionPane.showMessageDialog(null,"your guess is too high");
        }else{
          JOptionPane.showMessageDialog(null, "your guess in too low");
        }
      }
  }
}

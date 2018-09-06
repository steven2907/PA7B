import java.util.Scanner;
//importar en libreria scanner
public class ComputeChage {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //agregar una variable tipo scanner
        System.out.println("enter an amount in double:");
          //le digo a el unuario que va a hacer
            double amount = input.nextDouble();
              //se ingresa a la varable
                  int cents = (int)(amount * 100);
                    int numberOfDollaars = cents / 100;
                      // encontrar el numero e dolares
                          cents = cents % 100;
                            int numberOfQuarters= cents / 25;
                              // encontrar los cuartos de dolares
                                cents = cents % 25;
                                  int numberOfDimes = cents / 10;
                                    cents = cents % 10;
                                      ///encontrar los niquels * 5
                                        int numberOfNickel = cents / 5;
                                          cents = cents % 5;
                                              int numberOfPennies = cents;
                                                // peniques
                                                    System.out.println("your amount" + amount +
                                                        "consist of \n"+ "\t" + numberOfDollaars +"dollars"+
                                                          "\t" + numberOfQuarters+"Quarters" +
                                                                  "\t" + numberOfDimes +"Dimes"+
                                                                        "\t"+ numberOfNickel + "nickels"+
                                                                              "\t" + numberOfPennies + "pennies");




  }

}

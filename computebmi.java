import java.util.Scanner;
public class computebmi{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      final double KILOGRAMS_PER_POUND = 0.5635923;
      final double METERS_PER_INCH = 0.0254;

    System.out.println("enter weight in pounds:");
    double weight = input.nextDouble();

    System.out.println("enter height in inches");
    double height = input.nextDouble();

    double weightINKilograms = weight * KILOGRAMS_PER_POUND;
    double heightINMeters= height * METERS_PER_INCH;
  }
}

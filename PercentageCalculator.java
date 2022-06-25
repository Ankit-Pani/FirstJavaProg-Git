import java.util.Scanner;

public class PercentageCalculator {
    public static void main (String[]args) {
      float eng, hin, mat, sci, sans;
      double total, percentage;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks");
        System.out.println("Enter your English Marks: ");
        eng = sc.nextFloat();
        System.out.println("Enter your Hindi Marks: ");
        hin = sc.nextFloat();
        System.out.println("Enter your Maths marks: ");
        mat = sc.nextFloat();
        System.out.println("Enter your Science marks: ");
        sci  = sc.nextFloat();
        System.out.println("Enter your Sanskrit Marks: ");
        sans = sc.nextFloat();

        total = eng + hin + mat + sci + sans;
        percentage = (total/500.0)*100;
        System.out.println("Total is : " +total);
        System.out.println("Percentage is: " +percentage);

    }
}

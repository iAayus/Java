import java.util.Scanner;

public class IntFloat {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("input values");
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                int a = sc.nextInt();
                sum = sum + a;
            }
            double avg = sum / 5.0;
            System.out.println(avg);
        }
    }
}
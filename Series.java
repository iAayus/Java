import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the series: ");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter element " + i + ": ");
                int num = sc.nextInt();
                sum += num;
            }
            System.out.println("The sum of the series is: " + sum);
        }
    }
}

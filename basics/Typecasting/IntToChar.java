import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Int Number");
            int i = sc.nextInt();
            char ch = (char) i;
            System.out.println("The character value of the given Int is: " + ch);
        }
    }
}
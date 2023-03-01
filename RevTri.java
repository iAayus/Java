public class RevTri {
    public static void main(String[] args) {
        int size = 5;
        for (int i = size; i > 0; i--) {
            for (int j = 1; j < size - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
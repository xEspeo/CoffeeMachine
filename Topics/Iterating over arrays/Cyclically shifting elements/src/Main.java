import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Cyclically shift the array to the right
        int last = array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = last;

        // Output the shifted array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        // put your code here
    }
}
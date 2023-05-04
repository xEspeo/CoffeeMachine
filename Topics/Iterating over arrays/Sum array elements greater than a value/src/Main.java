import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int length = scanner.nextInt();
        int[] array = new int[length];

        for(int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        for(int x : array) {
            if(x > n) {
                sum += x;
            }
        }

        System.out.println(sum);
    }
}
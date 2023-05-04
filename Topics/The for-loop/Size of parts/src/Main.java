import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int perfectCount = 0;
        int fixCount = 0;
        int rejectCount = 0;
        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            if (size > 0) {
                fixCount++;
            } else if (size < 0) {
                rejectCount++;
            } else {
                perfectCount++;
            }
        }
        System.out.println(perfectCount + " " + fixCount + " " + rejectCount);
    }
}
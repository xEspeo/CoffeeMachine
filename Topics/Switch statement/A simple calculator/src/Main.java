import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long inputNumberOne = scanner.nextLong();
        String inputOperator = scanner.next();
        long inputNumberTwo = scanner.nextLong();

        switch (inputOperator) {
            case "+":
                System.out.println(inputNumberOne + inputNumberTwo);
                break;
            case "-":
                System.out.println(inputNumberOne - inputNumberTwo);
                break;
            case "*":
                System.out.println(inputNumberOne * inputNumberTwo);
                break;
            case "/":
                if(inputNumberTwo != 0) {
                    System.out.println(inputNumberOne / inputNumberTwo);
                    break;
                } else {
                    System.out.println("Division by 0!");
                    break;
                }
            default:
                System.out.println("Unknown operator");
        }
    }
}
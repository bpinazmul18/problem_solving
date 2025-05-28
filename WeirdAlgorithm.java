import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputNum = scanner.nextLong();

        StringBuilder result = new StringBuilder();
        result.append(inputNum).append(" ");

        while (inputNum != 1) {
            if (inputNum % 2 == 0) {
                inputNum /=2;
            } else {
                inputNum = inputNum * 3 + 1;
            }
            result.append(inputNum).append(" ");
        }

        System.out.println(result.toString().trim());
        scanner.close();
    }
}

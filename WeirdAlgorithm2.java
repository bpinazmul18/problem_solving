import java.util.Scanner;
 
public class WeirdAlgorithm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputNum = scanner.nextLong();
 
        while (inputNum != 1) {
            System.out.print(inputNum + " ");
 
            if (inputNum % 2 == 0) {
                inputNum /= 2;
            } else {
                inputNum = inputNum * 3 + 1;
            }
        }
        System.out.println(inputNum);
        scanner.close();
    }
}

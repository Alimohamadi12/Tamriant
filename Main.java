import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Height");
        int Height = scanner.nextInt();
        int value;
        int add = 0;
        System.out.println("Enter the values for the Height");
        for (int i = 0; i < Height; i++) {
            value = scanner.nextInt();
            add = add + value;
            if (value < 0) {
                System.out.println("error The number must be positive");
            }
        }
        System.out.println(add/2);
    }
}
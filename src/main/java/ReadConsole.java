import java.util.Scanner;

public class ReadConsole {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        System.out.println("Enter integer:");
        return scanner.nextInt();
    }

    public static char getOperator() {
        System.out.println("Enter operator(+,-,* or /): ");
        return scanner.next().charAt(0);
    }
}

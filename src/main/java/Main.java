

public class Main {
    public static void main(String[] args) {

        int num1 = ReadConsole.getInt();
        char operator = ReadConsole.getOperator();
        int num2 = ReadConsole.getInt();
        System.out.println("Result: " + Calculator.calculate(num1, num2, operator) + "\n");

    }
}

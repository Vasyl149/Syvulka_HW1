
public class Calculator {
    static float result = 0;

    public static float calculate(int n1, int n2, char operator) {
        switch (operator) {
            case '+':
                result = (float)n1 + n2;
                break;
            case '-':
                result = (float)n1 - n2;
                break;
            case '*':
                result = (float)n1 * n2;
                break;
            case '/':
                result = (float) n1 / n2;
                break;
            default:
                System.out.println("Incorrect operator input!");
        }
        return result;

    }



}

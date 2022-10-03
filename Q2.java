import java.util.Scanner;
@FunctionalInterface
interface actionInterface {
    int action(int a, int b);
}

public class Q2 {
    static int multiply(int a, int b) {
        return a*b;
    }
    int addition(int a, int b) {
        return a+b;
    }
    int subtraction(int a, int b) {
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        actionInterface mulVariable = Q2::multiply;
        System.out.println("Multiply using static method reference: "+mulVariable.action(num1, num2));
        actionInterface addVariable = new Q2()::addition;
        System.out.println("Add using instance method reference: "+addVariable.action(num1, num2));
        actionInterface subVariable = new Q2()::subtraction;
        System.out.println("Subtract using instance method reference: "+subVariable.action(num1, num2));
        sc.close();
    }
}
import java.util.Scanner;

@FunctionalInterface
interface compareInterface {
    boolean compare(int a, int b);
}
@FunctionalInterface
interface increment {
    int incrementByOne(int n);
}
@FunctionalInterface
interface concat {
    String concatString(String a, String b);
}
@FunctionalInterface
interface uppercase {
    String convert(String a);
}

public class Q1 {
    public static void main(String[] args) {
        compareInterface test = (a, b) -> a>b;
        Scanner sc = new Scanner(System.in);

        //1
        System.out.println("Enter two number you want to compare: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1+" is greater than "+num2+" ? "+test.compare(num1, num2));

        //2
        increment obj = (n) -> n+1;
        System.out.println("Enter the number to be incremented: ");
        int c = sc.nextInt();
        System.out.println("result: "+obj.incrementByOne(c));

        //3
        concat obj3 = (a, b) -> a+b;
        System.out.println("Enter two strings for concatenation ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("result: "+obj3.concatString(str1, str2));

        //4
        uppercase o = (s) -> s.toUpperCase();
        System.out.println("convert string to uppercase");
        String str3 = sc.nextLine();
        System.out.println("result: "+o.convert(str3));
        sc.close();
    }
}
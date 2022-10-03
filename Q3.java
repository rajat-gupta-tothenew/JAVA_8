public class Q3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("Inside a thread using Lambda."));
        thread1.start();
    }
}

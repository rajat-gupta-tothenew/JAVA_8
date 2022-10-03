
interface A{
    default void print(){
        System.out.println("A");
    }
}
interface B{
    default  void print(){
        System.out.println("B");
    }
}
public class Q5 implements A,B{
        public void print(){
            System.out.println("Multiple Inheritance");
        }

        public static void main(String[] args) {
            Q5 obj = new Q5();
            obj.print();
        }
}

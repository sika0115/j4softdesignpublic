package basic.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int a = 1, b = 0,c;
            c = a / b;
            System.out.println(c);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");

        }

    }
    
}
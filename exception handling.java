public class Main{

    public static void main(String[] args) {
        int a = 30, b = 0;
        int c = 0;

        try {
            try {
                try {
                    c = a / b;
                } catch (ArithmeticException e) {
                    System.out.println("Exception occured");
                }
            } catch (ArithmeticException e) {
                System.out.println("Exception occured");

            }
        }
        catch(ArithmeticException e) {
            System.out.println("Exception occured");

        }
        catch (NullPointerException e) {
            System.out.println("Index Not found");
        }
        finally {
            int N=10;
            int num1 = 0, num2 = 1;
            for (int i = 0; i < N; i++) {
                System.out.print(num1 + " ");
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
            }
            System.out.println(N);
        }

        System.out.println(c);
        System.out.println("End of the program");

    }

}

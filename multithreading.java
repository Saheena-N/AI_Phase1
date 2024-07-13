class Book implements Runnable{
    public void run() {
        for (int i = 1;i<=5;i++) {
            System.out.println("Mango Db");

            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Num extends Thread{
    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println(i);

            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}

public class Main{

    public static void main(String[] args) {
        Runnable book = new Book();
        Num num = new Num();
        Thread t1=new Thread(book);
        //book.UpdateDB();
        //num.Print();
        t1.start();
        num.start();

        System.out.println("End of the program");


    }

}

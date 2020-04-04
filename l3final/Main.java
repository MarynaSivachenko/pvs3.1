package l3;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Factorization());
        Thread thread2 = new Thread(new Time());
        thread1.start();
        thread2.start();
    }
}

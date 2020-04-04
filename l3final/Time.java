package l3;

public class Time implements Runnable{

    @Override
    public void run() {
        try{
            Thread.currentThread().sleep(3000);
            System.exit(0);
        }catch (Exception e) {

        }

    }
}

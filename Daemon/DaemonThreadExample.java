package Daemon;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Daemon Thread " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.setDaemon(true);
        th.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }
        }
    }
}

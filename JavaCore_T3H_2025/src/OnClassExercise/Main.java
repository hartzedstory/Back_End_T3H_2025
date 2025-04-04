package OnClassExercise;

public class Main {
    public static void main(String[] args) {
        String threadName1 = "Runnable thread 1";
        String threadName2 = "Runnable thread 2";
        String threadName3 = "Runnable thread 3";
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(String.format("Thread name: %s start running", threadName1));
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1: " + i);
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }

                System.out.println(String.format("Thread name: %s end running", threadName1));
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(String.format("Thread name: %s start running", threadName2));
                for (int i = 11; i < 20; i++) {
                    System.out.println("Thread 2: " + i);
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }

                System.out.println(String.format("Thread name: %s end running", threadName2));
            }
        };

        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                System.out.println(String.format("Thread name: %s start running", threadName3));
                for (int i = 21; i < 30; i++) {
                    System.out.println("Thread 3: " + i);
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }

                System.out.println(String.format("Thread name: %s end running", threadName3));
            }
        };


        //Chay thread
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

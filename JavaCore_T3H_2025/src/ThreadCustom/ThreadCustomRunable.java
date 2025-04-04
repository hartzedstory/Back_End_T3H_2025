package ThreadCustom;

public class ThreadCustomRunable {
    public static void main(String[] args) {
        String threadName = "Runnable thread";
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // Hàm này sẽ đươợc chay khi tạo ra mot thread moi
                // --> Các hành động khi thực hiện của thread sẽ đươợc viết trong method nay
                System.out.println(String.format("Thread name: %s", threadName));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}

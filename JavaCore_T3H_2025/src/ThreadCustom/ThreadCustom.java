package ThreadCustom;

public class ThreadCustom extends Thread {
    private String threadName;

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public ThreadCustom(String threadName) {
        super(threadName);
        this.setThreadName(threadName);
    }

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

    public static void main(String[] args) {
        // Tao ra mot thread
        ThreadCustom tc1 = new ThreadCustom("Thread manual");
        tc1.start();

        // Tao ra nhieu thread va chay
        for (int i = 0; i < 3; i++) {
            //Tao ra thread
            ThreadCustom tc = new ThreadCustom("Thread" + i);

            //Chay thread
            tc.start();
        }
    }
}

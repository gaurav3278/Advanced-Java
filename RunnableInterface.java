class RunnableInterface implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }
    public static void main(String args[]) {
        RunnableInterface m1 = new RunnableInterface();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
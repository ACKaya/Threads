public class Counter extends Thread{
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName());
        System.out.print("/");
        for(int i=0;i<100;i++){
            System.out.print(i+",");
        }
    }
}

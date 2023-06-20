package job05;

public class CounterThread extends Thread{
    public void run(int end, int begin) {
        for (int i=begin; i<=end; i++) {
            System.out.println(i);
        }
    }
}

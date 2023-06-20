package job07;

public class SumThread extends Thread{
    public int run(int[] array) {
        int counter = 0;
        for (int i =0; i<array.length; i++) {
            counter += array[i];
        }

        System.out.println("Total : " + counter);
        return counter;
    }
}

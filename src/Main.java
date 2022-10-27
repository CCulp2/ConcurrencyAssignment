import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTimeThreaded = System.nanoTime();
        ThreadedArray threadedArray1 = new ThreadedArray(100000000);
        ThreadedArray threadedArray2 = new ThreadedArray(100000000);
        threadedArray1.start();
        threadedArray2.start();
        threadedArray1.join();
        threadedArray2.join();
        SumArrays sum1 = new SumArrays(threadedArray1.completedArray);
        SumArrays sum2 = new SumArrays(threadedArray2.completedArray);
        sum1.start();
        sum2.start();
        sum1.join();
        sum2.join();
        int answ = sum1.getSum() + sum2.getSum();
        long endTimeThreaded = System.nanoTime();
        System.out.println("Sum is: " + answ);
        System.out.println("Threaded sum took " + TimeUnit.SECONDS.convert(endTimeThreaded - startTimeThreaded, TimeUnit.NANOSECONDS) + " seconds.");
        long startTime = System.nanoTime();
        NonThreadedArray nonThreadedArray = new NonThreadedArray(200000000);
        nonThreadedArray.makeArray();
        SumArrays sum = new SumArrays(nonThreadedArray.completedArray);
        sum.runSum();
        answ = sum.getSum();
        long endTime = System.nanoTime();
        System.out.println("Sum is: " + answ);
        System.out.println("Non-threaded sum Took " + TimeUnit.SECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS) + " seconds.");









    }
}
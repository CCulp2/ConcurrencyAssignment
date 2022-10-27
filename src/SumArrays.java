public class SumArrays extends Thread {

    int sum;
    int[] intArray;

    public SumArrays(int[] intArray) {
        this.intArray = intArray;
    }

    @Override
    public void run() {
        runSum();
    }

    public int getSum() {
        return sum;
    }

    public void runSum() {
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

    }
}

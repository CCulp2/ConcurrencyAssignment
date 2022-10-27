public class ThreadedArray extends Thread {
    final int SIZE = 200000000;
    final int MAX = 10;
    final int MIN = 1;
    int userSize = 0;
    int[] completedArray;

    public ThreadedArray() {

    }

    public ThreadedArray(int userSize) {
        this.userSize = userSize;
    }

    @Override
    public void run() {
        if (userSize == 0) {
            completedArray = makeArray();
        } else {
            completedArray = makeArray(userSize);
        }
    }

    public int[] makeArray() {
        int[] intArray = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            intArray[i] = (int)((Math.random() * ((MAX - MIN+1)+MIN)));
        }
        return intArray;
    }

    public int[] makeArray(int userSize) {
        int[] intArray = new int[userSize];
        for (int i = 0; i < userSize; i++) {
            intArray[i] = (int)((Math.random() * ((MAX - MIN+1)+MIN)));
        }
        return intArray;
    }
}

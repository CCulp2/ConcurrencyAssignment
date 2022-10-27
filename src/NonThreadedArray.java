public class NonThreadedArray {
    final int SIZE = 200000000;
    final int MAX = 10;
    final int MIN = 1;
    int userSize = 0;
    int[] completedArray;

    public NonThreadedArray(int size) {
        completedArray = new int[size];
    }

    public void makeArray() {
        for (int i = 0; i < completedArray.length; i++) {
            completedArray[i] = (int)((Math.random() * ((MAX - MIN+1)+MIN)));
        }

    }


}

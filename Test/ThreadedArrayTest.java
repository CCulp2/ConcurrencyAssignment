import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ThreadedArrayTest {

    ThreadedArray threadedArray;
    int size = 10;

    @BeforeEach
    void setUp() {
        threadedArray = new ThreadedArray(10);

    }



    @org.junit.jupiter.api.Test
    void makeArray() {
        int[] returnedArray = threadedArray.makeArray(size);
        assertEquals(returnedArray.length, size);
    }

}
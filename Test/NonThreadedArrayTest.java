import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonThreadedArrayTest {

    NonThreadedArray testArray;
    int size = 10;

    @BeforeEach
    void setUp() {
        testArray = new NonThreadedArray(size);
    }

    @Test
    void makeArray() {
        testArray.makeArray();
        assertNotNull(testArray.completedArray);
    }
}
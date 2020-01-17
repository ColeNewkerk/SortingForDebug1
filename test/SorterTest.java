import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    @Test
    void sortTest() {
        var someList = new ArrayList<Integer>(Arrays.asList(1, 9, 2, 8, 3, 7, 4, 6, 5));
        Sorter.sort(someList);
        for (int i = 1; i < 10; i++) {
            assertEquals(i, someList.get(i - 1));
        }
    }
}
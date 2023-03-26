package Running_Sum_of_1D_Array_1480;

import org.junit.Test;

import static Running_Sum_of_1D_Array_1480.Solution.runningSum;
import static org.junit.Assert.assertArrayEquals;

public class RunningSumTest {
    @Test
    public void testRunningSum() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};
        int[] actual = runningSum(nums);
        assertArrayEquals(expected, actual);
    }
}

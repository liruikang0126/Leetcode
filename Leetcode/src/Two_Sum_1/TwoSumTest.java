package Two_Sum_1;

import org.junit.Test;

import static Two_Sum_1.Solution.twoSum;
import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}

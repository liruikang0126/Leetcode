package Find_Pivot_Index_724;
import org.junit.Test;

import static Find_Pivot_Index_724.Solution.pivotIndex;
import static org.junit.Assert.*;

public class PivotIndexTest {

    @Test
    public void testPivotIndex() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int expected = 3;
        int actual = pivotIndex(nums);
        assertEquals(expected, actual);
    }
}

package Is_Subsequence_392;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsSubsequenceTest {
    @Test
    public void isSubsequenceTest() {
        String a1 = "abc";
        String b1 = "ahbgdc";
        String a2 = "axc";
        String b2 = "ahbgdc";
        boolean expected1 = true;
        boolean expected2 = false;
        boolean actual1 = Solution.isSubsequence(a1, b1);
        boolean actual2 = Solution.isSubsequence(a2, b2);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}

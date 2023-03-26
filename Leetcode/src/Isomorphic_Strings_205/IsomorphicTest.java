package Isomorphic_Strings_205;

import org.junit.Test;

import static Isomorphic_Strings_205.Solution.isIsomorphic;
import static org.junit.Assert.assertEquals;

public class IsomorphicTest {
    @Test
    public void isomorphicTest() {
        String a1 = "foo";
        String b1 = "bar";
        String a2 = "badc";
        String b2 = "baba";
        String a3 = "title";
        String b3 = "paper";
        boolean expected1 = false;
        boolean expected2 = false;
        boolean expected3 = true;
        boolean actual1 = isIsomorphic(a1, b1);
        boolean actual2 = isIsomorphic(a2, b2);
        boolean actual3 = isIsomorphic(a3, b3);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }
}

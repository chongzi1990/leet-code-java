package test;

import l1.Solution;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution;
    @Before
    public void init() throws Exception {
        solution = new Solution();
    }
    @Test
    public void testTwoSum() {
        int[] test = new int[]{1, 2, 7, 15, 8};
        int[] result = solution.twoSum(test, 17);
        System.out.println(Arrays.toString(result));
    }
}

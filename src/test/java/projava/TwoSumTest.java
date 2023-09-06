package projava;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class TwoSumTest {
    @Test
    void Case1() {
        int[] nums = {2,7,11,15};
        int target = 9;
        var actual = new TwoSum().twoSum(nums, target);
        int[] expected = {0,1};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void Case2() {
        int[] nums = {3,2,4};
        int target = 6;
        var actual = new TwoSum().twoSum(nums, target);
        int[] expected = {1,2};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void Case3() {
        int[] nums = {3,3};
        int target = 6;
        var actual = new TwoSum().twoSum(nums, target);
        int[] expected = {0,1};
        Assertions.assertArrayEquals(expected, actual);
    }
}

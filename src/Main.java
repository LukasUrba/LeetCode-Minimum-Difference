import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minDifference(new int[]{6,6,0,1,1,4,6}));
    }
    public static int minDifference(int[] nums) {
//        For any arrays shorter than 5, with 3 moves all numbers will be the same
        if (nums.length<=4) {
            return 0;
        }
//        Sort moved down so memory is not wasted if array too short on sorting
        Arrays.sort(nums);
        int diff = nums[nums.length-1] - nums[0];
        for (int i = 0; i <=3; i++) {
//            Compares the current difference of the whole array, with the difference between numbers in array with 3 elements removed from either side
            diff = Math.min(diff, nums[nums.length-(3-i)-1]-nums[i]);
        }

        return diff;
    }
}
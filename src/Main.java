import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minDifference(new int[]{3,100,20}));
    }
    public static int minDifference(int[] nums) {
        Arrays.sort(nums);
        if (nums.length<3) {
            nums[nums.length-1] = nums[0];
        } else {
            for (int i = 1;i <=3; i++) {
                nums[nums.length-i] = nums[0];
            }
        }
//        Sort the array again to see the difference
        Arrays.sort(nums);
        return nums[nums.length-1]-nums[0];
    }
}
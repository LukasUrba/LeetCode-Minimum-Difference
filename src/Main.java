import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minDifference(new int[]{6,6,0,1,1,4,6}));
    }
    public static int minDifference(int[] nums) {
        int counter1 = 0, counter2 = nums.length;
        Arrays.sort(nums);
        if (nums.length<3) {
            nums[nums.length-1] = nums[0];
        } else {
            for (int i = 0; i <3; i++) {
                int highestDiff = 0;
//                int difference1 = Math.abs(nums[counter1]-nums[counter1+1]), difference2 = Math.abs(nums[counter2-1]-nums[counter2-2]);
//                if (difference1>=difference2) {
//                    nums[counter1] = nums[counter1+1];
//                    counter1++;
//
//                } else {
//                    nums[counter2-1] = nums[counter2-2];
//                    counter2--;
//
//                }
            }
        }
//        Sort the array again to see the difference
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums[nums.length-1]-nums[0];
    }
}
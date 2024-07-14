import java.util.*;
class SumOfTwo_program {



    public static int[] twoSum(int[] nums, int target) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an array size: ");
        int size = scan.nextInt();
        nums = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }


        System.out.println("Enter a target: ");
        target = scan.nextInt();

        if (nums[0] + nums[1] == target) {
            return new int[]{0,1};
        }

        return new int[]{};
    }


    public static void main(String args[]){
        int[] nums = {};
        int target = 0;
        int[] result = twoSum(nums, target);

        if (result.length > 0) {
            System.out.println("Result: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No matching pair found.");
        }
    }
}
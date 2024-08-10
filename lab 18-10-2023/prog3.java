import java.util.Scanner;

public class prog3 {
    public static int bs(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int[] nums = new int[sc.nextInt()];
        System.out.println("Enter sorted array: ");
        for (int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt();
        System.out.println("Enter target to search: ");
        int target = sc.nextInt();

        int result = bs(nums, target);
        System.out.println((result != -1) ? "result found at index: " + result : "result not found.");
        sc.close();
    }
}

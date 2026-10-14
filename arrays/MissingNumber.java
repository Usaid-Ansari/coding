public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 0, 5, 6};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
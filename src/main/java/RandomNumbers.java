public class RandomNumbers {
    public static void main(String[] args) {
        double[] nums = new double[100];
        double x=0;
        for (int i = 0; i <nums.length; i++) {
            nums[i]=Math.random();
            x = Math.sqrt(nums[i]) + x;
        }
        System.out.println(x);
    }
}

import java.util.Arrays;

public class three {
    public static void main(String[] args){
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        Arrays.sort(nums);
        int a = 0;
        int b = 0;
        int c = 0;
        for (int d = nums[0]; d <= nums[nums.length-1]; d++) {
            for (int i = 0; i < nums.length; i++){
                if (nums[i] == d){
                    b++;
                }
                else{
                    if (b > a){ a = b; c = d;}
                    b = 0;
                }
            }
            if (b > a){
                a = b; c = d;}
        }
        System.out.println(c);
    }
}

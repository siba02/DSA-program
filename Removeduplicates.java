//? Remove duplicates from a sorted array.(Easy 57%  No-26).

import java.util.Arrays;

public class Removeduplicates {
    public static int[] findduplicates(int []nums){
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                ++j;
                nums[j]=nums[i];
                
            }
    }
    
    // Return only the unique part
        return Arrays.copyOf(nums, j + 1);
}

public static void main(String[] args) {
    int[] nums = {1, 2, 3, 3, 4, 4, 5};
    int[]  duplicates = Removeduplicates.findduplicates(nums);
    System.out.println(Arrays.toString(duplicates));
        }
   
    }
    

    





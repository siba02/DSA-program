public class TargetSum {
    public static int TargetSumDP(int[] nums, int target) {
        int n = nums.length;
        int sum =0;
        for(int num:nums) {
            sum+=num;
        }
        if((sum+target)%2!=0 || (sum+target)<0){
            return 0;
        }
        sum=(sum+target)/2;

        int[][] t=new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    t[i][j]=0;
                }
                if(j==0){
                    t[i][j]=1;
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(nums[i-1]<=j){
                    t[i][j]=t[i-1][j-nums[i-1]]+t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[]args){
        int[]nums={1,1,1,1,1};
        int target=3;
        System.out.println(TargetSumDP(nums,target));
    }
    
}

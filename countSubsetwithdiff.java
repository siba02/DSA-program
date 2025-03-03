public class countSubsetwithdiff {

    public static int A(int []nums,int diff){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int target=(diff+sum)/2;
        int t[][]=new int[n+1][target+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=target;j++){
                if(i==0){
                    t[i][j]=0;
                }
                if(j==0){
                    t[i][j]=1;
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(nums[i-1]<=j){
                    t[i][j]=t[i-1][j-nums[i-1]] + t[i-1][j];
                } else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][target];

    }

    public static void main(String[] args) {
        int nums[]={1,1,2,3};
        int diff=1;
        System.out.println("Number of subsets with difference 1: " + A(nums,diff));
    }  
}
    


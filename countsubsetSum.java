public class countsubsetSum {
    public static int sol(int[]nums,int sum){
      
        int n=nums.length;
        int  t[][] =new int [n+1][sum+1];

        for (int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                   t[i][j] = 0;
                }
                if(j==0){
                   t[i][j] = 1;
            }
        }

 }

 for(int i=1;i<=n;i++){
     for(int j=1;j<=sum;j++){
         if(nums[i-1]<=j)
            t[i][j]=t[i-1][j-nums[i-1]] + t[i-1][j];
         else
            t[i][j]=t[i-1][j];
     }
 }
 return t[n][sum];
}
    public static void main(String[] args) {
      int nums[]={2,3,5,8,10};
      int sum=18;

      
      System.out.println("Number of subsets with sum : " + sol(nums,sum));
        
    }
}
    


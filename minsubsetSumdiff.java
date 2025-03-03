public class minsubsetSumdiff {
    public static int SubsetSumDiff(int[] arr) {
        int n=arr.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int range=sum/2;

        boolean t[][]=new boolean[n+1][range+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=range;j++){
                if(i==0){
                    t[i][j]=false;
                }
                if(j==0){
                    t[i][j]=true;
                }
        
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= range; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
    
        int minDiff = 0;
        for(int s1=range; s1>=0; s1--){
            if(t[n][s1]){
                minDiff = s1;
                break;
            }
        }
            return Math.abs(sum-2*minDiff);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 6, 5, 11};
        System.out.println("Minimum subset sum difference: " + SubsetSumDiff(arr));
    }
    
}

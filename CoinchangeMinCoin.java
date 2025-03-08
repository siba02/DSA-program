public class CoinchangeMinCoin {
    public static int coinChange(int[]coin,int sum){
        int n=coin.length;

        int t[][]=new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    t[i][j]=Integer.MAX_VALUE-1;
                }
                if(j==0){
                    t[i][j]=0;
                }
            }
        }
        for(int j=1;j<=sum;j++){
            if(j%coin[0]==0){
                t[1][j]=j/coin[0];
            }else
            {
                t[1][j]=Integer.MAX_VALUE-1;
            }
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(coin[i-1]<=j){
                    t[i][j]=Math.min(1+t[i][j-coin[i-1]],t[i-1][j]);
                }else
                {
                    t[i][j]=t[i-1][j];
                }
            }
    }
        return t[n][sum];
    }
    public static void main(String[] args){
        int[] coin = {1, 2, 5};
        int sum = 7;
        System.out.println("Minimum coins needed: " + coinChange(coin, sum));
    }
    
}

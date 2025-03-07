public class CoinchangeMaxWay {
    public static int Maxway(int coin[],int sum){
        int n=coin.length;
        int t[][]=new int[n+1][sum+1];
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
                if(coin[i-1]<=j){
                    t[i][j]=t[i-1][j] + t[i][j-coin[i-1]];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
            return t[n][sum];
    }
    public static void main(String[] args) {
        int coin[]={1,2,3};
        int sum=100;
        System.out.println("Maximum number of ways to make " + sum +" is " + Maxway(coin, sum));
    }
    
}

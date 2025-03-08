public class ShortestCommonSupersequence {
    public static int Supersequence(String x,String y,int m,int n){
        int[][]t=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1)== y.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return m+n-t[m][n];
    }
    public static void main(String[] args) {
        String x="aggtab";
        String y="gxtxayb";
        int m=x.length();
        int n=y.length();
        System.out.println("Length of Shortest Common Supersequence is " + Supersequence(x,y,m,n));
        
    }
    
}

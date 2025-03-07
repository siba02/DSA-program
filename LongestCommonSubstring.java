public class LongestCommonSubstring {
    public static int comstring(String x,String y,int m,int n){
        int t[][]=new int [m+1][n+1];
        int maxlength=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                    maxlength=Math.max(maxlength,t[i][j]);
                }
                else{
                    t[i][j]=0;
                }
            }
        }
        return maxlength;

    }
    public static void main(String[] args) {
        String x="abefgh";
        String y="acdtefgh";
        int m=x.length();
        int n=y.length();
        System.out.println("Length of LCS is " + comstring(x,y,m,n));
    }


    
}
    


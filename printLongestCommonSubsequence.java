public class printLongestCommonSubsequence {
    public static String Plcs(String x,String y,int m,int n){
        int [][]t =new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
                
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j] = t[i-1][j-1]+1;
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        int i=m;
        int j=n;
        StringBuilder s = new StringBuilder();
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                s.append(x.charAt(i - 1));
                i--;
                j--;
            }
            else if(t[i-1][j]>t[i][j-1]){
               
                i--;
            }
            else{
                
                j--;
            }
        }
        return s.reverse().toString();
    }
    public static void main(String[] args) {
        String x="abcdfglk";
        String y="abcvxzk";
        int m=x.length();
        int n=y.length();
        System.out.println("Longest Common Subsequence: "+Plcs(x, y, m, n));
    }
    
}

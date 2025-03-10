public class LongestRepeatingSubsequence {
    public static int RepeatingSubsequence(String x,int m){
        int[][] t=new int[m+1][m+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(x.charAt(i-1)==x.charAt(j-1) && i!=j){
                    t[i][j]=t[i-1][j-1]+1;
                }else{
                    t[i][j]=Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        return t[m][m];
    
    }
    public static void main(String[] args) {
        String x = "aabebcdd";
        int m=x.length();
        System.out.println("Length of the Longest repeating subsequence is: " + RepeatingSubsequence(x,m));
        
    }
    
}

public class SequencePatternMatching {
    public static boolean patternMatch(String x,String y,int m,int n){
        int[][] t =new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                t[i][j]=0;
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        if(t[m][n]==m){
            return true;
        }
        return false;


    }
    public static void main(String[] args) {
        String x="axy";  
        String y="adxcpy";
        int m=x.length();
        int n=y.length();
        System.out.println("Pattern found at index: "+patternMatch(x, y,m,n));  
    
}
}
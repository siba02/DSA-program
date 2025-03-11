public class MinimumInserttoMakeaStringPalindrome {
    public static int minInsertions(String x,int m){
        String y=new StringBuffer(x).reverse().toString();
        int n=y.length();
        int[][] t = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
                
            }
        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(x.charAt(i-1) == y.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                }
                else{
                    t[i][j] =  Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
      int intertion=0;
      intertion=m-t[m][n];
        return intertion;
    
    }
    public static void main(String[] args) {
        String x = "aebcbda";
        int m=x.length();
        System.out.println("Minimum insertions to make " + x + " palindrome: " + minInsertions(x, m));   
}
}

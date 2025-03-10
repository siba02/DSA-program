public class PrintShortestCommonSuperSequence {
    public static String commonSupersequence(String x,String y,int m,int n){
        int[][] t = new int[m+1][n+1];
        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                if(i==0 || j==0) {
                    t[i][j]=0;
                }
            }
        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(x.charAt(i-1) == y.charAt(j-1)) {
                    t[i][j]=t[i-1][j-1]+1;
                } else {
                    t[i][j]=Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        int i=m, j=n;
        StringBuilder s = new StringBuilder();
        while(i>0 && j>0){
            if(x.charAt(i-1) == y.charAt(j-1)) {
                s.append(x.charAt(i-1));
                i--;
                j--;
            } else if(t[i-1][j] > t[i][j-1]) {
                s.append(x.charAt(i-1));
                i--;
            } else {
                s.append(y.charAt(j-1));
                j--;
            }
        }
        while(i>0) {
            s.append(x.charAt(i-1));
            i--;
        }
        while(j>0) {
            s.append(y.charAt(j-1));
            j--;
        }
        return s.reverse().toString();

    }
    public static void main(String[] args)  {
        String x = "AGGTAB";
        String y = "GXTXAYB";
       int m=x.length();
       int n=y.length();
        System.out.println("Shortest Common Supersequence: " + commonSupersequence(x, y, m, n));

    }
    
}

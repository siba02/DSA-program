public class EggDroppingProblem2 {
    public static int solve(int e,int f){
        int t[][]=new int[e+1][f+1];

        for (int i = 1; i <= e; i++) {
            for (int j = 1; j <= f; j++) {
                if (i == 1) {
                    t[i][j] = j;
                } else if (j == 1) {
                    t[i][j] = 1;
                }
            
        
        t[i][j] = Integer.MAX_VALUE;

        for(int k=1;k<=j;k++){
            int temp = 1+Math.max(t[i-1][k-1],t[i][j-k]);
            t[i][j] = Math.min(t[i][j], temp);
        }
    }
}
        return t[e][f];



    }

    public static void main(String args[]){
        int e=3;
        int f=5;
        System.err.println(solve(e, f));
    }
    
    
}

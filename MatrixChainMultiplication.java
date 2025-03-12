import java.util.Arrays;

public class MatrixChainMultiplication {
    public static int Solve(int[]x,int i,int j,int t[][]){
      if(t[i][j]!=-1){
        return t[i][j];
      }
        
       
        int min=Integer.MAX_VALUE;
        if(i>=j){
            return 0;
        }
       
        for(int k=i;k<j;k++){
            int cost=Solve(x,i,k,t)+ Solve(x,k+1,j,t)+ x[i-1]*x[k]*x[j];
            min=Math.min(min,cost);
        }
        t[i][j]=min;
        return min;
}
    public static void main(String[] args) {
         int[] x={40,20,30,10,30};
         int n=x.length;
         int t[][]=new int[n+1][n+1];
         for(int y[]:t){
           Arrays.fill(y,-1);
         }          
         int i =1;
         
         System.out.println("Minimum number of multiplications is "+Solve(x,i,n-1,t));

    }    
}

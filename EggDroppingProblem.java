public class EggDroppingProblem {
    public static int solve(int e,int f){
        if(f==0 || f==1){
            return f;
        }
        if(e==1)
        return f;
        
        int mn=Integer.MAX_VALUE;

        for(int k=1;k<=f;k++){
            int temp = 1+Math.max(solve(e-1,k-1),solve(e,f-k));
            mn =Math.min(mn,temp);
        }
        return mn;

    }
    public static void main(String args[]){
        int e=3;
        int f=5;
        System.err.println(solve(e, f));
    }
    
}

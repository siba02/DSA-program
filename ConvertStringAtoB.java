public class ConvertStringAtoB {
    public static int[] convertString(String x,String y,int m,int n){
        int [][]t=new int[m+1][n+1];
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
                    t[i][j]=t[i-1][j-1]+1;
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        int intertion=m-t[m][n];

        int deletion=n-t[m][n];

        // return intertion+deletion;   //if return type is int
        return new int[]{intertion, deletion}; //if return type is int[]
    
    }
    public static void main(String[] args) {
        String x="heap";
        String y="pea";
        int m=x.length();
        int n=y.length();
       int[] result=convertString(x, y, m, n);

       System.out.println("Minimum number of intertion: "+result[1]);
       System.out.println("Minimum number of deletions: "+result[0]);
    // System.out.println("Minimum number of intertion and deletion: "+convertString(x, y, m, n)); //if return type is int.

    }

    
}

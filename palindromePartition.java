import java.util.Arrays;

public class palindromePartition {
    public static int partition(String x,int i,int j){
        if(i>=j){
            return 0;
        }
        int n=x.length();
        int t[][]=new int[n+1][n+1];
        for(int y[]:t){
          Arrays.fill(y,-1);
        }  
      if(t[i][j]!=-1){
        return t[i][j];
      }
         if (isPalindrome(x, i, j)) {
            return 0;
        }
       
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int left,right;
            if(t[i][k]!=-1){
                 left=t[i][k];
            }else{
                 left=partition(x,i,k);
                t[i][k]=left;
            }
            if(t[k+1][j]!=-1){
                 right=t[k+1][j];
            }
            else{
                 right=partition(x,k+1,j);
                t[k+1][j]=right;
            }
            int temp=left+right+1;
            // int temp=partition(x,i,k)+partition(x,k+1,j)+1;
            if(temp<min){
                min=temp;
            }
        }
        return min;

    }
        public static boolean isPalindrome(String x, int i, int j) {
            while (i < j) {
                if (x.charAt(i) != x.charAt(j)) {
                    return false; // Not a palindrome
                }
                i++;
                j--;
            }
            return true; // Is a palindrome
        }
    
       
        
    public static void main(String[] args) {
        String x="nkitikn";
        int i=0;
        int j=x.length()-1;

        System.out.println(partition(x,i,j));
    }
    
}
    


    


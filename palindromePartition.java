public class palindromePartition {
    public static int partition(String x,int i,int j){
        if(i>=j){
            return 0;
        }
         if (isPalindrome(x, i, j)) {
            return 0;
        }
       
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=partition(x,i,k)+partition(x,k+1,j)+1;
            if(temp<min){
                min=temp;
            }
        }
        return min;

    }
        public static boolean isPalindrome(String x, int left, int right) {
            while (left < right) {
                if (x.charAt(left) != x.charAt(right)) {
                    return false; // Not a palindrome
                }
                left++;
                right--;
            }
            return true; // Is a palindrome
        }
    
       
        
    public static void main(String[] args) {
        String x="ababbbabbababa";
        int i=0;
        int j=x.length()-1;

        System.out.println(partition(x,i,j));
    }
    
}
    


    


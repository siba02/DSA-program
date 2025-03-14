public class BooleanParanthesization {
    public static int solve(String x, int i, int j, boolean isTrue){
        if(i>j)
        return 0;

        if(i==j){
            if(isTrue==true){
                return (x.charAt(i) == 'T') ? 1 : 0;

            }else
            return (x.charAt(i) == 'F') ? 1 : 0;
        }
             int ans=0;
        for(int k=i+1;k<=j-1;k+=2){ 
            int LT=solve(x,i,k-1,true);
            int LF=solve(x,i,k-1,false);
            int RT=solve(x,k+1,j,true);
            int RF=solve(x,k+1,j,false);

          
            if(x.charAt(k)=='&'){
                if(isTrue==true){
                    ans=ans+LT*RT;
                } else
                    ans=ans+LF*RF+LT*RF+LF*RT;
            }
            else if(x.charAt(k)=='|'){
                if(isTrue==true){
                    ans=ans+LT*RF+LF*RT+LT*RT;
                } else
                    ans=ans+LF*RF;
            }
            else if(x.charAt(k)=='^'){
                if(isTrue==true){
                    ans=ans+LT*RF+LF*RT;
                } else
                    ans=ans+LT*RT+LF*RF;
            }

         }
        
         return ans;
    }
    public static void main(String[]args){
             String x="T|F&T^F";
             int i=0;
             int j=x.length()-1;
             System.out.println(solve(x,i,j,true));        
    }
}

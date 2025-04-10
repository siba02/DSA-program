import java.util.HashMap;

public class ScrambledString {
    static HashMap<String,Boolean> mp =new HashMap<>();

    public static boolean solve(String s1,String s2){

        int n=s1.length();
        boolean flag=false;
        if(s1.compareTo(s2)==0){
            return true;
        }
        if(s1.length()<=1){
            return false;
        }
       
       String key= s1+" "+s2;
       if (mp.containsKey(key)) return mp.get(key);

        
        for(int i=1;i<n-1;i++){
            boolean cond1=solve(s1.substring(0,i),s2.substring(n-i))&& solve(s1.substring(i),s2.substring(0,n-i));
            boolean cond2=solve(s1.substring(0,i),s2.substring(0,i))&& solve(s1.substring(i),s2.substring(i));

            if(cond1 || cond2){
                flag=true;
                break;
            }

        }
        mp.put(key, flag);
        return flag;

    }
    public static void main(String[] args) {
        String s1="great";
        String s2="regat";
        System.err.println(solve(s1,s2));

    }
    
}

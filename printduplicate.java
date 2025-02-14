
import java.util.HashSet;


public class printduplicate{
public static void main(String[] args){


        int[] arr = {2,5,54,65,54,32,12,32,2};
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>set1=new HashSet<>();   //HashSet doesn't contain duplicates

        for(int x:arr){
            if(!set.add(x)){       //here when the duplicate number added to the set it returns false but the ! make it true.
                set1.add(x);
            }
        }
        System.out.println("Duplicate elements are: "+set1);
        
        
    //     for(int i = 0; i < array.length-1; i++){
    //         for(int j = i + 1; j < array.length; j++){   
    //             if(array[i] == array[j]){
    //                 System.out.println(array[j]);
    //             }
    //         }
    //     }
    
    
}
}

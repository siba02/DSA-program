
import java.util.Arrays;

public class pushzerotoend {
    
    public static int pushZerosToEnd(int[] arr) {
        int j = 0; // Pointer for non-zero elements

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j]=arr[i];
                j++;
                                                 //i={1,3,5,7,8,_,_,_}
                                                //             j
            }
        }
        
for(int i=j; i < arr.length; i++) {
    arr[i] = 0;

    }
    return j;
}

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5, 0, 7, 8};
        
        
      pushZerosToEnd(arr);
        // Print result
        System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
    }

}
    


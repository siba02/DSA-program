public class sumofallelement {
    public static void sumOfAllElements(int[] arr) {
         int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of all elements: " + sum);
    
    
}
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    sumOfAllElements(arr);
    
    
}
}

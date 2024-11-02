public class smallestelement {
    

    public static void findsmallestelement(int[]arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min > arr[i])
                min=arr[i];
             
        } 
    System.out.println("smallest:"+min);

}
    public static void main(String[] args){
        int[]array={50,42,38,10,29,44};
        findsmallestelement(array);
    
    }
}

class largestelement {
    public static void findlargestelement(int[]arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i])
                largest=arr[i];
              
        } 
    System.out.println("largestelement:"+largest);

}
    public static void main(String[] args){
        // int[]array={50,42,38,10,29,44};
        // findlargestelement(array);
        findlargestelement(new int[]{50,42,38,10,29,44}); //anonymous array
    
    }
}

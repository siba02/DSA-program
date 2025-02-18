public class secondsmallestelement {


    public static int A(int[]x){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int i=0;i<x.length;i++){
            if(x[i]<smallest){
                secondSmallest=smallest;
                smallest=x[i];
            }else if(x[i]>smallest&&x[i]<secondSmallest){
                secondSmallest=x[i];
    
        }
    }
    return secondSmallest;
}

    public static void main(String[] args) {
        int x[]={10,25,68,83,91,22,};

        int result=A(x);
        System.out.println("The second smallest number is: "+result);
    }
    
}

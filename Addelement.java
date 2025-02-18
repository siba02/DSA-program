
import java.util.Arrays;

public class  Addelement{

    public static void main(String[] args){
        int[] x={88,65,30,6,83,99};
        int newelement=45;

        x=Arrays.copyOf(x,x.length+1);

        x[x.length-1]=newelement;

        System.out.println(Arrays.toString(x));
    }
}
    


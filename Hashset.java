import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
     
        
     HashSet<Integer> set = new HashSet<>();


     //insert
     set.add(1);
     set.add(2);
     set.add(3);
     set.add(2); // duplicate value is ignored


     //search-contains
     if(set.contains(3)){
        System.out.println("contains ");
     }

     if(!set.contains(7)){        //set doesn't contain the number so return false but the ! make the false as true.
        System.out.println("does not contain ");
     }

    //  remove
     set.remove(2);
     if(!set.contains(2)){
        System.out.println("removed ");
     }

    System.out.println(set.size());
    System.out.println(set);

    // iterator
    Iterator it = set.iterator();
    while(it.hasNext()){              //it returns only true of false if the iterator has some next vlaue then it returns true else false.
        System.out.println(it.next());
    }


    }
    
}

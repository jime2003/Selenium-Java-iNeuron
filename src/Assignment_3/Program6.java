package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Program6 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(33);
        list1.add(44);
        list1.add(55);
        list1.add(66);
        list1.add(77);

        //Remove second element from list using index
        list1.remove(1);
        System.out.println(list1);

        //Remove second element from list using value
        list1.remove(list1.indexOf(55));
        System.out.println(list1);

        //Add 90 at index 3
        list1.add(3, 90);
        System.out.println(list1);  

        //Get the length of list
        System.out.println(list1.size());

        //Print all values from list using any values
        for (Integer i : list1) {
            System.out.println(i);
            
        }

        //Convert List into array.
        Integer[] arr = new Integer[list1.size()];
        arr = list1.toArray(arr);
        for (Integer i : arr) {
            System.out.println(i);
            
        }

        
        
    }   
    



}

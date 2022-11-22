package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(23);
        l1.add(54);
        l1.add(4);
        l1.add(10);

        //Using for each loop to iterate all elements from l1 list
        for (int i : l1) {
            System.out.println(i);
            
        }


    }

}

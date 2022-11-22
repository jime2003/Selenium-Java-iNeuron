package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(23);
        l1.add(54);
        l1.add(4);
        l1.add(10);

        //Usint for loop to iterate all elements from l1 list
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));

        }

    }

}

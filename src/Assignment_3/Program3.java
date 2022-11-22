package Assignment_3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program3 {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(23, 54, 4, 10);

        // Using Iterator to iterate all elements from l1 list
        Iterator<Integer> i1 = l1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());

        }

    }

}

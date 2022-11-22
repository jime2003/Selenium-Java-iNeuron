package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Program5 {

    public static void main(String[] args) {
        //declaring an arrary
        int[] arr = { 34, 56, 78, 90 };
        //creating an empty list
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            l1.add(arr[i]); // traversing each element in an array and adding it into the list

        }
        System.out.println(l1); // printing the final lists

    }

}

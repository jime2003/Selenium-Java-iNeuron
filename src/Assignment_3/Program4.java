package Assignment_3;

import java.util.Arrays;
import java.util.List;

public class Program4 {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(23, 54, 4, 10);
        int sum=0;
        for(int i=0;i<l1.size();i++){
            sum = sum + l1.get(i); // iterate through all elements and add it to the sum variable

        }
        System.out.println(sum);



    }

}

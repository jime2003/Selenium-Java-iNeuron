package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Program7 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Web Automation");
        list1.add("API Automation,");
        list1.add("Mobile Automation");

        if(list1.contains("Mobile")){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}

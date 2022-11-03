package Assignment_2;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of student");
        size = sc.nextInt();
        String[] name = new String[size]; // Storing names in the name array of size that received by user input
        String[] email = new String[size]; // Storing emails in the email array of size that received by user input


        //Creating a loop to get user inputs
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter name");
            name[i] = sc.next();
            System.out.println("Please enter email");
            email[i] = sc.next();
            
        }

        //Using names and email arrays to retrieve informaiton by index given by user
        System.out.println("Please enter which student detail are you looking for");
        int index = sc.nextInt();
        System.out.println(name[index]);
        System.out.println(email[index]);

        sc.close();  // closing the connection




        

        


    }
    
}

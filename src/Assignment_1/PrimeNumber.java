package Assignment_1;

public class PrimeNumber {
    public static void main(String[] args) {
        for(int numberToCheck=2; numberToCheck <=1000; numberToCheck++){
            boolean check = true;
            for(int factor=2; factor < numberToCheck; factor++){
                if (numberToCheck%factor==0) {
                    check = false;
                    break;
                    
                }
            }

            if (check) {
                System.out.print( numberToCheck + " ");
                
            }

        }


    }
}

package Assignment_2;

public class TrainerWithArray {

    String name;
    String department;
    String email;
    int id;

    TrainerWithArray(String trainerName, String trainerDepartment, String trainerEmail,int trainerId){

        name = trainerName;
        department = trainerDepartment;
        email = trainerEmail;
        id = trainerId;

    }

    public void selenium(){
        System.out.println(name + " can teach Selenium");
    }

    public void webDevelopment(){
        System.out.println(name + " can teach WebDevelopment");
    }

    public void devOps(){
        System.out.println(name + " can teach DevOps");
    }



    public static void main(String[] args) {

        //Creating TrainderWithArray Object array with size 3
        TrainerWithArray [] trainer = new TrainerWithArray[3];

        //assigned elements in all 3 Array object
        trainer[0] = new TrainerWithArray("Mukesh","Testing","mukesh@gmail.com",1);
        trainer[1] = new TrainerWithArray("Hitesh","Dev","mukesh@gmail.com",2);
        trainer[2] = new TrainerWithArray("Mukesh","DevOps","mukesh@gmail.com",3);
        trainer[0].selenium();
        trainer[1].webDevelopment();
        trainer[2].devOps();


    }
    
}

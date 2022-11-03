package Assignment_2;

public class Trainer {
    //declaring instance variable
    String name;
    String department;
    String email;
    int id;

    //below is constrctor overloading which expects 4 parameters
    Trainer(String trainerName, String trainerDepartment, String trainerEmail,int trainerId){

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
        //creating 3 objects
        Trainer t1 = new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
        Trainer t2 = new Trainer("Hitesh","Dev","mukesh@gmail.com",2);
        Trainer t3 = new Trainer("Mukesh","DevOps","mukesh@gmail.com",3);

        // using objects to call methods
        t1.selenium();
        t2.webDevelopment();
        t3.devOps();


    }
    
}

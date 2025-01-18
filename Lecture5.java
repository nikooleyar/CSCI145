public class Lecture5 {
    public static void main(String[] args){
        //Conditionals and loops
        int x = Integer.parseInt(args[0]);

        //if (condtion) { 
        //Code here  
        //}
        
        if (x>10) {
            System.out.println("Number is greater than 10!");
        } else if (x == 10) {
            System.out.println("Your number is 10!");
        } else {
            System.out.println("Your number is NOT greater than 10.");
        }

        String message = (x > 10) ? "Your number is greater than 10!" : "Your number is NOT greater than 10.";
        // variable (condition) ? (if true) : (if false)
        System.out.println(message);


        int y = 0; //this needs to be here for y to be inside the scope of the function, otherwise it won't work. 
        if (x>10) {
            y = 11;
        }
        System.out.println(y);


        //switch statement (for a character selector example)
        String playerClass = args[2];
        switch (playerClass.toLowerCase()) {
            case "rogue":
                System.out.println("You are a rogue!");
                break; //make sure to put "break;" otherwise it will print out every case
            case "wizard":
                System.out.println("You are a wizard!");
                break;
            default:
                System.out.println("You are a human!");
        }

        //while loop
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        //do while loop
        //do {
       //     System.out.println("DO WHILE!"); //does what is in here while the condition below is true (makes sure it runs at least one time)
        //} while (x == 10); dont run its dangerous

        for (int i=0; i<10; i++) { //puts everything in the beginning
            System.out.println(i);
        }

    }
}

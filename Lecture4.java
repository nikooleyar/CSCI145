public class Lecture4 {
    public static void main(String[] args) {
        //Operators and expressions in Java
        

        //## EXPRESSIONS ##
        
        int result = 5 / 2;
        System.out.println(result);

        int number = 5;
        number += 2; //number = number + 2 (7)
        System.out.println(number);

        int number2 = 5;
        number2++; //adds one and makes variable equal to new value
        number2--;//same but minus
        ++number2; //same thing

        int otherNumber = number2++; //assigns the value of number2 to otherNumber before it's increased (otherNumber = 5, number2 = 6)
        int otherNumber2 = ++number2; //assigns the value of number2 to otherNumber2 AFTER it's increased (think reading left to right)

        
        int answer = (5 + 8) + 7 * 10; //uses traditional math order of operations

        int x = 15;         //short is 2 bytes, int is 4 bytes
        short y = (short)x; //converts larger data type to smaller data type regardless if data is lost (its okay to go from smaller to larger though)
                            //byte -> short -> int -> long
        double z = 15.1;
        int i = (int)x;

        //String arg1 = args[0];    see below instead
        Double arg1 = Double.parseDouble(args[0]);
        System.out.println(Math.pow(arg1, 2)); //takes arg1 to the power of 2 (only way for exponents) (AND only returns doubles)


        System.out.println(12 == 8);



        String str1 = "Java";
        String str2 = args[0];
        System.out.println(str1 == str2); //doesn't work if args[0] == "Java" because it compares address locations
        System.out.println(str1.equals(str2)); //this does what the above is supposed to
        System.out.println(str1.equalsIgnoreCase(str2)); //there's some methods that you can use

        //## LOGICAL OPERATORS ##

        //! = not
        //|| = or
        //&& = and


        //int arg1 = Integer.parseInt(args[0]); is the proper way to convert a string into an integer.

    }
}

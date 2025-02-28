public class Lecture15 {

    //Recursion breaks a problem into smaller identical problems and solves each of them.

    //Complex problems may have simple recursive solutions, others may not at all.

    //Criteria:
    //1. A recursive method must call itself
    //2. Each call solves an identical, but smaller sub-problem
    //3. A test for the base case enables a recersive calls to stop
    //4. Eventually one of the the sub-problems must be the base case (?)

    //Factorials:
    //4! = 24
    //6! = 720
    
    //Since 4*3*2*1 is in both, we can rewrite 6! as 6x5x4!
    //factorial(n) = n * factorial(n-1)

    //factorial(6) = 6*5*4*3*2*1

    public static void main(String[] args) {
        
    }

    //F(n) = F(n-1) * n
    //F(0) = 1

    //base case is when n = 0
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}

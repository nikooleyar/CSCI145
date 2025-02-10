public class Lecture10 {
    public static void main(String[] args) {
        //Encapsulation
        //refers to wrapping the data and methods that operate in this data into a single unit

        //we can achieve this by hiding internet representation of a class from the outside access

        //good because:
        //makes software easier to use and maintain
        //helps with abstraction because we dont need to know how it works.

        double meters = 5000;
        Distance distance = new Distance(meters);

        //using a setter
        distance.setMeters(25);

        //using a getter
        System.out.println("Distance in meters: " + distance.getMeters());
        System.out.println("Distance in kilometers: " + distance.getKilometers());
        System.out.println("Distance in miles: " + distance.getMiles());



    }
    
}

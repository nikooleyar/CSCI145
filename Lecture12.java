public class Lecture12 {
    //Inheritance allows a new class to derive from another one
    //the Child clas inherits the methods and data defined for th parent class

    //"extends" is used to establish an inheritance relationship

    //attributes that are public can be inherited but private attribures cannot

    //protected access modifiers allow an attribute to be inherited without being public

    public static void main(String[] args) {
        PlayableCharacter gimli = new PlayableCharacter("Gimli", 10, 150);
        gimli.attack();

        Rogue aragorn = new Rogue("Aragorn", 15, 100);
        aragorn.attack();
        aragorn.hide();
        
    }
}

public class Lecture13 {
    public static void main(String[] args) {
        //Polymorphism?

        Character logan = new Character("Logan", 9000, -1);
        Rogue rogue = new Rogue("Aragorn", 5, 80, 100);
        Bard bard = new Bard("Tom Bombadil", 10, 120, "Lyre");

        System.out.println(logan.toString());
        System.out.println(logan.equals(logan)); //hashcode == hashcode
        System.out.println(logan.hashCode()); //represents memory location

        //doAction(logan);
        doAction(rogue);
        doAction(bard);
    }

    public static void doAction(Character character) {  //not all objects have the hide defined
        character.attack();
        //((Rogue) character).hide(); //still doesn't work for bard

        if (character instanceof Rogue) { //allows for it the method to work even tho bard can't hide
            ((Rogue) character).hide(); //CASTS object into Rogue object even if it isn't one
        }
    }


}

import java.util.ArrayList;

public class Lecture20 {
    //Genarics

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4};
        printArray(array);

        Double[] array2 = {1.2,1.3,1.4};
        printArray(array);

        Box<Integer> box = new Box<Integer>(); //Uses the same method with Integers
        box.set(1);
        System.out.println(box.get());

        Box<String> stringBox = new Box<String>(); //Uses the same method with Strings
        stringBox.set("1"); //just make sure that this represents what type you want it to be
        System.out.println(box.get());
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.get(0);
    }

    public static  <T> void printArray(T[] array) { //works regardless of number data type
        for (T element: array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}

class Box<T /*extends Number*/> { //would mean that ONLY NUMBERS can be used
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}



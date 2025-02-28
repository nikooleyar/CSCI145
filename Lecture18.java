public class Lecture18 {
    //LINKED LISTS

    //abstract data types specify an interface, not an implementation

    //inteferace = WHAT an operation does
    //implementation = HOW an operation does it

    //linked lists can be stored anywhere in memory which allows it to change dynamically

    //consists of nodes
    //each node has a value and reference to its successor (the next node)
    //the last node should be null because there's nothing after it
    //"head node" is the first node
    //you can't just start at index [2], you need to always start at the head and go down
    //head node shouldn't have a value, it should just act as a pointer to the next node

    //Use Node cur as a temp pointer (to view each value in each node)
    //Node cur = head; should point to the node that the head is pointing to (so the first value)

    //to insert something at the front of a list, you need to make the head node point to the new node and then make the new node point to the next node
    
    //to "delete" something in a linked list, just make whatever node is pointing to it to point to the "deleted" node's successor
    //then Java's garbage collector will remove it for you



    public static void main(String[] args) {
        //somethig here
    }


}

class Node {
    private int item;
    private Node nextNode;

    public Node (int item) {
        this.item = item;
    }

    
}

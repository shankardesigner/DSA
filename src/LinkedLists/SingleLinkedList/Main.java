package LinkedLists.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);

//        list.insertFirst(55);
        list.insertAt(25,2);
        list.deleteAtPosition(2);
        list.list();
    }
}

package LinkedLists.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insertAtBeginning(55);
        list.insertAtMiddle(25,2);
        list.list();
        list.deleteAtMiddle(2);
        list.list();
    }
}

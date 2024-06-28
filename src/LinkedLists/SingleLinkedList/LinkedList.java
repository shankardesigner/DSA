package LinkedLists.SingleLinkedList;

public class LinkedList {
    // Create a Head
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int data, int index) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null || index == 0) {
            insertFirst(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAtPosition(int index) {
        Node node = head;

        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        Node temp = node.next;
        node.next = temp.next;
    }

    public void list() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

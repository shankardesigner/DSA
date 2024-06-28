package LinkedLists.DoubleLinkedList;

public class LinkedList {
    Node head;

    void insert(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
            node.prev = currentNode;
        }
    }

    void insertAtBeginning(int data) {
        Node node = new Node(data);

        if(head == null) {
            head = node;
        } else {
            Node currentNode = head;
            head.prev = node;
            node.next = currentNode;
            head = node;
        }
    }

    void insertAtMiddle(int data, int index) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            node.next = currentNode.next;
            node.prev = currentNode;
            currentNode.next = node;
        }
    }
    void deleteAtMiddle(int index) {
        Node currentNode = head;
        if(index == 0) {
            head = currentNode.next;
        } else {
            int i = 0;
            while (i < index && currentNode.next != null) {
                currentNode = currentNode.next;
                i++;
            }
            Node prev = currentNode.prev;
            prev.next = currentNode.next;
        }
    }

    void list() {
        Node node = head;
        System.out.println("--------------------------------");
        while (node.next != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println(node.data);
        System.out.println("--------------------------------");
    }
}

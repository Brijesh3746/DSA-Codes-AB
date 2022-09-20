public class LinkedListClass {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2); head.next = n1;
        Node n2 = new Node(3); n1.next = n2;
        Node n3 = new Node(4); n2.next = n3;
        Node n4 = new Node(5); n3.next = n4;
        printLL(head);
    }

    static void printLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println(" NULL");
    }
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
}

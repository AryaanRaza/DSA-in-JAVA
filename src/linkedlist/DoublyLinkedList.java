package linkedlist;

public class DoublyLinkedList
{
    private static class Node
    {
        Node prev;
        int data;
        Node next;


        Node(int data)
        {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    private Node head;



    public static void main(String[] args)
    {

    }
}

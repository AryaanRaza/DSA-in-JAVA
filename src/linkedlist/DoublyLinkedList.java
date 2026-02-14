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

    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head.prev=newNode;

        head = newNode;
    }

    public void traverse()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        };
        System.out.print("null");
    }

    public static void main(String[] args)
    {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);
        list.insertAtEnd(25);
        list.insertAtStart(0);

        list.traverse();
    }
}

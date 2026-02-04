package linkedlist;

/*
 Problem: Implement Singly Linked List
 Platform: Core DSA
 */

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList
{
    Node head;

    // Insert at end
    public void insert(int data)
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
    }

    // Display list
    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args)
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);

        list.display();
    }
}

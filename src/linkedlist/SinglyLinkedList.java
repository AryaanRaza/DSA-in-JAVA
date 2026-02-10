package linkedlist;

/*
 Problem: Implement Singly Linked List
 Platform: Core DSA
 */


public class SinglyLinkedList
{
    private static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    //***********INSERTION***********
    // Insert at end
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
    }

    public void insertAtStart(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void insertAtIndex(int index, int data)
    {
        Node newNode = new Node(data);
        if (index == 1)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int i = 1;
        while (temp != null)
        {
            if (i + 1 == index)
            {
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            i++;
        }

    }

    public void deleteAtStart()
    {
        if (head == null)
        {
            System.out.print("\nList is empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd()
    {
        if (head == null)
        {
            System.out.print("\nList is empty");
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtIndex(int index)
    {
        if (head == null)
        {
            System.out.print("\nList is empty");
            return;
        }
        if (index == 1)
        {
            head = head.next;
            return;
        }
        Node temp = head;
        int i = 1;
        while (temp.next != null)
        {
            if (i + 1 == index)
            {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
            i++;
        }
        System.out.print("\nInvalid index");
    }

    public void deletebyValue(int value)
    {
        if (head == null)
        {
            System.out.print("\nList is empty");
            return;
        }

        if (head.data == value)
        {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data != value)
        {
            curr = curr.next;
        }
        if (curr.next == null)
        {
            System.out.println("Value " + value + " not found in the list");
            return;
        }
        curr.next = curr.next.next;
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

    public void reverse()
    {
        Node prev = null;
        Node curr = head;

        while (curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

}

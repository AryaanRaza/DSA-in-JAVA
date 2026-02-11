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
    private int size = 0;


    //***********INSERTION***********
    // Insert at end
    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public void insertAtStart(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        size++;

    }

    public void insertAtIndex(int index, int data)
    {
        if (index < 1 || index > size + 1)
        {
            System.out.print("\nInvalid index , Enter value between 1 and " + (size + 1));
            return;
        }

        if (index == 1)
        {
            insertAtStart(data);
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 1;
        while (temp != null)
        {
            if (i + 1 == index)
            {
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
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
        size--;
    }

    public void deleteAtEnd()
    {
        if (head == null)
        {
            System.out.print("\nList is empty");
            return;
        }
        if (head.next == null)
        {
            head = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void deleteAtIndex(int index)
    {
        if (index < 1 || index > size)
        {
            System.out.print("\nInvalid index , Enter value between 1 and " + size);
            return;
        }
        if (head == null)
        {
            System.out.print("\nList is empty");
            return;
        }
        if (index == 1)
        {
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        int i = 1;
        while (temp.next != null)
        {
            if (i + 1 == index)
            {
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
            i++;
        }
    }

    public void deleteByValue(int value)
    {
        if (head == null)
        {
            System.out.print("\nList is empty");
            return;
        }

        if (head.data == value)
        {
            head = head.next;
            size--;
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
        size--;
    }

    boolean search(int key)
    {
        Node curr = head;
        while (curr != null)
        {
            if (curr.data == key)
            {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    // Display list
    public void display()
    {
        Node temp = head;
        if (temp == null)
        {
            System.out.print("\nList is empty");
            return;
        }
        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    //***********Reverse***********
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

    //***********Size***********
    public int getSize()
    {
        return size;
    }

}

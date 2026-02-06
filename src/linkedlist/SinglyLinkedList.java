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
        temp.next=head;
        head=temp;
    }

    public void insertAtIndex(int index , int data)
    {
        Node newNode = new Node(data);
        if(index==1)
        {
            newNode.next=head;
            head=newNode;
            return;
        }

        Node temp = head;
        int i = 1;
        while(temp!=null)
        {
            if(i+1==index)
            {
                newNode.next=temp.next;
                temp.next=newNode;
                return;
            }
            temp=temp.next;
            i++;
        }

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


}

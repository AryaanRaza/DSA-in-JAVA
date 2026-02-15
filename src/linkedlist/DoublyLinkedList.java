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
    private int size = 0;


    public void insertAtStart(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;

        head = newNode;
        size++;

    }

    public void insertAtIndex(int data, int index)
    {
        if (index < 1 || index > size + 1)
        {
            System.out.print("\nInvalid index , Enter value between 1 and " + (size + 1));
            return;
        }
        if (index == 1)
        {
            insertAtStart(data);
            return;
        }
        if (index == size + 1)
        {
            insertAtEnd(data);
            return;
        }
        int i = 1;
        Node curr = head;
        while (curr != null)
        {
            if (i + 1 == index)
            {
                Node newNode = new Node(data);
                newNode.prev = curr;
                newNode.next = curr.next;
                curr.next.prev = newNode;
                curr.next = newNode;
                size++;
                return;
            }
            curr = curr.next;
            i++;
        }

    }

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
        newNode.prev = temp;
        size++;
    }

    public void deleteAtStart()
    {
        if (head == null)
        {
            System.out.print("\nList is empty");
            return;
        }
        head = head.next;
        head.prev = null;
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
            deleteAtStart();
            return;
        }
        int i = 1;
        Node curr = head;
        while (curr.next != null)
        {
            if(i+1 == index)
            {
                Node temp = curr.next.next;
                temp.prev = curr;
                curr.next=temp;
            }
            curr = curr.next;
            i++;
        }
    }

    public void traverse()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        ;
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


        list.traverse();
        System.out.print("\nDelete---\n");
        list.deleteAtStart();
        list.deleteAtIndex(3);
        list.traverse();


    }
}

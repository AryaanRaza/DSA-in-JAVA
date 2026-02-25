package stack;

import linkedlist.SinglyLinkedList;

public class StackLinkedList
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

    private Node top = null;
    private int capacity;

    public void push(int x)
    {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public static void main(String[] args)
    {
        StackLinkedList s = new StackLinkedList();

    }
}

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
    private int size;

    public boolean isEmpty()
    {
        return top == null;
    }

    public void push(int x)
    {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.print("\nStack Underflow! Cannot pop");
            return -1;
        }

        int popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public static void main(String[] args)
    {
        StackLinkedList s = new StackLinkedList();

    }
}

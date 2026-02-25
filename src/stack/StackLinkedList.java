package stack;

import java.util.Scanner;

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

    private Node top = null;   // top of stack
    private int size;          // current size of stack

    // Check if empty
    public boolean isEmpty()
    {
        return top == null;
    }

    // Push operation (insert at head)
    public void push(int x)
    {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(x + " pushed to stack");
    }

    // Pop operation (delete from head)
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
        System.out.println(popped + " popped from stack");
        return popped;
    }

    // Peek operation
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Display stack (top to bottom)
    public void display()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        System.out.print("\nStack elements (top → bottom): ");
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public int getSize()
    {
        return size;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StackLinkedList stack = new StackLinkedList();

        boolean exit = false;
        while (!exit)
        {
            System.out.println("\n1.Push 2.Pop 3.Peek 4.Display 5.Size 6.Exit");
            System.out.print("Choose operation: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1 ->
                {
                    System.out.print("Enter element to push: ");
                    int x = sc.nextInt();
                    stack.push(x);
                }
                case 2 -> stack.pop();
                case 3 -> System.out.println("Top element: " + stack.peek());
                case 4 -> stack.display();
                case 5 -> System.out.println("Stack size: " + stack.getSize());
                case 6 -> exit = true;
                default -> System.out.println("Invalid choice");
            }
        }

    }
}


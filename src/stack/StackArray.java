package stack;
import java.util.Scanner;
public class StackArray
{
    private int[] arr;         // array to store stack elements
    private int top;           // index of the top element
    private int capacity;      // maximum size of stack

    //Constructor
    public StackArray(int size)
    {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    //Push Operation
    public void push(int x)
    {
        if (top == capacity - 1)
        {
            System.out.print("\nStack Overflow , Cannot Push " + x);
            return;
        }
        arr[++top] = x;
    }

    //Pop Operation
    public int pop()
    {
        if (top == -1)
        {
            System.out.print("\nStack Underflow! Cannot pop");
            return -1;
        }

        return arr[top--];
    }

    //Peek operation
    public int peek()
    {
        if (top == -1)
        {
            System.out.print("\nStack is empty");
            return -1;
        }
        return arr[top];
    }

    //Check if stack is empty
    public boolean isEmpty()
    {
        return top == -1;
    }

    //Display stack elements
    public void display(){
        if(top == -1){
            System.out.print("\nStack is empty");
            return;
        }
        System.out.print("Stack elements (top → bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Demo with Scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        StackArray stack = new StackArray(size);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n1.Push 2.Pop 3.Peek 4.Display 5.Exit");
            System.out.print("Choose operation: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter element to push: ");
                    int x = sc.nextInt();
                    stack.push(x);
                }
                case 2 -> stack.pop();
                case 3 -> System.out.println("Top element: " + stack.peek());
                case 4 -> stack.display();
                case 5 -> exit = true;
                default -> System.out.println("Invalid choice");
            }
        }

    }

}

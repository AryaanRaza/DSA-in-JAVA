package stack;

public class StackArray
{
    private int[] arr;         // array to store stack elements
    private int top;           // index of the top element
    private int capacity;      // maximum size of stack

    //Constructor
    public StackArray(int size){
        capacity=size;
        arr = new int[capacity];
        top=-1;
    }

    //Push Operation
    public void push(int x){
        if(top == capacity-1){
            System.out.print("\nStack Overflow , Cannot Push "+ x);
            return;
        }
        arr[++top]=x;
    }

}

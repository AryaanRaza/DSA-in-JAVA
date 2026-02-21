package stack;

public class StackArray
{
    private int[] arr;
    private int top;
    private int capacity;

    public StackArray(int size){
        capacity=size;
        arr = new int[capacity];
        top=-1;
    }
}

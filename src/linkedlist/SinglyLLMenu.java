package linkedlist;

import java.util.Scanner;

public class SinglyLLMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();


        boolean flag = true;
        while (flag)
        {
            System.out.print("\nEnter---\n   1 to insert\n   2 to Delete\n   3 to reverse list\n   4 to search \n   5 to get Size\n   6 to exit ");
            System.out.print("\n   Your choice : ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("\nEnter---\n  1 at Start\n  2 to at End\n  3 to at index");
                    System.out.print("\n  Your choice : ");
                    int c1 = sc.nextInt();
                    System.out.print("\nEnter data : ");
                    int data = sc.nextInt();
                    switch (c1)
                    {
                        case 1:
                            list.insertAtStart(data);
                            break;

                        case 2:
                            list.insertAtEnd(data);
                            break;

                        case 3:
                            System.out.print("\nEnter index : ");
                            int index = sc.nextInt();
                            list.insertAtIndex(index, data);
                            break;
                    }
                    break;

                case 2:
                    System.out.print("\nEnter---\n  1 at Start\n  2 to at End\n  3 to at index\n  4 to at value");
                    System.out.print("\n  Your choice : ");
                    int c2 = sc.nextInt();
                    switch (c2)
                    {
                        case 1:
                            list.deleteAtStart();
                            break;

                        case 2:
                            list.deleteAtEnd();
                            break;

                        case 3:
                            System.out.print("\nEnter index : ");
                            int index = sc.nextInt();
                            list.deleteAtIndex(index);
                            break;
                        case 4:
                            System.out.print("\nEnter value : ");
                            int value = sc.nextInt();
                            list.deleteByValue(value);
                            break;
                    }
                    break;

                case 3:
                    list.reverse();
                    break;

                case 4:
                    System.out.print("\nEnter value to search: ");
                    int value = sc.nextInt();
                    if (list.search(value))
                    {
                        System.out.println("\nValue found");
                    }
                    else
                    {
                        System.out.println("\nValue not present");
                    }
                    break;

                case 5:
                    System.out.println("\nSize of Linked List : "+list.getSize());
                    break;

                case 6:
                    flag = false;

            }
            list.display();
        }

    }
}

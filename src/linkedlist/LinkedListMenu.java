package linkedlist;

import java.util.Scanner;

public class LinkedListMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();


        boolean flag = true;
        while (flag)
        {
            System.out.print("\nEnter---\n   1 to insert\n   2 to Delete\n   3 to exit ");
            System.out.print("\n   Your choice : ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("\nEnter---\n  1 at Start\n  2 to at End\n  3 to at index");
                    System.out.print("\n  Your choice : ");
                    int ch = sc.nextInt();
                    System.out.print("\nEnter data : ");
                    int data = sc.nextInt();
                    switch (ch)
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
                    break;

                case 3:
                    flag = false;

            }
            list.display();
        }

    }
}

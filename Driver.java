import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        //declare variables and initialize scanner
        Scanner key = new Scanner(System.in);
        int size, choice, value, end;

        end = 0;

        //declare and initialize the stack
        LinkedStack stack1 = new LinkedStack();

        //loop to continue operations
        while(end == 0)
        {
            //print out menu for commands
            System.out.println("\t1) Push \n\t2) Pop \n\t3) Peek \n\t4) Size \n\t5) isEmpty \n\t6) End");
            System.out.print("Please choose an option: ");
            choice = key.nextInt();

            //switch the choice and execute commands
            switch (choice)
            {
                case 1: System.out.println("Please enter a value: ");
                    value = key.nextInt();
                    stack1.push(value);
                    System.out.println(stack1.toString());
                    break;
                case 2: stack1.pop();
                    System.out.println(stack1.toString());
                    break;
                case 3: stack1.peek();
                    System.out.println(stack1.toString());
                    break;
                case 4: System.out.println("Size: " + stack1.size());
                    System.out.println(stack1.toString());
                    break;
                case 5: if(stack1.isEmpty())
                {
                    System.out.println("Stack is empty.");
                }
                else
                    System.out.println("Stack is NOT empty.");
                    System.out.println(stack1.toString());
                    break;
                case 6: end = 1;
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }
}

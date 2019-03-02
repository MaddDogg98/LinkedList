import java.util.NoSuchElementException;

public class LinkedStack
{

    //declare variables
    private Node top;
    private int size;

    //constructor to initialize variables
    public LinkedStack()
    {
        size = 0;
        top = null;
    }

    //push method to add numbers to the stack
    public void push(int value)
    {
        Node node = new Node(value);
        if(!isEmpty())
        {
            node.link = top;
            top = node;
        }
        else
            top = node;
        size++;
    }

    //method to remove the top number in the stack
    public int pop()
    {
        Node temp = top;
        if(!isEmpty())
        {
            top = top.link;
            size--;
        }
        else
            throw new IllegalAccessError();

        return temp.getData();
    }

    //boolean method to check if the stack is empty
    public boolean isEmpty()
    {
        if(top == null)
            return true;
        else
            return false;
    }

    //method to return the size of the stack
    public int size()
    {
        return size;
    }

    //method to print out the top number in the stack
    public int peek()
    {
        if (isEmpty() == true)
        {
            throw new NoSuchElementException("Stack is empty.");
        }
        else
        {
            return top.getData();
        }
    }

    //method to turn the stack into a String
    public String toString()
    {
        Node tmp = top;
        String returnStr = "Stack: [";
        while(tmp != null)
        {
            returnStr += tmp.getData() + ", ";
            tmp = tmp.link;
        }

        returnStr += "]";

        return returnStr;
    }
}

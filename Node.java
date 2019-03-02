public class Node
{
    int data;
    Node link;

    //contructor
    public Node(int d)
    {
        data =  d;
        link = null;
    }

    public int getData()
    {
        return data;
    }

    public Node getLink()
    {
        return link;
    }

    public void setData(int d)
    {
        data = d;
    }

    public void setLink(Node n)
    {
        link = n;
    }
}

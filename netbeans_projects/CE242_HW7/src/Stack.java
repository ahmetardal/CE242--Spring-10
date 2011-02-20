
/**
 * @author ardalahmet
 */
public class Stack
{
    private BinaryNode[] items;
    private int capacity;
    private int tos;

    public Stack(int capacity)
    {
        items = new BinaryNode[capacity];
        this.capacity = capacity;
        tos = -1;
    }

    public void push(BinaryNode data)
    {
        items[++tos] = data;
    }

    public BinaryNode pop()
    {
        return items[tos--];
    }

    public BinaryNode top()
    {
        return items[tos];
    }

    public boolean isEmpty()
    {
        return (tos == -1);
    }

    public boolean isFull()
    {
        return (tos == (capacity - 1));
    }

    public int size()
    {
        return (tos + 1);
    }
}

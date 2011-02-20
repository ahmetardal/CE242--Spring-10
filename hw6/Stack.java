
/**
 * @author ardalahmet
 */
public class Stack
{
    private char[] items;
    private int capacity;
    private int tos;

    public Stack(int capacity)
    {
        items = new char[capacity];
        this.capacity = capacity;
        tos = -1;
    }

    public void push(char data)
    {
        items[++tos] = data;
    }

    public char pop()
    {
        return items[tos--];
    }

    public char top()
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

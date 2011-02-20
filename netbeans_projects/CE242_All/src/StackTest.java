
/**
 * @author ardalahmet
 */
public class StackTest
{
    public static void main(String[] args)
    {
        Stack s = new Stack(100);

        s.push('a');
        s.push('b');
        s.push('c');
        s.push('d');
        s.push('e');

        while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
}

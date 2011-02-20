
/**
 * @author ardalahmet
 */
public class Main
{
    public static void main(String[] args)
    {
        String expression = "22*3+5-3*2/3*6-1+";

        BinaryNode exprTree = ParsePostfix(expression);
        BinaryNode.PrintInorder(exprTree);
    }

    public static BinaryNode ParsePostfix(String expr)
    {
        Stack st = new Stack(100);
        char token;

        for (int i = 0; i < expr.length(); ++i)
        {
            token = expr.charAt(i);

            // if the token is a value
            if ((token <= '9') && (token >= '0'))
            {
                st.push(new BinaryNode(token));
            }
            else    // if the token is an operator
            {
                BinaryNode result = new BinaryNode(token);
                result.right = st.pop();
                result.left  = st.pop();
                st.push(result);
            }
        }

        return st.pop();
    }
}

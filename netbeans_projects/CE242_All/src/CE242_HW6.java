
/**
 * @author ardalahmet
 */
public class CE242_HW6
{
    public static void main(String[] args)
    {
        // Stack usage example
        Stack s = new Stack(100);

        s.push('a');
        s.push('b');
        s.push('c');
        System.out.println("stack size: " + s.size());

        while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }
        // ------------------------------------------------------------

        // char to int, int to char conversion
        char ch  = '2';                 // char 2
        int  num = ch - '0';            // convert it to int 2
        char ch2 = (char) (num + '0');  // convert it back to char 2
        System.out.println("ch: " + ch + ", num: " + num + ", ch2: " + ch2);
        // ------------------------------------------------------------

        // test code
        String text = "{(a * b) - ((c[5][(z - y) * 3] * z) - k[52 / (ab[3] * m)])}";
        if (isParenthesesWellFormed(text))
        {
            System.out.println("text is well-formed.");
        }
        else
        {
            System.out.println("text is not well-formed.");
        }

        String expression = "22*3+5-3*2/3*6-1+";
        int val = evaluateRPN(expression);
        System.out.println("value of expression: " + val);
        System.out.println("----------------------------------------");
    }

    public static boolean isParenthesesWellFormed(String str)
    {
        char ch;
        char popped;
        Stack st = new Stack(100);

        // iterate through the characters of str
        for (int i = 0; i < str.length(); ++i)
        {
            ch = str.charAt(i);
            switch (ch)
            {
                // when an opening paranthesis is encountered,
                // push it to the stack
                case '(':
                case '{':
                case '[':
                    st.push(ch);
                    break;

                // when a closing paranthesis is encountered,
                // pop a character from the stack and check it
                case ')':
                case '}':
                case ']':
                    if (st.isEmpty())
                    {
                        return false;
                    }

                    popped = st.pop();
                    if ((ch == ')') && (popped != '('))
                    {
                        return false;
                    }
                    if ((ch == '}') && (popped != '{'))
                    {
                        return false;
                    }
                    if ((ch == ']') && (popped != '['))
                    {
                        return false;
                    }
                    break;

                default:
                    break;
            }   // switch
        }   // for

        return st.isEmpty();
    }

    public static int evaluateRPN(String expr)
    {
        char token;
        int val1, val2;
        Stack st = new Stack(100);

        for (int i = 0; i < expr.length(); ++i)
        {
            token = expr.charAt(i);

            // if the token is a value
            if ((token <= '9') && (token >= '0'))
            {
                st.push(token);
            }
            else    // if the token is an operator
            {
                if (st.size() < 2)
                {
                    return 0;   // error, no need to continue
                }

                val2 = (int) (st.pop() - '0');
                val1 = (int) (st.pop() - '0');

                switch (token)
                {
                    case '+':
                        st.push((char) (val1 + val2 + '0'));
                        break;
                    case '-':
                        st.push((char) (val1 - val2 + '0'));
                        break;
                    case '*':
                        st.push((char) (val1 * val2 + '0'));
                        break;
                    case '/':
                        st.push((char) (val1 / val2 + '0'));
                        break;
                }
            }
        }   // for

        if (st.size() != 1)
        {
            return 0;   // error
        }

        return (int) (st.pop() - '0');
    }
}

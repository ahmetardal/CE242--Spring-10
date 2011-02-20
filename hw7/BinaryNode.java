
/**
 * @author ardalahmet
 */
public class BinaryNode
{
    public char data;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(char data)
    {
        this.data = data;
        left  = null;
        right = null;
    }

    // ---------------------------------------------------------------

    public static void PrintInorder(BinaryNode root)
    {
        if (root == null)
        {
            return;
        }

        PrintInorder(root.left);            // print left subtree
        System.out.print(root.data + " ");  // print this node
        PrintInorder(root.right);           // print right subtree
    }

    public static void PrintPostorder(BinaryNode root)
    {
        if (root == null)
        {
            return;
        }

        PrintInorder(root.left);            // print left subtree
        PrintInorder(root.right);           // print right subtree
        System.out.print(root.data + " ");  // print this node
    }

    public static void PrintPreorder(BinaryNode root)
    {
        if (root == null)
        {
            return;
        }

        System.out.print(root.data + " ");  // print this node
        PrintInorder(root.left);            // print left subtree
        PrintInorder(root.right);           // print right subtree
    }    
}

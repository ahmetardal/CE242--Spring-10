
/**
 * @author ardalahmet
 */

public class MultiListNode
{
    public String nodeName;
    public MultiListNodeType nodeType;
    public MultiListNode down;
    public MultiListNode right;

    public MultiListNode(String nodeName, MultiListNodeType nodeType)
    {
        this.nodeName = nodeName;
        this.nodeType = nodeType;
        down  = null;
        right = null;
    }
}

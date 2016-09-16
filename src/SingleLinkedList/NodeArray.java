package SingleLinkedList;


import static java.lang.System.arraycopy;

/**
 * Created by Влад on 8/30/2016.
 */
public class NodeArray {
    Node nodeArray[];
    NodeArray(int n)
    {
        this.nodeArray = new Node[n];
    }

    public NodeArray add(int index, int value)
    {
        NodeArray node1 = new NodeArray(this.nodeArray.length);
        arraycopy(this.nodeArray,0,node1.nodeArray,0,index);

        return node1;
    }
}

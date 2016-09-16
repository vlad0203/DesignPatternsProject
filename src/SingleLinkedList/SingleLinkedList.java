package SingleLinkedList;

/**
 * Created by Влад on 8/30/2016.
 */
public class SingleLinkedList {
    public static void main(String[] args) {
        Node node3 = new Node(3, null);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node node0 = new Node(0, node1);

        Node ref = node0;

        System.out.println(RecSize(ref));
        while(ref!=null)
        {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }

    public static int iterSize(Node tail)
    {
        int length = 0;
        while(tail!=null)
        {
            length++;
            tail = tail.next;
        }
        return length;
    }

    public static int RecSize(Node tail)
    {
        return RecSize(tail,0);
    }

    public static int RecSize(Node tail, int size)
    {
        if(tail==null)
            return size;
        else
            return RecSize(tail.next, ++size);
    }

    public static int sum(Node tail)
    {
        int valuesSum = 0;
        while(tail!=null)
        {
            valuesSum+=tail.value;
            tail = tail.next;
        }
        return valuesSum;
    }

    public static int RecSum(Node tail)
    {
        return RecSum(tail, 0);
    }

    public static int RecSum(Node tail, int sum)
    {
        if(tail==null)
            return sum;
        else
        {
            sum+=tail.value;
            return RecSum(tail.next, sum);
        }

    }

    public static int max(Node tail)
    {
        int max = 0;
        while(tail!=null)
        {
            max=Math.max(max,tail.value);
            tail = tail.next;
        }
        return max;
    }

    public static int RecMax(Node tail)
    {
        return RecMax(tail, 0);
    }

    public static int RecMax(Node tail, int max)
    {
        if(tail==null)
            return max;
        else
        {
            max+=Math.max(tail.value,max);
            return RecMax(tail.next, max);
        }

    }
}

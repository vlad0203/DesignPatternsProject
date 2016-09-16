package algorithms.Union;

/**
 * Created by Влад on 9/5/2016.
 */
public class UnionFind {

    private int[] id;
    private int N;


    public UnionFind(int N){
        this.N = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p,int q){
        if((p<N)&&(q<N))
        {
            return (id[p]==id[q]);
        }
        else System.out.println("Bad operation!");
        return true;
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length ; i++) {
            if(id[i]==pid) id[i]=qid;
        }
    }

}

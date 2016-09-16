package reflectionExamples;

/**
 * Created by Влад on 9/12/2016.
 */
public class abcdef {
    public static void main(String[] args) {
        Integer i = 1000;
        Integer i2 = 1000;
        for (int j = 2; j < 1000; j++) {
            i=j;
            i2=j;
            if(i!=i2)
            {
                System.out.println(j);
                break;
            }
        }
    }
}

package CreationalPatternsExample.AbstractFactory;

/**
 * Created by Влад on 8/29/2016.
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}

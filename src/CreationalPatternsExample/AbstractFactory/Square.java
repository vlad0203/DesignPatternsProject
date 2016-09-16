package CreationalPatternsExample.AbstractFactory;

/**
 * Created by Влад on 8/29/2016.
 */
public class Square implements Shape {
    @Override
    public void draw()
    {
        System.out.println("Inside Square::draw() method.");
    }
}

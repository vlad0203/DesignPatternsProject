package CreationalPatternsExample.AbstractFactory;

/**
 * Created by Влад on 8/29/2016.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}

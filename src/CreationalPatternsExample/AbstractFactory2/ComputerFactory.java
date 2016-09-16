package CreationalPatternsExample.AbstractFactory2;

/**
 * Created by Влад on 9/16/2016.
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}

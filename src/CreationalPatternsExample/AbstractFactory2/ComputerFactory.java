package CreationalPatternsExample.AbstractFactory2;

/**
 * Created by ���� on 9/16/2016.
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}

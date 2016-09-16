package reflectionExamples.getClassExample;

/**
 * Created by Влад on 9/12/2016.
 */

import reflectionExamples.Classes.*;

public class GetClass {
    public static void main(String[] args) {
        Class<?> concreteClass = ConcreteClass.class;
        concreteClass = new ConcreteClass(5).getClass();
        try{
            concreteClass = Class.forName("reflectionExamples.Classes.ConcreteClass");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(concreteClass.getCanonicalName());

        Class<?> booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName());
    }
}

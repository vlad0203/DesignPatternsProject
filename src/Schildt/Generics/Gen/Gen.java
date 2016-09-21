package Schildt.Generics.Gen;

/**
 * Created by Vlad on 21.09.2016.
 */
public class Gen<T> {
    T ob;

    Gen(T o){ob = o;}

    T getOb(){return ob;}
}

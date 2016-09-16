package CreationalPatternsExample.Singleton;

import java.io.Serializable;

/**
 * Created by Влад on 9/12/2016.
 */
public class SerializableSingleton implements Serializable {
    private static long serialVersionUID = -7604766932017737115L;

    private SerializableSingleton(){}

    private static class SingletonHelper{
        private static final SerializableSingleton instance = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance(){
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}

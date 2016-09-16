package CreationalPatternsExample.AbstractFactory2;

/**
 * Created by Влад on 9/16/2016.
 */
public class ServerFactory implements ComputerAbstractFactory{

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }

}

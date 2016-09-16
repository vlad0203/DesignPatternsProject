package CreationalPatternsExample.AbstractFactory2;

/**
 * Created by Влад on 9/16/2016.
 */
public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}

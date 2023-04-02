package Transport;

import Transport.Transport;

public class Car extends Transport {
    public int length;
    public Car(){}
    public Car(int speed, int weight,int length, String color){
       super(speed, weight, color);
       this.length = length;
    }

    public void setValue(int speed, int weight,int length, String color){
        super.setValue(speed, weight, color);
        this.length = length;
    }
}

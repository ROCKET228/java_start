public class Transport {
    private int speed, weight;
    private String color;

    public Transport(int speed, int weight, String color){
        System.out.println("Object created");
        setValue(speed, weight, color);
        System.out.println(getValue());
    }

    public Transport(){}


    public void setValue(int speed, int weight, String color){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public String getValue(){
        String info = "Speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color;
        return info;
    }

}

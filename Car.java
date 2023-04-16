package car;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine){
        this.name= name;
        this.engine=engine;
        numberOfCars++;
    }
    public void display(){
        System.out.println("name: "+name+","+" engine: "+engine);
    }
}

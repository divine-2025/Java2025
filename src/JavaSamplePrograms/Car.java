package JavaSamplePrograms;

public class Car {
static String brand = "Ford";
String color;
int engineCapacity;

    public Car(String color, int engineCapacity) {
        this.color = color;
        this.engineCapacity = engineCapacity;
    }
    public void PrintCarDetails()
    {
        System.out.println("Brand: "+brand +" Color : "+ color +" Engine Capacity : " +engineCapacity );
    }
}

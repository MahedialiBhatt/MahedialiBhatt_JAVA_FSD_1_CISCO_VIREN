package cisco.java.innerClass;

class Car
{
    String carName;
    String carType;

    public Car(String name, String type)
    {
        this.carName=name;
        this.carType=type;
    }
    private String getCarName()
    {
        return this.carName;
    }

    //Inner class
    class Engine
    {
        String engineType;

        void setEngine()
        {
            if(Car.this.carType.equals("4WD"))
            {
                if(Car.this.getCarName().equals("Crystler"))
                {
                    this.engineType = "Smaller";
                }
                else
                {
                    this.engineType= "Bigger";
                }
            }
            else
                this.engineType = "Bigger";
        }

        String getEngineType()
        {
            return this.engineType;
        }
    }

}

public class Inner_Complex
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Mazda","8WD");

        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD = "+ engine.getEngineType());

        Car car2 = new Car("Crystler","4WD");
        Car.Engine engine2 =car2.new Engine();
        engine2.setEngine();
        System.out.println("Engine tyre for 4WD = " +engine2.getEngineType());
    }
}

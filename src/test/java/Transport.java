public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;
    public int  wheelSize;

    public Transport(float speed2, int weight2, String color2, byte[] coordinate2, int wheelSize2){
        System.out.println("Den4ik");
        setValues(speed2, weight2, color2, coordinate2, wheelSize2);
        System.out.println(getValues());
    }

    public Transport(int weight2, String color2){
        weight = weight2;
        color = color2;
        System.out.println(this.getValues());
    }

    // setValues - Установить значения!
    public void setValues(float speed, int weight, String color, byte[] coordinate, int wheelSize){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
        this.wheelSize = wheelSize;

    }
    // getValues - Получить значения!
    public String getValues() {
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color +
                ". WheelSize: " + wheelSize + ".\n";
        String infoCoordinates  = "Coordinates\n";

        for(int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\n";

        return info + infoCoordinates;
    }

}



public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;
    public int  wheelSize;

    // setValues - Установить значения!
    public void setValues(float speed2, int weight2, String color2, byte[] coordinate2, int wheelSize2){
        speed = speed2;
        weight = weight2;
        color = color2;
        coordinate = coordinate2;
        wheelSize = wheelSize2;

    }
    // getValues - Получить значения!
    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color +
                ". WheelSize: " + wheelSize + ".\n";
        String infoCoordinates  = "Coordinates\n";

        for(int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\n";

        return info + infoCoordinates;
    }

}



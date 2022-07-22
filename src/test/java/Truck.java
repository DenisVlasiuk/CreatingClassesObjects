public class Truck extends Transport{

    private boolean isLoaded;

    public Truck(int weight2, String color2){
        super(weight2, color2);

    }

    public Truck(int weight2, String color2, boolean isLoaded){
        super(weight2, color2);
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }

    public void getLoaded() {
        if(isLoaded)
        System.out.println("Грузовик загружен");
    else System.out.println("Грузовик не загружен");

    }

}

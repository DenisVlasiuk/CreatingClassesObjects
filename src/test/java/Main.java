public class Main {

    public static void main(String[] args) {
// ООП: Создание классов и объектов
        Transport bmw = new Transport();
        bmw.speed = 250.5f;
        bmw.weight = 2500;
        bmw.color = "White";
        bmw.coordinate = new byte[] {0, 0, 0,};
        bmw.wheelSize = 18;

        Transport truck = new Transport();
        truck.speed = 180.4f;
        truck.weight = 5600;
        truck.color = "Yelow";
        truck.coordinate = new byte[] {48 , 72, 60};
        truck.wheelSize = 25;

        System.out.println("Truck speed: " + truck.speed + ". Truck weight: " + truck.weight + ". Bmw color: " + bmw.color + ".");

    }
}

public class Main {

    public static void main(String[] args) {
// ООП: Создание классов и объектов
        Car bmw = new Car(250.5f, 2500, "White", new byte[] {48 , 72, 60}, 18);


        // 2 - вариант без использывания метода

        Truck truck = new Truck(250, "Red", true);

        truck.setLoaded(false);
        truck.getLoaded();


//        truck.speed = 180.4f;
//        truck.weight = 5600;
//        truck.color = "Yellow";
//        truck.coordinate = new byte[] {48 , 72, 60};
//        truck.wheelSize = 25;
//
//        String result2 = truck.getValues();
//        System.out.println(result2);
//        System.out.println(". Truck speed: " + truck.speed + "\n. Truck weight: " + truck.weight + "\n. Bmw color: " + bmw.color + "\n.");

    }
}

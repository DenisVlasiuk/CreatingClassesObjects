public class Main {

    // 1 - вариант с использыванием метода
    public static void main(String[] args) {
// ООП: Создание классов и объектов
        Transport bmw = new Transport();
        bmw.setValues(250.5f, 2500, "White", new byte[] {48 , 72, 60}, 18);
        String result1 = bmw.getValues();
        System.out.println(result1);
//        bmw.speed = 250.5f;
//        bmw.weight = 2500;
//        bmw.color = "White";
//        bmw.coordinate = new byte[] {0, 0, 0,};
//        bmw.wheelSize = 18;

        // 2 - вариант без использывания метода
        Transport truck = new Transport();
        truck.speed = 180.4f;
        truck.weight = 5600;
        truck.color = "Yelow";
        truck.coordinate = new byte[] {48 , 72, 60};
        truck.wheelSize = 25;

        String result2 = truck.getValues();
        System.out.println(result2);
//        System.out.println(". Truck speed: " + truck.speed + "\n. Truck weight: " + truck.weight + "\n. Bmw color: " + bmw.color + "\n.");

    }
}

public class Main {

    public static void main(String[] args) {
// ООП: Создание классов и объектов
        Transport bmw = new Transport(250.5f, 2500, "White", new byte[] {48 , 72, 60}, 18);
        bmw.setValues(258, 1500, "red", new byte[] {0, 21}, 21);
        System.out.println(bmw.getValues());

        // 2 - вариант без использывания метода

        Transport truck = new Transport(2500, "Yellow");
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

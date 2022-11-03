public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Granta", 1.7f, "жёлтый", -2015, "Россия");
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "чёрный", -2020, "Германия");
        cars[2] = new Car("BMW", "Z8", 3.0f, "чёрный",-2021, "Германия");
        cars[3] = new Car("KIA", "Sportage 4-го поколения", 2.4f, "красный", -2018, "Южная Корея");
        cars[4] = new Car("Hyundai", "Avante", 1.6f, "оранжевый", -2016, "Южная Корея");

        for (Car car : cars) {
            if (car != null) {
                System.out.println(car);
            }
        }


    }
}
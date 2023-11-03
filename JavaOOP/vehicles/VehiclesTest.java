package vehicles;

public class VehiclesTest {
    public static void main(String[] args) {
        //premenna vehicles je pole typu Vehicle[] (zoznam vozidiel)
        Vehicle[] vehicles = {
                new ElectricCar("Toyota", "olive", 80),
                new Truck("Avia", "gray", null),
                new Bus("Karosa", "red", 150)
        };

        //vypiseme si vsetky vozidla v poli vehicles
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }

        //priklad - vyberieme si polozku na indexe 1 v z pola vehicles
        Vehicle v1 = vehicles[1];
        //ak menime zo vseobecnejsieho (Vehicle) na konkretnejsi typ (Truck), potrebujeme PRETYPOVANIE:
        Truck t = (Truck) v1;
        //na Vehicle sa neda spravit truck, ale po pretypovani na Truck uz mame k dispozicii tuto metodu:
        t.load("Nabytok");

        //v poli vehicles su referencie na objekty,
        // teda po zavolani funkcie load() sa aktualizuje dany objekt v tomto poli
        //(referencie v1, t aj vehicles[1] ukazuju na ten isty objekt typu Truck)
        System.out.println(vehicles[1]);
    }
}

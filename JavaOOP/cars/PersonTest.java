package cars;

public class PersonTest {
    public static void main(String[] args) {
        Person m = new Person("Miska", "Bacikova", 26); //cars.Person m - premenna typu cars.Person
                                 // new cars.Person(); - vytvorenie noveho objektu cars.Person
//        m.setName("Miska");
//        m.setSurname("Bacikova");
//        boolean ageWasSet = m.setAge(26);
//        System.out.println(ageWasSet ? "age is valid" : "age is invalid");
        System.out.println(m.getName() + " " + m.getSurname() + ", " + m.getAge() + " ("
//                        + (ageWasSet ? "age is valid" : "age is invalid") + ")"
        );

        Person p2 = new Person("Michael", "Jackson", 200);

        //pravy klik -> Generate -> Constructor...
        //vytvorit konstruktor, ktory sa da takto pouzit:
        Person p3 = new Person("Chester", "Bennington");

        p3.setAge(38);
        System.out.println(p3.getName() + " " + p3.getSurname() + ", " + p3.getAge());

//        p2.setName("Michael");
//        p2.setSurname("Jackson");
//        ageWasSet = p2.setAge(200);
//        System.out.println(ageWasSet ? "age is valid" : "age is invalid");
        System.out.println(p2.getName() + " " + p2.getSurname() + ", " + p2.getAge() + " ("
//                + (ageWasSet ? "age is valid" : "age is invalid") + ")"
        );

        Car c = new Car("Toyota");
        c.setColor("red");
        c.start();
        c.setOwner(m);
        System.out.println(c.getBrand() + ", " + c.getColor()
                + ", " + c.isStarted());
        System.out.println("owner: " + c.getOwner().getName());

        Car c2 = new Car("BMW", "blue");
        c2.start();
        c2.stop();
        System.out.println(c2.getBrand() + ", " + c2.getColor()
                + ", " + c2.isStarted());
        System.out.println(c2.getOwner());

        Car c3 = new Car("Jaguar", "red", true);
        System.out.println(c3.getBrand() + ", " + c3.getColor()
                + ", " + c3.isStarted());
    }
}

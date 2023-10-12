public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(); //Person p - premenna typu Person
                                 // new Person(); - vytvorenie noveho objektu Person
        p.setName("Miska");
        p.setSurname("Bacikova");
        boolean ageWasSet = p.setAge(26);
//        System.out.println(ageWasSet ? "age is valid" : "age is invalid");
        System.out.println(p.getName() + " " + p.getSurname() + ", " + p.getAge() + " ("
                        + (ageWasSet ? "age is valid" : "age is invalid") + ")"
        );

        Person p2 = new Person();

        p2.setName("Michael");
        p2.setSurname("Jackson");
        ageWasSet = p2.setAge(200);
//        System.out.println(ageWasSet ? "age is valid" : "age is invalid");
        System.out.println(p2.getName() + " " + p2.getSurname() + ", " + p2.getAge() + " ("
                + (ageWasSet ? "age is valid" : "age is invalid") + ")"
        );

        Car c = new Car("Toyota");
        c.setColor("red");
        c.start();
        System.out.println(c.getBrand() + ", " + c.getColor()
                + ", " + c.isStarted());

        Car c2 = new Car("BMW", "blue");
        c2.start();
        System.out.println(c2.getBrand() + ", " + c2.getColor()
                + ", " + c2.isStarted());
    }
}

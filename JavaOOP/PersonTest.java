public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(); //Person p - premenna typu Person
                                 // new Person(); - vytvorenie noveho objektu Person
        p.setName("Miska");
        p.setSurname("Bacikova");
        p.setAge(26);
        System.out.println(p.getName() + " " + p.getSurname() + ", " + p.getAge());

        Person p2; //dorobit druhu osobu a jej vypis
    }
}

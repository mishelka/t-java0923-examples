package cars;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this(name, surname);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int wantedAge) {
        boolean validAge = isValidAge(wantedAge);
        if(validAge) this.age = wantedAge;
        return validAge;
    }

    private boolean isValidAge(int ageNew) {
        return ageNew >= 0 && ageNew <= 150;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age;
    }
}

//person.age = 300; TOTO NIE
//person.setAge(300); --- funguje validacia, OK

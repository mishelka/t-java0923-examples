public class HelloWorld {
    public static void main(String[] args) {
       System.out.println("Hello World!");

       char a = '*';
       int b = 123;
       int num = a;
       char d = (char) num;
       long dlhe = 12345678;
       b = (int) dlhe;
       dlhe = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(num);

        int day = 6;
        switch (day) {
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6:
            case 7: System.out.print("Weekend"); break;
            default: System.out.print("Invalid day."); break;
        }
    }
}

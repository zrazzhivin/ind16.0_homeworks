public class Task10 {
    public static void main(String[] args) {

        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("Initial person before calling method: " + person);
        changeValue(person);
        System.out.println("Final person after calling method: " + person);

    }

    public static void changeValue(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}
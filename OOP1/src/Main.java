import students.GryffindorStudent;
import students.HogwartsStudent;
import students.SlytherinStudent;

public class Main {
    public static void main(String[] args) {

        GryffindorStudent harry = new GryffindorStudent(
                100, 90, 80, 100, 90
        );

        GryffindorStudent ron = new GryffindorStudent(
                70, 80, 80, 90, 90
        );

        System.out.println(harry);
        System.out.println(ron);

        harry.compare(ron);
        harry.basicCompare(ron);

        SlytherinStudent drako = new SlytherinStudent(
                50, 60, 70, 80, 90, 50, 60
        );

        harry.basicCompare(drako);
    }
}
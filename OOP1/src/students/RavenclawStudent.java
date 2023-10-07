package students;

public class RavenclawStudent extends HogwartsStudent {

    private final int smart;
    private final int wise;
    private final int witty;
    private final int creativity;

    public RavenclawStudent(int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    protected int getSpecificAbilitiesSum() {
        return smart + wise + witty + creativity;
    }

    @Override
    public String toString() {
        return "RavenclawStudent{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void compare(RavenclawStudent ravenclawStudent) {
        int abilitiesSum1 = getSpecificAbilitiesSum();
        int abilitiesSum2 = ravenclawStudent.getSpecificAbilitiesSum();

        if (abilitiesSum1 > abilitiesSum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else if (abilitiesSum1 < abilitiesSum2) {
            System.out.println("Ученик 2 лучше ученика 1");
        } else {
            System.out.println("Ученики равны");
        }
    }
}

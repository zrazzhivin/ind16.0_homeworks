package students;

public class HufflepuffStudent extends HogwartsStudent {

    private final int hardworking;
    private final int loyal;
    private final int honest;

    public HufflepuffStudent(int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    //@Override
    protected int getSpecificAbilitiesSum() {
        return hardworking + loyal + honest;
    }

    @Override
    public String toString() {
        return "HufflepuffStudent{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void compare(HufflepuffStudent hufflepuffStudent) {
        int abilitiesSum1 = getSpecificAbilitiesSum();
        int abilitiesSum2 = hufflepuffStudent.getSpecificAbilitiesSum();

        if (abilitiesSum1 > abilitiesSum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else if (abilitiesSum1 < abilitiesSum2) {
            System.out.println("Ученик 2 лучше ученика 1");
        } else {
            System.out.println("Ученики равны");
        }
    }
}

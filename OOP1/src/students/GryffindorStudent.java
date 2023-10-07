package students;

public class GryffindorStudent extends HogwartsStudent {

    private final int nobility;
    private final int honor;
    private final int bravery;

    public GryffindorStudent(int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    protected int getSpecificAbilitiesSum() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return "GryffindorStudent{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void compare(GryffindorStudent gryffindorStudent) {
        int abilitiesSum1 = getSpecificAbilitiesSum();
        int abilitiesSum2 = gryffindorStudent.getSpecificAbilitiesSum();

        if (abilitiesSum1 > abilitiesSum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else if (abilitiesSum1 < abilitiesSum2) {
            System.out.println("Ученик 2 лучше ученика 1");
        } else {
            System.out.println("Ученики равны");
        }
    }
}

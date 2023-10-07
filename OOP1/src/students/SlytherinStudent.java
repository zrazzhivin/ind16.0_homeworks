package students;

public class SlytherinStudent extends HogwartsStudent {

    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public SlytherinStudent(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    protected int getSpecificAbilitiesSum() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    @Override
    public String toString() {
        return "SlytherinStudent{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void compare(SlytherinStudent slytherinStudent) {
        int abilitiesSum1 = getSpecificAbilitiesSum();
        int abilitiesSum2 = slytherinStudent.getSpecificAbilitiesSum();

        if (abilitiesSum1 > abilitiesSum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else if (abilitiesSum1 < abilitiesSum2) {
            System.out.println("Ученик 2 лучше ученика 1");
        } else {
            System.out.println("Ученики равны");
        }
    }
}

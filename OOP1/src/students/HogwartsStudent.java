package students;

public abstract class HogwartsStudent {

    protected final int magicPower;
    protected final int transgressionDistance;

    public HogwartsStudent(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    protected abstract int getSpecificAbilitiesSum();


    private int getBasicAbilitiesSum() {
        return magicPower + transgressionDistance;
    }

    public void basicCompare(HogwartsStudent hogwartsStudent) {
        int basicAbilitiesSum1 = getBasicAbilitiesSum();
        int basicAbilitiesSum2 = hogwartsStudent.getBasicAbilitiesSum();

        if (basicAbilitiesSum1 > basicAbilitiesSum2) {
            System.out.println("Ученик 1 лучше ученика 2 по базовым свойствам");
        } else if (basicAbilitiesSum1 < basicAbilitiesSum2) {
            System.out.println("Ученик 2 лучше ученика 1 по базовым свойствам");
        } else {
            System.out.println("Ученики равны по базовым свойствам");
        }
    }

//    public void compare(HogwartsStudent hogwartsStudent) {
//        int abilitiesSum1 = getSpecificAbilitiesSum();
//        int abilitiesSum2 = hogwartsStudent.getSpecificAbilitiesSum();
//
//        if (abilitiesSum1 > abilitiesSum2) {
//            System.out.println("Ученик 1 лучше ученика 2");
//        } else if (abilitiesSum1 < abilitiesSum2) {
//            System.out.println("Ученик 2 лучше ученика 1");
//        } else {
//            System.out.println("Ученики равны");
//        }
//    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}

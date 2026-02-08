public class emp {

    enum Gender {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

        int eid = 101;
        String name = "ABC";

        System.out.println("eid=" + eid);
        System.out.println("ename=" + name);

        Gender gender_select = Gender.MALE;
        System.out.println("gender=" + gender_select);
    }
}

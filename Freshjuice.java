public class Freshjuice {

    enum FreshJuiceSize {
        SMALL, MEDIUM, LARGE
    }

    FreshJuiceSize size;

    public static void main(String[] args) {

        Freshjuice juice = new Freshjuice();
        juice.size = Freshjuice.FreshJuiceSize.MEDIUM;

        System.out.println(juice.size);
    }
}

public class type {
    public static void main(String[] args) {
        int a = 257;
        byte k = (byte) a;
        System.out.println(k);

        int b = 123;
        byte u = (byte) b;
        System.out.println(u);

        // Type promotion

        byte x = 10;
        byte y = 30;

        int result = x * y;
        System.out.println(result);

        int p = 9;
        int q = 6;

        boolean result2 = p < q;
        System.out.println(result2);

        int g = 36;
        int h = 35;

        boolean result3 = g != h;
        System.out.println(result3);

        int b1 = 54;
        int n = 54;
        boolean result5 = b1 == n;
        System.out.println(result5);

        int x2 = 7;
        int y2 = 8;
        int b25 = 58;
        int b26 = 54;

        boolean result56 = x2 < y2 || b25 < b26;
        System.out.println(result56);

    }

}

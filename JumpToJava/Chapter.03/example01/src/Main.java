public class Main {
    public static void main(String[] args) {

        int a = 0;
        a = 2147483647;
        System.out.println(a+" + 1 = "+(a+1));

        float pi = 3.14F;
        System.out.println(pi);

        double d1 = 123.4;
        double d2 = 1.234e2;
        System.out.println(d1);
        System.out.println(d2);

        int octal = 023;
        int hex = 0xc;
        System.out.println(octal);
        System.out.println(hex);

        System.out.println("-------------------------------------");
        boolean isTrue = (3 % 7 == 4);
        System.out.println(isTrue);

        System.out.println("-------------------------------------");
        char a1 = 'a';
        char a2 = 97;
        char a3 = '\u0061';
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("-------------------------------------");
        String A = "Hello java";
        System.out.println(A);

        String B = new String("lalalala");
        System.out.println(A.equals(B));
        System.out.println(A.indexOf("java"));

        String b = "lala";
        System.out.println(B.contains(b));

        System.out.println(A.replaceAll("java", "world"));

        System.out.println("-------------------------------------");
        StringBuffer sb = new StringBuffer();

        System.out.println(sb);
        sb.append("hello");
        sb.append(" java");

        String result = sb.toString();
        System.out.println(result);

        System.out.println("-------------------------------------");
        int[] array = {3, 5, 2, 4, 67};
        System.out.println(array[2]);
        System.out.println(array.length);

        System.out.println("-------------------------------------");
        
    }
}
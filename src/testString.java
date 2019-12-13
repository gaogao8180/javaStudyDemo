public class testString {
    public static void main(String[] args) {
//        String str1 = "hello";
//        String str2 = "hello";
//        String str3 = "hello" + "world";
//        String str4 = str2 + "world";

        StringBuffer sb1;

        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        sb2.append(",");
        sb2.append("world");
        sb2.append(".");

        System.out.println(sb2.length());
        System.out.println(sb2.toString());

//        sb2.setLength(10);
//        System.out.println(sb2.toString());

        sb2.setLength(20);
        System.out.println(sb2.toString());
    }
}

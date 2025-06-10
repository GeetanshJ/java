public class Main{
    static String sname;
    static{
        sname = "Geetansh";
    }
    public static void main(String[] args) {    
        Car obj = new Car();
        obj.getBrake();

        // StringBuilder sb = new StringBuilder("");
        // System.out.println(sb.capacity());
        // sb.append(" World");
        // sb.insert(0, "hello welco");
        // // sb.delete(1,3);
        // System.out.println(sb);
        // System.out.println(sb.capacity());

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hey";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        s2 = "Hey";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

    }
}  
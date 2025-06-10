public class Main{

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
        System.out.println(Car.name + " " + obj.name);
    }
}  
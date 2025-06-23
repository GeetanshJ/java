// class A{
//     static  class C{
//         public void hello(){
//             System.out.println("Hello from C");
//         }
//     }

//     public A(){
//         System.out.println("Constructor A");
//     }

//     public void show(){
//         System.out.println("A show");
//     }
// }

// class B extends A{
//     public B(){
//         System.out.println("Constructor B");
//     }

//     @Override
//     public void show(){
//         System.out.println("B show");
//     }
// }

// class D extends B{
//     public D(){
//         System.out.println("Constructor D");
//     }

//     @Override
//     public void show(){
//         System.out.println("D show");
//     }

//     protected  static void dd(){
//         System.out.println("DD");
//     }
// }
class A{
    int a;

    public void abc(){
        int b;
        System.out.println(b);
        System.out.println(a);
    }
}

public class Main{

    public Main(){
    
        System.out.println("Inside Main constructor");
    }

    public static void main(String[] args) {    
        // A obj = new A();
        // // A.C obj1 = obj.new C();

        // A.C obj2 = new A.C();
        // obj2.hello();
    }
}  
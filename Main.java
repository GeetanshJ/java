class A{
    static  class C{
        public void hello(){
            System.out.println("Hello from C");
        }
    }

    public A(){
        System.out.println("Constructor A");
    }

    public void show(){
        System.out.println("A show");
    }
}

class B extends A{
    public B(){
        System.out.println("Constructor B");
    }

    @Override
    public void show(){
        System.out.println("B show");
    }
}

class C extends B{
    public C(){
        System.out.println("Constructor C");
    }

    @Override
    public void show(){
        System.out.println("C show");
    }

    protected  static void dd(){
        System.out.println("DD");
    }
}

public class Main{
    public Main(){
        System.out.println("Inside Main constructor");
    }

    public static void main(String[] args) {    
        A obj = new A();
        // A.C obj1 = obj.new C();

        A.C obj2 = new A.C();
        obj2.hello();
    }
}  
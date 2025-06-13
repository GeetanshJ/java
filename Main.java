import tools.*;

public class Main{
    public Main(){
        System.out.println("Inside Main constructor");
    }

    public static void main(String[] args) {    
        Level1 obj = new Level4();

        obj.show();
        // Parent obj1 = new Parent();
        // Thread t1 = new Thread(() -> {
        //     for(int i = 0;i < 4 ; i++){
        //         System.out.println("Child process " + i + " is running");
        //     }
        // });

        // t1.start();
        // t1.join();
        // System.out.println("Main Process...");

        
    }
}  
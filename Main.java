interface  A{
    public static void bad(){
 
    }
}


public class Main{

    int a = 4; 

    public static void main(String[] args) {
        int a = 4; 
        System.out.println(a);
        {
            System.out.println(a);
            a = 4;
            System.out.println(a);
        }



        System.out.println(a);
    }
}
package youDoIt;

public class DemoBlock {

    public static void main(String[] args){

        System.out.println("Demonstrating Block Scope.");
        int x = 1234;
        {
            int y = 2468;
            System.out.println("In this block x is " + x);
            System.out.println("In this block y is " + y);
        }
        {
            int y = 3691;
            System.out.println("In this block x is " + x);
            System.out.println("In this block y is " + y);
            demoMethod();
            System.out.println("After method, x is " + x);
            System.out.println("After method, y is " + y);
        }
        System.out.println("At the end x is " + x);
    }
    public static void demoMethod(){
        int x = 8642;
        int y = 9630;
        System.out.println("After method, x is " + x);
        System.out.println("After method block, y is " + y);
    }
}

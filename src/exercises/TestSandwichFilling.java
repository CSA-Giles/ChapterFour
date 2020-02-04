package exercises;

public class TestSandwichFilling {
    public static void main(String[] args){
        SandwichFilling firstFill = new SandwichFilling("Fried Egg", 55);
        SandwichFilling secondFill = new SandwichFilling(35);
        SandwichFilling thirdFill = new SandwichFilling("Roast Beef");

        firstFill.display2();
        secondFill.display2();
        thirdFill.display2();
    }

}

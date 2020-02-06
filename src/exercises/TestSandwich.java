package exercises;

public class TestSandwich {
    public static void main(String[] args){
        Sandwich first = new Sandwich("Whole wheat", 110, "ham", 75);
        Sandwich second = new Sandwich("Pumpernickel", 70, 80);
        Sandwich third = new Sandwich(55, 60);

        first.displaySandwich();
        second.displaySandwich();
        third.displaySandwich();
    }
}


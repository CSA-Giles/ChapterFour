package exercises;

public class TestBread {

    public static void main(String[] args){

        Bread first = new Bread("Rye", 65);
        Bread second = new Bread("White");
        Bread third = new Bread(110);

        first.display();
        second.display();
        third.display();
    }
}

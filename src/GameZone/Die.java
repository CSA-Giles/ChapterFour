package GameZone;

public class Die {

    public static void main(String[] args){
        int value;
        int value2;
        final int LOWEST_DIE_VALUE = 1;
        final int HIGHEST_DIE_VALUE = 6;
        GetDie die = new GetDie();
        GetDie die2 = new GetDie();
        value = ((int)(Math.random()* 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        value2 = ((int)(Math.random()* 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);

        die.setDieVal(value);
        die2.setDieVal(value2);
        System.out.println("You rolled a " + die.getDieVal() + " and a " + die2.getDieVal());
    }
}

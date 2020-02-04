package exercises;

public class SandwichFilling {


    private String sandwichFilling;
    private int calsPerServing;

    GetAndSet filling = new GetAndSet();
    GetAndSet serving = new GetAndSet();

    public SandwichFilling(String filling, int serving){
        sandwichFilling = filling;
        calsPerServing = serving;
    }
    public SandwichFilling(int serving){
        sandwichFilling = "Peanut Butter";
        calsPerServing = serving;
    }
    public SandwichFilling(String filling){
        sandwichFilling = filling;
        calsPerServing = 75;
    }
    public void display2(){

        filling.setSandwichFilling(sandwichFilling);
        serving.setCalPerServing(calsPerServing);

        System.out.println("Sandwich Filling: " + filling.getSandwichFilling() + ". Calories per serving: " + serving.getCalPerServing() + ".");
    }
}

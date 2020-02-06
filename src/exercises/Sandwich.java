package exercises;

public class Sandwich {

    private String sandwichFilling;
    private int calsPerServing;
    public String breadType;
    public int calsPerSlice;
    GetAndSet bread = new GetAndSet();
    GetAndSet slice = new GetAndSet();
    GetAndSet filling = new GetAndSet();
    GetAndSet serving = new GetAndSet();


    public Sandwich(String bread, int slice, String filling, int serving){
        breadType = bread;
        calsPerSlice = slice;
        sandwichFilling = filling;
        calsPerServing = serving;
    }
    public Sandwich(String bread, int slice, int serving){
        breadType = bread;
        calsPerSlice = slice;
        sandwichFilling = "fried egg";
        calsPerServing = serving;
    }
    public Sandwich(int slice, int serving){
        breadType = "Rye";
        calsPerSlice = slice;
        sandwichFilling = "peanut butter";
        calsPerServing = serving;
    }
    public void displaySandwich(){
        bread.setBreadType(breadType);
        slice.setCalPerSlice(calsPerSlice);
        filling.setSandwichFilling(sandwichFilling);
        serving.setCalPerServing(calsPerServing);
        int totalCal = (slice.getCalPerSlice() * 2) + serving.getCalPerServing();
        System.out.println("Here is a " + filling.getSandwichFilling() + " sandwich on " + bread.getBreadType() + " bread, with a total of " + totalCal + " calories.");
    }
}

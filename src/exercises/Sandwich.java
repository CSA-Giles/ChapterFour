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


    public Sandwich(int slice, int serving, String bread, String filling){
        breadType = bread;
        calsPerSlice = slice;
        sandwichFilling = filling;
        calsPerServing = serving;
    }
    public Sandwich(int slice, int serving, String bread){

    }
    public Sandwich(int slice, int serving){}
}

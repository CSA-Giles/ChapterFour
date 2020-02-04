package exercises;

public class Bread {

    public String breadType;
    public int calsPerSlice;
    public final static String MOTTO = "The staff of life.";
    GetAndSet bread = new GetAndSet();
    GetAndSet slice = new GetAndSet();


    public Bread(String bread, int calories){
        breadType = bread;
        calsPerSlice = calories;
    }
    public Bread(String bread){
        calsPerSlice = 55;
        breadType = bread;
    }
    public Bread(int calories){
        calsPerSlice = calories;
        breadType = "Whole Wheat";
    }
    public void display(){

        bread.setBreadType(breadType);
        slice.setCalPerSlice(calsPerSlice);
        System.out.println("Bread Type: " + bread.getBreadType() + ". Calories per slice: " + slice.getCalPerSlice() + ". " + MOTTO);
    }
}

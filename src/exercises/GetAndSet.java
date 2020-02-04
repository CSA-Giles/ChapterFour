package exercises;

public class GetAndSet {
    private int calPerSlice;
    private int calPerServing;
    private String breadType;
    private String sandwichFilling;

    public void setCalPerSlice(int slice){
        calPerSlice = slice;
    }
    public int getCalPerSlice(){
        return calPerSlice;
    }
    public void setCalPerServing(int serving){
        calPerServing = serving;
    }
    public int getCalPerServing(){
        return calPerServing;
    }
    public void setBreadType(String type){
        breadType = type;
    }
    public String getBreadType(){
        return breadType;
    }
    public void setSandwichFilling(String filling){
        sandwichFilling = filling;
    }

    public String getSandwichFilling() {
        return sandwichFilling;
    }
}

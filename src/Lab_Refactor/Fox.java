package Lab_Refactor;

public class Fox {

    public boolean isWearCoat;
    public boolean hasATorch;
    public String coatColor;
    public int bagCount;

    public void setInfo(boolean isWearCoat, boolean hasATorch, String coatColor, int bagCount){

        this.isWearCoat = isWearCoat;
        this.hasATorch = hasATorch;
        this.coatColor = coatColor;
        this.bagCount = bagCount;
    }
}

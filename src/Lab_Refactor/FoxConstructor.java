package Lab_Refactor;

public class FoxConstructor {

    public int foxNumber;
    public boolean isWearCoat;
    public boolean hasATorch;
    public String coatColor;
    public int bagCount;

    public FoxConstructor(int foxNumber, boolean isWearCoat, boolean hasATorch, String coatColor, int bagCount) {
        this.foxNumber = foxNumber;
        this.isWearCoat = isWearCoat;
        this.hasATorch = hasATorch;
        this.coatColor = coatColor;
        this.bagCount = bagCount;
    }
}

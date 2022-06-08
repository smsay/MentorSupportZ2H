package Lab_Refactor;

public class RefactoredThiefFoxV8 {

    public static void main(String[] args) {

        Database foxDatabase = new Database();
        for (FoxConstructor fox : foxDatabase.getAllFoxes()){
            isSuspect(fox);
        }

    }

    public static void isSuspect(FoxConstructor fox){

        if (fox.isWearCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3){
            System.out.println("\uD83E\uDD8A Fox"+fox.foxNumber+" is one of suspects! \uD83E\uDD14");
        }else{
            System.out.println("\uD83E\uDD8A Fox"+fox.foxNumber+" cleared of charges!");
        }

    }
}

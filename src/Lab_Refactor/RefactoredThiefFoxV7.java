package Lab_Refactor;

public class RefactoredThiefFoxV7 {

    public static void main(String[] args) {

        FoxConstructor[] updatedFoxes = {
                new FoxConstructor(1,true,true, "BLACK",0),
                new FoxConstructor(2,true,true, "BLACK",2),
                new FoxConstructor(3,true,true, "BLACK",3),
                new FoxConstructor(4,false,true, "GRAY",3)
        };

        for (FoxConstructor fox : updatedFoxes){
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

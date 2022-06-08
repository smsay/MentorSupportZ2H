package Lab_Refactor;

public class RefactoredThiefFoxV4 {

    public static void main(String[] args) {

        Fox fox1 = new Fox();
        fox1.setInfo(true,true, "BLACK",0);

        Fox fox2 = new Fox();
        fox2.setInfo(true,true,"BLACK",2);

        Fox fox3 = new Fox();
        fox3.setInfo(true,true,"BLACK",3);

        Fox fox4 = new Fox();
        fox4.setInfo(false,true,"GRAY",3);

        for (int i = 1; i <= 4; i++) {

            switch (i){
                case 1:
                    isSuspect(fox1, i);
                    break;
                case 2:
                    isSuspect(fox2, i);
                    break;
                case 3:
                    isSuspect(fox3, i);
                    break;
                case 4:
                    isSuspect(fox4, i);
                    break;
            }

        }

    }

    public static void isSuspect(Fox fox, int foxNumber){

        if (fox.isWearCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3){
            System.out.println("\uD83E\uDD8A Fox"+foxNumber+" is one of suspects! \uD83E\uDD14");
        }else{
            System.out.println("\uD83E\uDD8A Fox"+foxNumber+" cleared of charges!");
        }

    }
}

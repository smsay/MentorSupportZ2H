package Lab_Refactor;

public class RefactoredThiefFoxV1 {

    public static void main(String[] args) {

        Fox fox1 = new Fox();
        fox1.setInfo(true,true, "BLACK",0);

        Fox fox2 = new Fox();
        fox2.setInfo(true,true,"BLACK",2);

        Fox fox3 = new Fox();
        fox3.setInfo(true,true,"BLACK",3);

        Fox fox4 = new Fox();
        fox4.setInfo(false,true,"GRAY",3);

        if (fox1.isWearCoat && fox1.coatColor.equals("BLACK") && fox1.hasATorch && fox1.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox1 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox1 cleared of charges!");
        }

        if (fox2.isWearCoat && fox2.coatColor.equals("BLACK") && fox2.hasATorch && fox2.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox2 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox2 cleared of charges!");
        }

        if (fox3.isWearCoat && fox3.coatColor.equals("BLACK") && fox3.hasATorch && fox3.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox3 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox3 cleared of charges!");
        }

        if (fox4.isWearCoat && fox4.coatColor.equals("BLACK") && fox4.hasATorch && fox4.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox4 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox4 cleared of charges!");
        }

    }
}

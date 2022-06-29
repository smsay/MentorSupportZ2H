package Week9_Subwork;

public class Fighters {

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public void setInfo(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        do {
            if (firstAttacker.equals(fighter1.name)) {
                fighter2.health -= fighter1.damagePerAttack;
                firstAttacker = fighter2.name;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                firstAttacker = fighter1.name;
            }
        }
        while (fighter1.health > 0 && fighter2.health > 0);
        if (fighter2.health > 0) {
            return fighter2.name + " wins";
        } else {
            return fighter1.name + " wins";
        }
    }

    public static String declareWinner2(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a = fighter1, b = fighter2;

        if (firstAttacker.equals(fighter2.name)) {

            {
                a = fighter2;
                b = fighter1;
            }
            while (true) {
                if ((b.health -= a.damagePerAttack) <= 0)
                    return a.name + " wins";  // a wins if ((a.health -= b.damagePerAttack) <= 0) return b.name + " wins";
                                             // b wins    }}

            }
        }
        return firstAttacker;
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.setInfo("Laziz", 10, 2);
        Fighter fighter2 = new Fighter();
        fighter2.setInfo("Oleksiy", 5, 4);
        System.out.println(declareWinner(fighter1, fighter2, "Laziz"));
    }


}
package EnumRPG;

import java.text.DecimalFormat;

public class Combat {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    double attackerTempDamage;
    public Character fight(Character hero1,Character hero2){

        int round = 1;


        Character attacker = determineFirstAttacker(hero1, hero2);
        Character defender = (attacker == hero1) ? hero2 : hero1;

        attackerTempDamage=attacker.getDamage();

        writeCharacterCurrentHealth(hero2);
        System.out.println();
        writeCharacterCurrentHealth(hero1);
        System.out.println();

        while(defender.getHealth()>=0){

            printRoundHeader(round);
            round++;

            if (attacker.getCharacterClass() == Class.WARRIOR && attacker.getHealth() < attacker.getHealth() * 0.6) {
                Ability[] abilities = attacker.getCharacterClass().getAbilities();
                for (Ability ability : abilities) {
                    if (ability instanceof RageAbility) {
                        ability.useAbility(attacker, defender);
                        break;
                    }
                }
            } else {
                Ability[] abilities = attacker.getCharacterClass().getAbilities();
                for (Ability ability : abilities) {
                    if (ability instanceof RageAbility) {
                        ability.useAbility(attacker, defender);
                        break;
                    }
                }
            }

            double damage = attacker.getCharacterFinalDamageWithArmorCalc();
            defender.setHealth(defender.getHealth()-damage);

            writeCharacterCurrentHealth(defender);
            System.out.print(" <-- ");
            writeCharacterDamage(attacker,damage);

            if(defender.getHealth()<=0){
                return attacker;
            }

            Character temp = attacker;
            attacker = defender;
            defender = temp;
        }
        return new Character(Race.DEFAULT,Class.DEFAULT,"hiba");
    }

    private Character determineFirstAttacker(Character hero1, Character hero2) {
        // Haste alapján döntés az attacker személyéről
        if (hero1.getHaste() > hero2.getHaste()) {
            return hero1;
        } else if (hero1.getHaste() < hero2.getHaste()) {
            return hero2;
        } else {
            // Azonos Haste esetén véletlenszerűen választunk
            return Math.random() < 0.5 ? hero1 : hero2;
        }
    }

    public void writeCharacterDamage(Character hero,double dmg){
        System.out.println(hero.getName()+" sebzése: "+
                df.format(dmg));
    }
    public void writeCharacterCurrentHealth(Character hero){
        System.out.print(hero.getName() + " Élete: " + df.format(hero.getHealth()));
    }
    private void printRoundHeader(int round) {
            System.out.print("\u001B[0m---------------|| " + round + " ||---------------");
            System.out.println();

    }
}

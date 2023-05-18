package EnumRPG;

import java.text.DecimalFormat;

public class Combat {
    InputData input = new InputData();
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public Character fight(Character hero1,Character hero2){
        Character dDefault=new Character(Race.DEFAULT,Class.DEFAULT,"hiba");
        boolean isHit=false;
        int round = 1;

        System.out.println(hero2.getName()+"Élete: "+hero2.getHealth());
        System.out.println(hero1.getName()+"Élete: "+hero1.getHealth());
        while(hero2.getHealth()>=0){
            isHit=true;

            input.getContentTab();
            System.out.print(" "+round+" ");
            input.getContentTab();
            System.out.println();
            round++;

            if(hero1.getHealth()<=0){
                return hero2;
            }else if(hero2.getHealth()<=0){
                return hero1;
            }
            double damage = hero1.getCharacterFinalDamageWithArmorCalc();
            hero2.setHealth(hero2.getHealth()-damage);
            System.out.println(hero2.getName()+" Élete: "+ df.format(hero2.getHealth())+" <- "+hero1.getName()+" sebzése: "+
                    df.format(damage));
            while(hero1.getHealth()>=0 && isHit){
                isHit=false;
                if(hero1.getHealth()<=0){
                    return hero2;
                }else if(hero2.getHealth()<=0){
                    return hero1;
                }
                damage = hero2.getCharacterFinalDamageWithArmorCalc();
                hero1.setHealth(hero1.getHealth()-damage);
                System.out.println(hero1.getName()+" Élete: "+ df.format(hero1.getHealth())+" <- "+hero2.getName()+" sebzése: "+
                        df.format(damage));
            }
        }
        return dDefault;
    }
}

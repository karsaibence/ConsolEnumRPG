package EnumRPG;

import java.util.List;
import java.util.Random;

public class Character {
    Random rnd = new Random();
    private final Race race;
    private final Class characterClass;

    private double damage;
    private double health;
    private double armor;
    private int criticalHit;
    private final int haste;
    private int abilityCounter;
    private String name;
    public Character(Race race, Class characterClass, String name) {
        this.race = race;
        this.characterClass = characterClass;
        this.name = name;
        this.damage = race.getDamage()+characterClass.getDamage();
        this.health = race.getHealth()+characterClass.getHealth();
        this.armor = race.getArmor()+characterClass.getArmor();
        this.criticalHit = race.getCrit()+characterClass.getCrit();
        this.haste = race.getHaste()+characterClass.getHaste();
        this.abilityCounter = 0;
    }
    public Race getRace() {
        return race;
    }
    public Class getCharacterClass() {
        return characterClass;
    }
    public double getDamage() {
        return damage;
    }
    public double getHealth() {
        return health;
    }
    public double getArmor() {
        return armor;
    }
    public int getCriticalHit() {
        return criticalHit;
    }
    public int getHaste() {
        return haste;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public void setCriticalHit(int criticalHit) {
        this.criticalHit = criticalHit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return  "Faj: " + race +
                "\nKaszt: " + characterClass +
                "\nName: " + name +
                "\n"+
                "\nDamage: " + damage +
                "\nÉlet: " + health +
                "\nArmor: " + armor +
                "\nCrit: " + criticalHit +
                "\nGyorsaság: " + haste;
    }
    public double getCharacterAttack(){
        return rnd.nextDouble(getDamage()*0.95,getDamage()*1.05);
    }
    public double criticalHit(double characterAutoDamage){

        int critChance = rnd.nextInt(0,100);
        if(critChance<=getCriticalHit()){
            System.out.print("\u001B[33m");
            return characterAutoDamage * 2;
        }
        System.out.print("\u001B[0m");
        return characterAutoDamage;
    }
    public double getCharacterFinalDamageWithArmorCalc(){
        double finalDMG = criticalHit(getCharacterAttack());
        return finalDMG-((getArmor()/2)*(finalDMG*0.01));
    }
    public int getAbilityCounter() {
        return abilityCounter;
    }

    public void incrementAbilityCounter() {
        abilityCounter++;
    }

}

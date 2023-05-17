package EnumRPG;

import java.util.Random;

public class Character {
    private Race race;
    private Class characterClass;

    private double damage;
    private double health;
    private double armor;
    private int criticalHit;
    private double haste;
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
    public double getHaste() {
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

    public void setHaste(double haste) {
        this.haste = haste;
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
                "\nDamage: " + damage +
                "\nÉlet: " + health +
                "\nArmor: " + armor +
                "\nCrit: " + criticalHit +
                "\nGyorsaság: " + haste;
    }
    public double getCharacterAttack(){
        Random rnd = new Random();
        double dmg =rnd.nextDouble(getDamage()*0.95,getDamage()*1.05);
        return dmg;
    }
    public double criticalHit(double characterAutoDamage){
        Random rnd = new Random();
        int critChance = rnd.nextInt(0,100);
        double critDamage=characterAutoDamage;
        if(critChance<=getCriticalHit()){
            critDamage =critDamage*2;
        }
        return critDamage;
    }
}

package EnumRPG;

public enum Class {
    DEFAULT(0,0,0,0,0),
    WARRIOR(50,750,50,10,40),
    HUNTER(45,650,40,15,50),
    MAGE(65,500,20,12,30),
    ROGUE(40,575,30,20,55),
    PALADIN(55,680,45,8,35);

    private final double damage;
    private final double health;
    private final double armor;
    private final int crit;
    private final int haste;

    Class(double damage, double health, double armor, int crit, int haste) {
        this.damage = damage;
        this.health = health;
        this.armor = armor;
        this.crit = crit;
        this.haste = haste;
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

    public int getCrit() {
        return crit;
    }

    public int getHaste() {
        return haste;
    }
}

package EnumRPG;

public enum Race {
    DEFAULT(0,0,0,0,0),
    ORC(10,150,10,5,8),
    HUMAN(9,140,9,8,10),
    ELF(9,130,8,10,12),
    GNOME(11,140,9,6,12),
    DWARF(8,160,11,5,7);

    private final double damage;
    private final double health;
    private final double armor;
    private final int crit;
    private final int haste;

    Race(double damage, double health, double armor, int crit, int haste) {
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

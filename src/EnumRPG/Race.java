package EnumRPG;

public enum Race {
    DEFAULT(0,0,0,0,0),
    ORC(10,150,10,5,8),
    HUMAN(9,140,9,8,10),
    ELF(9,130,8,10,12),
    GNOME(11,140,9,6,12),
    DWARF(8,160,11,5,7);

    private int damage;
    private int health;
    private int armor;
    private int crit;
    private int haste;

    Race(int damage, int health, int armor, int crit, int haste) {
        this.damage = damage;
        this.health = health;
        this.armor = armor;
        this.crit = crit;
        this.haste = haste;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getCrit() {
        return crit;
    }

    public int getHaste() {
        return haste;
    }
}

package EnumRPG;

public enum Class {
    DEFAULT(0,0,0,0,0,new DefaultAbility()),
    WARRIOR(50,750,50,10,40, new RageAbility()),
    HUNTER(45,650,40,15,50,new FreezeTrap()),
    MAGE(65,500,20,12,30,new IcyLaunch()),
    ROGUE(40,575,30,20,55,new AmbushAbility()),
    PALADIN(55,680,45,8,35,new DivineShieldAbility());

    private final double damage;
    private final double health;
    private final double armor;
    private final int crit;
    private final int haste;
    private final Ability[] abilities;

    Class(double damage, double health, double armor, int crit, int haste, Ability... abilities) {
        this.damage = damage;
        this.health = health;
        this.armor = armor;
        this.crit = crit;
        this.haste = haste;
        this.abilities = abilities;
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
    public Ability[] getAbilities() {
        return abilities;
    }
}

package EnumRPG;

public abstract class Ability {
    private String name;

    public Ability(String name) {
        this.name = name;
    }
    public abstract void useAbility(Character character);
}

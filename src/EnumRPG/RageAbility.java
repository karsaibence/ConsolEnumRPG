package EnumRPG;

public class RageAbility extends Ability{
    public RageAbility(String name) {
        super(name);
    }

    @Override
    public void useAbility(Character character) {
        double currentDamage = character.getDamage();
        double increasedDamage = currentDamage * 1.2;

        character.setDamage(increasedDamage);
        System.out.println(character.getName() + " Belépett Ragemódba. A következő 3 támadása 20%-kal nagyobb lesz.");
    }
}

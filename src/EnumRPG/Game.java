package EnumRPG;

public class Game {
    public static void main(String[] args) {
        InputData input = new InputData();
        String characterName = input.getName("Add meg az első karakter nevét.");

        Character hero1 = new Character(input.getCharacterRace(),input.getCharacterClass(),characterName);

        characterName = input.getName("Add meg a második karakter nevét.");
        Character hero2 = new Character(input.getCharacterRace(),input.getCharacterClass(),characterName);

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
    }
}

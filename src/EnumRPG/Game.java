package EnumRPG;

public class Game {
    public static void main(String[] args) {
        inputData input = new inputData();
        String characterName = input.nameCall();

        Character hero1 = new Character(input.raceCall(),input.classCall(),characterName);

        characterName = input.nameCall();
        Character hero2 = new Character(input.raceCall(),input.classCall(),characterName);

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
    }
}

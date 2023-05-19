package EnumRPG;
import java.util.Scanner;
public class InputData {
    Scanner sc = new Scanner(System.in);

    public String getName(String message){
        System.out.println(message);
        String characterName;
        boolean isValid = false;
        do {
            characterName = sc.nextLine();
            if(characterName.length()<3){
                System.out.println("Túl rövid nevet adtál meg");
                continue;
            }
            if(java.lang.Character.isDigit(characterName.charAt(0))){
                System.out.println("A név nem kezdődhet számmal");
            }else{
                isValid=true;
            }
        }while(!isValid);

        return characterName;
    }
    public Race getCharacterRace(){

        int raceNumber=getValidNumber("1. Orc.\n2. Human.\n3. Elf.\n4. Gnome.\n5. Dwarf.",
                "hibás vagy nem számot adtál meg.",0,Race.values().length);
        switch (raceNumber) {
            case 1 -> {
                return Race.ORC;
            }
            case 2 -> {
                return Race.HUMAN;
            }
            case 3 -> {
                return Race.ELF;
            }
            case 4 -> {
                return Race.GNOME;
            }
            case 5 -> {
                return Race.DWARF;
            }
            default -> {
                return Race.DEFAULT;
            }
        }

    }
    public Class getCharacterClass(){

        int classNumber=getValidNumber("Kérlek add meg a kaszt számát amit választottál:" +
                "\n1. Warrior.\n2. Hunter.\n3. Mage.\n4. Rogue.\n5. Paladin.","Hibás vagy nem számot adtál meg.",
                0, Class.values().length);

        switch (classNumber) {
            case 1 -> {
                return Class.WARRIOR;
            }
            case 2 -> {
                return Class.HUNTER;
            }
            case 3 -> {
                return Class.MAGE;
            }
            case 4 -> {
                return Class.ROGUE;
            }
            case 5 -> {
                return Class.PALADIN;
            }
            default -> {
                return Class.DEFAULT;
            }
        }

    }
    public int getValidNumber(String message,String errorMessage,int minNumberOfInput,int maxNumberOfInput){
        int number=0;

        do{
            System.out.println(message);

            while(!sc.hasNextInt()) {
                System.out.println(errorMessage);
                sc.next();
            }
                number=sc.nextInt();
            sc.nextLine();

                if(number <= minNumberOfInput || number >= maxNumberOfInput){
                    System.out.println(errorMessage);
                }

        }while(number <= minNumberOfInput || number >= maxNumberOfInput);

        return number;
    }
}

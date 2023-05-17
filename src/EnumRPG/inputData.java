package EnumRPG;
import java.util.Scanner;
public class inputData {
    Scanner sc = new Scanner(System.in);

    public String nameCall(){
        System.out.println("Kérlek add meg az első hős nevét.");
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
    public Race raceCall(){

        boolean isValid = false;
        int raceNumber=0;
        while(!isValid){
            System.out.println("Kérlek add az első hős fajának számát.");
            System.out.println("1. Orc.\n2. Human.\n3. Elf.\n4. Gnome.\n5. Dwarf.");

            if (sc.hasNextInt()) {
                raceNumber = sc.nextInt();
                if (raceNumber >= 1 && raceNumber <= 5) {
                    isValid = true;
                } else {
                    System.out.println("Hibás bemenet! Kérem, adj meg egy érvényes számot.");
                }
            }else{
                System.out.println("Hibás bemenet. Kérem adjon meg egy szémot.");
                sc.nextLine();
            }
        }
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
    public Class classCall(){

        boolean isValid = false;
        int classNumber=0;
        while(!isValid){
            System.out.println("Kérlek add az első hős kasztjának számát.");
            System.out.println("1. Warrior.\n2. Hunter.\n3. Mage.\n4. Rogue.\n5. Paladin.");

            if (sc.hasNextInt()) {
                classNumber = sc.nextInt();
                if (classNumber >= 1 && classNumber <= 5) {
                    isValid = true;
                } else {
                    System.out.println("Hibás bemenet! Kérem, adj meg egy érvényes számot.");
                }
            }else{
                System.out.println("Hibás bemenet. Kérem adjon meg egy szémot.");
                sc.nextLine();
            }
        }
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
}

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        int value = 0b1101_1000;
        System.out.println(Integer.toString(value));
        System.out.print("Wpiszże: ");
        Scanner keyboard = new Scanner(System.in);
        String base = keyboard.nextLine();
        switch (base) {
            case "dziesięć":
                BaseTen ten = new BaseTen();
                System.out.println(ten.convert(value));
                break;
            case "trzy":
                BaseThree three = new BaseThree();
                System.out.println(three.convert(value));
                break;
            case "szesnaście":
                BaseSixteen sixteen = new BaseSixteen();
                System.out.println(sixteen.convert(value));
                break;
            default:
                System.out.println("Błędny input.");
                break;
        }
    }
}

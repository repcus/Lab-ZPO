import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Obliczanie odległości Levenshtein'a z uwzględnieniem sąsiedztwa znaków na klawiaturze\nPodaj pierwszy wyraz:");
        String s1 = keyboard.nextLine();
        System.out.println("Podaj drugi wyraz:");
        String s2 = keyboard.nextLine();
        System.out.println("Odległość Levenshtein'a: " + Levenshtein.LevQWERTY(s1, s2));
    }
}

import javax.swing.JOptionPane;
import java.util.HashMap;

public class main extends Exception{

    public static void main(String[] args) {

        HashMap<Character, String> digitHM = new HashMap<>();
        digitHM.put('1', "jeden");
        digitHM.put('2', "dwa");
        digitHM.put('3', "trzy");
        digitHM.put('4', "cztery");
        digitHM.put('5', "pięć");
        digitHM.put('6', "sześć");
        digitHM.put('7', "siedem");
        digitHM.put('8', "osiem");
        digitHM.put('9', "dziewięć");

        String expression = JOptionPane.showInputDialog("Wpisz wyrażenie");

        switch(Validator.validate(expression)){
            case 4:
                JOptionPane.showMessageDialog(null, String.format("minus %s %s %s", digitHM.get(expression.charAt(1)), digitHM.get(expression.charAt(2)), digitHM.get(expression.charAt(3))));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, String.format("%s %s %s", digitHM.get(expression.charAt(0)), digitHM.get(expression.charAt(1)), digitHM.get(expression.charAt(2))));
                break;
            default:
                throw new IllegalArgumentException("Błąd walidatora");
        }
    }
}
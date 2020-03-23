public class Validator{

    private static boolean isNum(Character c){
        if(c > '9' || c < '0'){
            return false;
        }
        return true;
    }

    public static Integer validate(String expression){
        if((expression.length() == 4 && !(expression.charAt(0) == '-' && isNum(expression.charAt(1)) && isNum(expression.charAt(2)) && isNum(expression.charAt(3)))) || (expression.length() == 3 && !(isNum(expression.charAt(0)) && isNum(expression.charAt(1)) && isNum(expression.charAt(2))))) {
            throw new IllegalArgumentException("Zła treść argumentu");
        }else if(expression.length() != 3 && expression.length() != 4){
            throw new IllegalArgumentException("Zła długość argumentu");
        }else if(expression.length() == 4 && expression.charAt(0) == '-' && isNum(expression.charAt(1)) && isNum(expression.charAt(2)) && isNum(expression.charAt(3))){
            return 4;
        }else if(expression.length() == 3 && isNum(expression.charAt(0)) && isNum(expression.charAt(1)) && isNum(expression.charAt(2))){
            return 3;
        }
        return 0;
    }
}

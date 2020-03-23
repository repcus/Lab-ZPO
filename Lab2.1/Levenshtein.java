import java.util.HashMap;

public class Levenshtein {
    public static double LevQWERTY(String s1, String s2){
        HashMap<Character, String> levHM = new HashMap<>();
        levHM.put('q', "w");
        levHM.put('w', "eq");
        levHM.put('e', "rw");
        levHM.put('r', "te");
        levHM.put('t', "yr");
        levHM.put('y', "ut");
        levHM.put('u', "iy");
        levHM.put('i', "ou");
        levHM.put('o', "pi");
        levHM.put('p', "i");
        levHM.put('a', "s");
        levHM.put('s', "da");
        levHM.put('d', "fs");
        levHM.put('f', "gd");
        levHM.put('g', "hf");
        levHM.put('h', "jg");
        levHM.put('j', "kh");
        levHM.put('k', "lj");
        levHM.put('l', "k");
        levHM.put('z', "x");
        levHM.put('x', "cz");
        levHM.put('c', "vx");
        levHM.put('v', "bc");
        levHM.put('b', "nv");
        levHM.put('n', "mb");
        levHM.put('m', "n");

        int i, j;
        int m = s1.length();
        int n = s2.length();
        double cost;
        double[][] distanceTable = new double[m + 1][n + 1];

        for(i = 0; i <= m; i++){
            distanceTable[i][0] = i;
        }

        for(j = 1; j <= n; j++){
            distanceTable[0][j] = j;
        }

        for(i = 1; i <= m; i++){
            for(j = 1; j <= n; j++){
                cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : (levHM.get(s1.charAt(i - 1)).contains(Character.toString(s2.charAt(j - 1))) ? 0.5 : 1);
                distanceTable[i][j] = Math.min(distanceTable[i - 1][j] + 1, Math.min(distanceTable[i][j - 1] + 1, distanceTable[i - 1][j - 1] + cost));
            }
        }
        return distanceTable[m][n];
    }
}

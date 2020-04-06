import java.util.HashMap;

public class Levenshtein {
    public static int levDistance(String s1, String s2){
        int i, j;
        int m = s1.length();
        int n = s2.length();
        int cost;
        int[][] distanceTable = new int[m + 1][n + 1];
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for(i = 0; i <= m; i++){
            distanceTable[i][0] = i;
        }

        for(j = 1; j <= n; j++){
            distanceTable[0][j] = j;
        }

        for(i = 1; i <= m; i++){
            for(j = 1; j <= n; j++){
                cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                distanceTable[i][j] = Math.min(distanceTable[i - 1][j] + 1, Math.min(distanceTable[i][j - 1] + 1, distanceTable[i - 1][j - 1] + cost));
            }
        }
        return distanceTable[m][n];
    }
}

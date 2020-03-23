import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

public class ThreeSorts {

    public static void sortStrings(Collator collator, String[] words) {
        int n = words.length;
        for (int i = 1; i < n; ++i) {
            String key = words[i];
            int j = i - 1;

            while (j >= 0 && (collator.compare(words[j], key) == 1)) {
                words[j + 1] = words[j];
                j = j - 1;
            }
            words[j + 1] = key;
        }
    }

    public static void fastSortStrings(Collator collator, String[] words){
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return collator.compare(o1, o2);
            }
        });
    }

    public static void fastSortStrings2(Collator collator, String[] words){
        Arrays.sort(words, (a, b) -> collator.compare(a, b));
    }

    public static void printArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("%s ", array[i]);
        }
    }
}

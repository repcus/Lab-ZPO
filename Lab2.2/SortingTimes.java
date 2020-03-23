import java.text.Collator;
import java.util.Locale;

public class SortingTimes {

    public static long speedTestFastSort(){
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));
        long startTime = System.nanoTime();
        for(long i = 0; i < 100000; i++){
            String[] names = new String[]{"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
            ThreeSorts.fastSortStrings(collator, names);
        }
        long runTime = System.nanoTime() - startTime;
        return runTime;
    }

    public static long speedTestFastSort2(){
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));
        long startTime = System.nanoTime();
        for(long i = 0; i < 100000; i++){
            String[] names = new String[]{"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
            ThreeSorts.fastSortStrings2(collator, names);
        }
        long runTime = System.nanoTime() - startTime;
        return runTime;
    }

    public static long speedTestSort(){
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));
        long startTime = System.nanoTime();
        for(long i = 0; i < 100000; i++){
            String[] names = new String[]{"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
            ThreeSorts.sortStrings(collator, names);
        }
        long runTime = System.nanoTime() - startTime;
        return runTime;
    }
}

import java.text.Collator;
import java.util.Locale;

public class main {
    public static void main(String[] args){

        String[] names = new String[]{"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));
        ThreeSorts.sortStrings(collator, names);
        System.out.println("sortStrings():");
        ThreeSorts.printArray(names);
        System.out.print("\n\n");

        names = new String[]{"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
        ThreeSorts.fastSortStrings(collator, names);
        System.out.println("fastSortStrings():");
        ThreeSorts.printArray(names);
        System.out.print("\n\n");

        names = new String[]{"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
        ThreeSorts.fastSortStrings2(collator, names);
        System.out.println("fastSortStrings2():");
        ThreeSorts.printArray(names);
        System.out.print("\n\n");

        System.out.printf("sortStrings() ellapsed time: %d ns\n\nfastSortStrings() ellapsed time: %d ns\n\nfastSortStrings2() ellapsed time: %d ns", SortingTimes.speedTestSort(), SortingTimes.speedTestFastSort(), SortingTimes.speedTestFastSort2());
    }
}

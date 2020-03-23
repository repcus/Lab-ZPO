import org.junit.jupiter.api.Assertions;
import java.text.Collator;
import java.util.Locale;

class ThreeSortsTest {

    @org.junit.jupiter.api.Test
    void testSortStrings() {
        String[] sortedNames = {"Agnieszka", "Darek", "Łukasz", "Órszula", "Stefania", "Ścibor", "Świętopełk", "Zyta"};
        String[] testNames = {"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
        Collator testCollator = Collator.getInstance(new Locale("pl", "PL"));
        ThreeSorts.sortStrings(testCollator, testNames);
        Assertions.assertArrayEquals(sortedNames, testNames);
    }

    @org.junit.jupiter.api.Test
    void testFastSortStrings() {
        String[] sortedNames = {"Agnieszka", "Darek", "Łukasz", "Órszula", "Stefania", "Ścibor", "Świętopełk", "Zyta"};
        String[] testNames = {"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
        Collator testCollator = Collator.getInstance(new Locale("pl", "PL"));
        ThreeSorts.fastSortStrings(testCollator, testNames);
        Assertions.assertArrayEquals(sortedNames, testNames);
    }

    @org.junit.jupiter.api.Test
    void fastSortStrings2() {
        String[] sortedNames = {"Agnieszka", "Darek", "Łukasz", "Órszula", "Stefania", "Ścibor", "Świętopełk", "Zyta"};
        String[] testNames = {"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka", "Zyta", "Órszula", "Świętopełk"};
        Collator testCollator = Collator.getInstance(new Locale("pl", "PL"));
        ThreeSorts.fastSortStrings2(testCollator, testNames);
        Assertions.assertArrayEquals(sortedNames, testNames);
    }
}
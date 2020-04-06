import org.junit.Test;
import static org.junit.Assert.*;


public class TestLevenshtein {

    @Test
    public void levDistanceOne(){
        String levTest = "massacre";

        String oneDistance1 = "massacrr";
        String oneDistance2 = "MaSsAcRs";
        String oneDistance3 = "massacEe";

        assertEquals(1, Levenshtein.levDistance(levTest, oneDistance1), 0.1);
        assertEquals(1, Levenshtein.levDistance(levTest, oneDistance2), 0.1);
        assertEquals(1, Levenshtein.levDistance(levTest, oneDistance3), 0.1);

    }

    @Test
    public void levDistanceZero(){
        String levTest = "massacre";
        String levDistanceZero = "MassACRE";
        assertEquals(0, Levenshtein.levDistance(levTest, levDistanceZero), 0.1);

        levTest = "death";
        levDistanceZero = "deATh";
        assertEquals(0, Levenshtein.levDistance(levTest, levDistanceZero), 0.1);

        levTest = "toRMENT";
        levDistanceZero = "TOrment";
        assertEquals(0, Levenshtein.levDistance(levTest, levDistanceZero), 0.1);

    }

}

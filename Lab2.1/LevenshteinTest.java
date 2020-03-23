import org.junit.jupiter.api.Assertions;

class LevenshteinTest {

    @org.junit.jupiter.api.Test
    void levQWERTY() {
        Assertions.assertEquals(1.5, Levenshtein.LevQWERTY("kot", "kita"));
        Assertions.assertEquals(2, Levenshtein.LevQWERTY("drab", "dal"));
    }
}
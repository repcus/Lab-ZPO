public class BaseSixteen implements Converter {
    @Override
    public String convert(int number) {
        return Integer.toString(number, 16);
    }
}
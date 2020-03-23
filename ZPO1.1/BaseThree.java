public class BaseThree implements Converter {
    @Override
    public String convert(int number) {
        return Integer.toString(number, 3);
    }
}
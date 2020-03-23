public class RulerDraw {

    public static void drawLine(int tickLength, int maxLineLength) {
        drawLine(tickLength, -1, maxLineLength);
    }

    public static void drawLine(int lineLength, int lineLabel, int maxLineLength) {
        int spaces = maxLineLength - lineLength;
        for (int i = 0; i < lineLength; i++){
            char c = ((i < spaces) ? ' ' : '-');
            System.out.printf("%c", c);
            if(i == lineLength - 1 && lineLabel != -1) {
                    System.out.printf(" %d", lineLabel);
            }
        }
        System.out.print("\n");
    }

    public static void drawLines(int lineLength, int maxLineLength) {
        if (lineLength * 2 >  maxLineLength) {
            drawLines(lineLength - 1, maxLineLength);
            drawLine(lineLength, maxLineLength);
            drawLines(lineLength - 1, maxLineLength);
        }
    }

    public static void drawRuler(int numberOfMajorDivisions, int maxLineLength) {
        maxLineLength *= 2;
        drawLine(maxLineLength, 0, maxLineLength);
        for (int i = 1; i <= numberOfMajorDivisions; i++) {
            drawLines(maxLineLength - 1, maxLineLength);
            drawLine(maxLineLength, i, maxLineLength);
        }
    }
}

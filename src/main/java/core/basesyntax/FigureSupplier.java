package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0 -> {
                double radius = random.nextDouble() * 20 + 1;
                return new Circle(randomColor, radius);
            }
            case 1 -> {
                double side = random.nextDouble() * 15 + 1;
                return new Square(randomColor, side);
            }
            case 2 -> {
                double width = random.nextDouble() * 10 + 1;
                double rectangleHeight = random.nextDouble() * 10 + 1;
                return new Rectangle(randomColor, width, rectangleHeight);
            }
            case 3 -> {
                double firstLeg = random.nextDouble() * 10 + 1;
                double secondLeg = random.nextDouble() * 10 + 1;
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            }
            default -> {
                double topBase = random.nextDouble() * 10 + 1;
                double bottomBase = random.nextDouble() * 10 + 1;
                double trapezoidHeight = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, trapezoidHeight);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}

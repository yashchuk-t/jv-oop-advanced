package core.basesyntax;

public class Rectangle implements Figure {
    private final String color;
    private final double width;
    private final double rectangleHeight;

    public Rectangle(String color, double width, double rectangleHeight) {
        this.color = color;
        this.width = width;
        this.rectangleHeight = rectangleHeight;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return width * rectangleHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq. units, width: " + (int) width
                + " units, rectangle Height: " + (int) rectangleHeight
                + " units, color: " + getColor());
    }
}

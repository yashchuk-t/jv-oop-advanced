package core.basesyntax;

public class Circle implements Figure {
    private final String color;
    private final double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + String.format("%.1f", getArea())
                + " sq. units, radius: " + (int) radius
                + " units, color: " + getColor());
    }
}

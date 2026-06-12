package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {
    private final double radius;

    public Circle(String color, double radius) {
        super(Color.valueOf(color));
        this.radius = radius;
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

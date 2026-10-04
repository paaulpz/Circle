package circle;

/**
 * Class that represents a circle.
 *
 * @author Paula
 * @version 1.0
 */
public class Circle {

    /** X coordinate of the center. */
    private double x;

    /** Y coordinate of the center. */
    private double y;

    /** Radius of the circle. */
    private double radius;

    /**
     * Creates a circle.
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @param radius Radius of the circle
     */
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Gets the X coordinate.
     *
     * @return X coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the Y coordinate.
     *
     * @return Y coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * Gets the radius.
     *
     * @return Radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates the diameter.
     *
     * @return Diameter
     */
    public double diameter() {
        return 2 * radius;
    }

    /**
     * Calculates the circumference.
     *
     * @return Circumference
     */
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculates the area.
     *
     * @return Area
     */
    public double area() {
        return Math.PI * radius * radius;
    }
}
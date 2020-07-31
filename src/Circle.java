public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public int getSquare(double radius) {
        return (int) ((int) 2 * Math.PI * radius);
    }

    public String draw() {
        return "Круг, " + "площадь: " + getSquare(radius) + " кв.ед., " +
                " цвет: " + getColor(color);
    }
}

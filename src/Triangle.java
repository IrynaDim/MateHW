public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int hypotenuse;

    public Triangle(String color, int sideA, int sideB, int hypotenuse) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotenuse = hypotenuse;
    }

    public String getColor(String color) {
        return color;
    }

    public int getArea(int sideA, int sideB) {
        return (sideA * sideB) / 2;
    }

    public int hypotenuse(int a, int b, int c) {
        return Math.max(c, Math.max(a, b));
    }

    public String draw() {
        return "Треугольник, " + "площадь: " + getArea(sideA, sideB) + " кв.ед., " +
                "гипотенуза: " + hypotenuse(sideA, sideB, hypotenuse) + " ед., " + "цвет: " + getColor(color);
    }
}

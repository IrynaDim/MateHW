public class Square extends Figure {
    private int sideA;

    public Square(String color, int sideA) {
        this.color = color;
        this.sideA = sideA;
    }

    public String getColor(String color) {
        return color;
    }

    public int getArea(int sideA) {
        return sideA * sideA;
    }

    public int getSide() {
        return sideA;
    }

    public String draw() {
        return "Квадрат, " + "площадь: " + getArea(sideA) + " кв.ед., " +
                "строна: " + getSide() + " ед., " + "цвет: " + getColor(color);
    }
}

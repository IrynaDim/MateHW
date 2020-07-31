public class Trapezoid extends Figure {
    private int baseSideA;
    private int baseSideB;
    private int sideC;
    private int sideD;

    public Trapezoid(String color, int baseSideA, int baseSideB, int sideC, int sideD) {
        this.color = color;
        this.baseSideA = baseSideA;
        this.baseSideB = baseSideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public String getColor(String color) {
        return color;
    }

    public int getArea(int baseSideA, int baseSideB, int sideC, int sideD) {
        int firsPartOfFormula = ((sideC * sideC - sideD * sideD /
                (baseSideB - baseSideA)) + baseSideB - baseSideA);
        int high = (int) (sideC * sideC - 0.25 * firsPartOfFormula * firsPartOfFormula);
        return ((baseSideA + baseSideB) * high) / 2;
    }

    public String draw() {
        return "Трапеция, " + "площадь: " + getArea(baseSideA, baseSideB, sideC, sideD) + " кв.ед., " +
                "цвет: " + getColor(color);
    }
}

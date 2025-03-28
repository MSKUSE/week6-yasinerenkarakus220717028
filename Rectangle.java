import javax.swing.plaf.PanelUI;

public class Rectangle {

    private Point topLeft;
    private int sideA , sideB;

    public static int counter = 0;
    public int counterForObject = 0;
    public Rectangle(Point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
        counter++;
        counterForObject++;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            throw new IllegalArgumentException("Side Cant be negative");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            throw new IllegalArgumentException("Side Cant be negative");
        } else {
            this.sideB = sideB;
        }
    }
    public int perimeter(){
        return 2 * (sideA + sideB);
    }
    public int area(){
        return sideA * sideB;
    }
}

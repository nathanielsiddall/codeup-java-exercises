package shapes;

public class Square extends Rectangle{


    double getArea(double side) {
        return 4 * side;
    }


    double getPerimeter(double side) {
        return side * side;
    }

    public Square(double side) {
        super(side, side);

    }
}

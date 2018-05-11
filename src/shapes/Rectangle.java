package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea(){
        return this.length * this.width;
    }
    double getPerimeter(){
        return 2 * this.length + 2* this.width;
    }



}

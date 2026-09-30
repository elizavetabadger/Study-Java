public class Rectangle {

    double length, width;

    public Rectangle(double length, double width) {
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else
            System.out.println("ААААААААотрицательные длины сторон недопустимы!");
    }

    public double calcPerimeter() {
        return 2 * (length + width);
    }

    public double calcArea() {
        return length * width;
    }
}

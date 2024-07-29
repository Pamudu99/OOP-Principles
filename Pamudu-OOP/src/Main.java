public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(5);
        rectangle.getArea();
        rectangle.getPerimeter();

        Circle circle = new Circle();
        circle.setR(7);
        circle.getArea();
        circle.getPerimeter();

        Triangle triangle = new Triangle();
        triangle.setHeight(10);
        triangle.setBaseLength(8);
        triangle.getArea();
        triangle.getPerimeter();

    }
}
public class Triangle extends Shape{
    private double baseLength;
    private double height;

    public Triangle(){

    }

    public Triangle(double baseLength , double height){
        this.baseLength = baseLength;
        this.height = height;

    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void getArea() {
        double baseLength = getBaseLength();
        double height = getHeight();
        double area = 0.5 * baseLength * height;
        System.out.println("Area : " + area);
    }

    @Override
    public void getPerimeter() {
        double baseLength = getBaseLength();
        double height = getHeight();
        double perimeter = baseLength * 3;
        System.out.println("Perimeter : " + perimeter);
    }
}

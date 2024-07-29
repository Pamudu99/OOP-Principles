public class Circle extends Shape {

    private double r;

    public Circle(){

    }

    public Circle(int r){
        this.r = r;

    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void getArea() {
        double r = getR();
        double area = 3.14 * (r * r);
        System.out.println("Area : " + area);
    }

    @Override
    public void getPerimeter() {
        double r = getR();
        double perimeter = 2 * 3.14 * r;
        System.out.println("Perimeter : " + perimeter);
    }
}
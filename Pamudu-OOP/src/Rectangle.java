public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(){

    }

    public Rectangle(int a , int b){
        this.length = a;
        this.width = b;

    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    @Override
    public void getArea(){
        int length = getLength();
        int width = getWidth();
        int area = length * width;
        System.out.println("Area : " + area);
    }

    @Override
    public void getPerimeter() {
        int length = getLength();
        int width = getWidth();
        int perimeter = ((length * 2) + (width * 2));
        System.out.println("Perimeter : " + perimeter);
    }
}


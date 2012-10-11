//Understands calculations using the dimensions of a rectangle
public class Rectangle {

    private  int height;
    private  int length;

    public Rectangle(int height, int length){
        this.height = height;
        this.length = length;

    }

    public int calculateArea() {
        return height * length;
    }

    public int calculatePerimeter() {
        return 2 * (height +length);
    }
}

//Understands four straight sides with right angles
public class Rectangle {

    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int area() {
        return height * length;
    }

    public int perimeter() {
        return 2 * (height + length);
    }

    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

//Ensures the Rectangle class calculates measurements accurately
public class RectangleTest {
    @Test
    public void shouldReturnAreaOfSixByFourRectangle() {
        Rectangle rectangle = new Rectangle(6,4);
        assertThat(rectangle.area(), is(24));
    }

    @Test
    public void shouldReturnAreaOfSixByFiveRectangle() {
        Rectangle rectangle = new Rectangle(6,5);
        Assert.assertThat(rectangle.area(), is(30));
    }

    @Test
    public void shouldReturnPerimeterOfFiveByFourRectangle() {
        Rectangle rectangle = new Rectangle(5,4);
        Assert.assertThat(rectangle.perimeter(), is(18));

    }

    @Test
    public void shouldReturnPerimeterOfTenByFourRectangle() {
        Rectangle rectangle = new Rectangle(10,4);
        Assert.assertThat(rectangle.perimeter(), is(28));

    }

    @Test
    public void verifiesAreaOfASquare() {
        Rectangle square = Rectangle.createSquare(2);
        Assert.assertThat(square.area(), is(4));
    }

    @Test
    public void verifiesPerimeterOfASquare() {
        Rectangle square = Rectangle.createSquare(3);
        assertThat(square.perimeter(), is(12));
    }
}

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

//Ensures the Rectangle class calculates measurements accurately
public class RectangleTest {
    @Test
    public void shouldReturnAreaOfSixByFourRectangle() {
        Rectangle rectangle = new Rectangle(6,4);
        Assert.assertThat(rectangle.calculateArea(), is(24));
    }

    @Test
    public void shouldReturnAreaOfSixByFiveRectangle() {
        Rectangle rectangle = new Rectangle(6,5);
        Assert.assertThat(rectangle.calculateArea(), is(30));
    }

    @Test
    public void shouldReturnPerimeterOfFiveByFourRectangle() {
        Rectangle rectangle = new Rectangle(5,4);
        Assert.assertThat(rectangle.calculatePerimeter(), is(18));

    }

    @Test
    public void shouldReturnPerimeterOfTenByFourRectangle() {
        Rectangle rectangle = new Rectangle(10,4);
        Assert.assertThat(rectangle.calculatePerimeter(), is(28));

    }
}

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GraphicRectangleTest {
    @Test
    public void shouldDraw2x3Rectangle() throws Exception
    {
        Rectangle rectangle = new Rectangle(2, 3);
        GraphicRectangle graphicRectangle = new GraphicRectangle(rectangle);
        assertThat(graphicRectangle.draw("*"),is("***\n***\n"));
    }

    @Test
    public void shouldDraw4x5Rectangle() throws Exception
    {
        Rectangle rectangle = new Rectangle(4, 5);
        GraphicRectangle graphicRectangle = new GraphicRectangle(rectangle);
        assertThat(graphicRectangle.draw("*"),is("*****\n*   *\n*   *\n*****\n"));
    }


    @Test
    public void shouldDraw3x4Rectangle() throws Exception
    {
        Rectangle rectangle = new Rectangle(4, 5);
        GraphicRectangle graphicRectangle = new GraphicRectangle(rectangle);
        assertThat(graphicRectangle.draw("."),is(".....\n.   .\n.   .\n.....\n"));
    }

}

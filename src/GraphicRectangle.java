public class GraphicRectangle {

    private Rectangle rectangle;

    public GraphicRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public String draw(String symbol) {
        String result = "";
        for (int row = 0; row < rectangle.getHeight(); row++) {

            for (int column = 0; column < rectangle.getLength(); column++) {
                if (row ==0 ||row == rectangle.getHeight()-1)
//                if (column == 0 || column ==rectangle.getLength() - 1)
                    result += symbol;
                else if (column == 0 || column ==rectangle.getLength() - 1)
                    result += symbol;
                     else result += " ";
            }
            result += "\n";
        }
        return result;
    }
}

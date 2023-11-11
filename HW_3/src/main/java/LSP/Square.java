package LSP;

public class Square extends RectangleForm {
    private final int width;
    private final int height;

    public Square(int width, int height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int area() {
        return width * height;
    }
}

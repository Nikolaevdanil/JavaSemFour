package f7.bridge;

public class Pen extends SubjectForDrawing {
    public Pen(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw with a "+color.getColor()+" pen");
    }
}

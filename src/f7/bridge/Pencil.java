package f7.bridge;

public class Pencil extends SubjectForDrawing{

    public Pencil(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw with a "+color.getColor()+" pencil");
    }
}
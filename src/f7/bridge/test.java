package f7.bridge;

public class test {
    public static void main(String[] args) {
        SubjectForDrawing pen = new Pen(new RedColor());
        SubjectForDrawing pencil = new Pencil(new BlueColor());
        pen.draw();
        pencil.draw();
    }
}
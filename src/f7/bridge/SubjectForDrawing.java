package f7.bridge;

public abstract class SubjectForDrawing {
    protected Color color;
    public SubjectForDrawing(Color color){
        this.color=color;
    }
    public abstract void draw();
}
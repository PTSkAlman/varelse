package Shapes;

public class Line extends Shape{
    private Point start;
    private Point end;

    public Line(Point s, Point e) {
        this.start = s;
        this.end = e;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
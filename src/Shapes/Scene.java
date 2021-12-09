package Shapes;

import java.util.ArrayList;

public class Scene {
    ArrayList<Line> lines;
    ArrayList<Point> points;
    ArrayList<Rectangle> rectangles;

    public Scene() {
        lines = new ArrayList<>();
        points = new ArrayList<>();
        rectangles = new ArrayList<>();
    }
}
package ScreenRender;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.ArrayList;

public class ScreenRender extends Canvas {
    private int WIDTH;
    private int HEIGTH;
    private int scale;

    private BufferedImage image;
    private Screen screen;

    public ScreenRender(int width, int height, int scale) {
        // Screen data
        this.WIDTH = width;
        this.HEIGTH = height;
        this.scale = scale;
        image = new BufferedImage(WIDTH/scale, HEIGTH/scale, BufferedImage.TYPE_INT_RGB);
        screen = new Screen(((DataBufferInt) image.getRaster().getDataBuffer()).getData(),image.getWidth(),
                image.getHeight());
        setPreferredSize(new Dimension(WIDTH, HEIGTH));
    }

    public void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, WIDTH, HEIGTH, null);
        g.dispose();
        bs.show();
    }

    public Screen getScreen() {
        return screen;
    }

    public void draw(ArrayList<Shape> shapes) {
        screen.clear();
        for (Shape s : shapes) {
            screen.draw(2,2, 0xFFFFFF);
        }
    }
}
import processing.core.PApplet;

public class Processing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    Ball b1, b2, b3, b4;

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        b1 = new Ball(this,DIAMETER);
        b2 = new Ball(this,DIAMETER);
        b3 = new Ball(this,DIAMETER);
        b4 = new Ball(this,DIAMETER);
    }

    @Override
    public void draw() {
        b1.moveBall(1,1);
        b2.moveBall(2,2);
        b3.moveBall(3,3);
        b4.moveBall(4,4);
    }
}


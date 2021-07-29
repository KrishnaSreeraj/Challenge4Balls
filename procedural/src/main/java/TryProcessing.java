import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    int x = 0;
    int moveRight = 1;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        ellipse(x+moveRight*1,HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(x+moveRight*2,2 * HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(x+moveRight*3,3 * HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(x+moveRight*4,4 * HEIGHT/5, DIAMETER, DIAMETER);
        moveRight++;
    }
}

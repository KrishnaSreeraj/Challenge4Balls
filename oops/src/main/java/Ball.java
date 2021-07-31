import processing.core.PApplet;

public class Ball{
    int WIDTH;
    int HEIGHT;
    int DIAMETER;
    int x;
    int moveRight;
    private PApplet sketch;

    Ball(PApplet sketch, int diameter)
    {
        WIDTH = sketch.width;
        HEIGHT = sketch.height/5;
        DIAMETER = diameter;
        x = 0;
        moveRight = 1;
        this.sketch = sketch;
    }

    void moveBall(int speed, int pos)
    {
        sketch.ellipse(x+moveRight*speed, pos*HEIGHT, DIAMETER, DIAMETER);
        moveRight++;
    }

}

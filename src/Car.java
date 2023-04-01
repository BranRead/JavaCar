import java.awt.*;

public class Car {
    Color bodyColor;
    int height;
    int width;
    int xPos;
    int yPos;

    public Car(Color bodyColor, int height, int width, int xPos, int yPos){
        this.bodyColor = bodyColor;
        this.height = height;
        this.width = width;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void drawVehicle(Graphics g){

        //body
        g.setColor(this.bodyColor);
        g.fillRect(this.xPos, this.yPos, this.width, this.height);

        //Colour for tires, beams and window line
        g.setColor(Color.BLACK);

        //left tire
        g.fillOval(this.xPos - 40, this.height + this.yPos - 50, 100, 100);
        //right tire
        g.fillOval(this.xPos + this.width - 50, this.height + this.yPos - 50, 100, 100);


        //left and right beams
        g.fillRect((this.xPos + this.width/2) - 150, this.yPos - 75, 25, 75);
        g.fillRect((this.xPos + this.width/2) + 25, this.yPos - 75, 25, 75);
        //roof
        g.fillRect((this.xPos + this.width/2) - 150, this.yPos - 100, 200, 25);

        //window line
        g.drawLine(this.xPos + 150, this.yPos, this.xPos + 150, this.yPos -75);

        //Colour for wheel wells
        g.setColor(Color.gray);
        //left wheel well
        g.fillArc((this.xPos - 75), this.yPos - 15, 175, 250, 0, 180);
        //right wheel well
        g.fillArc((this.xPos + this.width - 75), this.yPos - 5, 150, 230, 0, 180);

        //engine
        g.setColor(new Color(22, 90, 114));
        g.fillRect(this.xPos + 275, this.yPos - 25, 100, 25);




    }
}

import javax.swing.*;
import java.awt.*;
public class DrawingBoard extends JPanel{

    protected void paintComponent(Graphics g) {
        Car myCar = new Car(new Color(37, 150, 190), 100, 400, 200, 200);
        myCar.drawVehicle(g);
    }
}

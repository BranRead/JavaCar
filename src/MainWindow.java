import javax.swing.*;
import java.awt.*;
public class MainWindow extends JFrame{

    public MainWindow() {
        //Windows Properties
        this.setBounds(500, 200, 800, 600);
        this.setTitle("Look at my beautiful car!");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingBoard drawing = new DrawingBoard();
        drawing.setBackground(Color.darkGray);
        this.add(drawing);
    }
}

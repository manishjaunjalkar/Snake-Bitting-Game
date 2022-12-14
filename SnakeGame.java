import javax.swing.*;
import java.awt.*;

public class SnakeGame {
    JFrame frame;
    SnakeGame(){
        frame = new JFrame();
        Mypanel panel = new Mypanel();
        panel.setBackground(Color.gray);
        frame.setBounds(10,10,905,700);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        SnakeGame sg = new SnakeGame();
    }
}

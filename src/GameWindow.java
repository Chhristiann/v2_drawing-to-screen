import java.awt.*;
import javax.swing.*;

public class GameWindow extends JFrame{
    private Panel panel;

    GameWindow(){
        panel = new Panel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

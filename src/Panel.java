import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Image gameBoard;
    Image image_X;
    public int[] centerlines;// middle of each column/row for chess 8x8
    public int[][] coordinates;// all possible moves for pieces

    Panel(){// contain ALL images to be rendered in constructor or else an error occurs
        gameBoard = new ImageIcon("images/chess_board.png").getImage();
        image_X = new ImageIcon("images/x.png").getImage();
        this.setPreferredSize(new Dimension(gameBoard.getWidth(null), gameBoard.getHeight(null)));

        centerlines = new int[]{64, 192, 320, 448, 576, 704, 832, 960};
        coordinates = new int[centerlines.length][centerlines.length];
    }

    // - - - [Class level methods
    private void fillCoordinates(){
        for(int row = 0; row < centerlines.length; row++){
            for(int column = 0; column < centerlines.length; column++){
                coordinates[row][column] = centerlines[column];
            }
        }
    }

    public void paint(Graphics g){
        Graphics2D q = (Graphics2D) g;

        q.drawImage(gameBoard, 0, 0, null);

        // Code needed to understand how to get to each tile piece via 2D array.
//        q.setStroke(new BasicStroke(5));
//        q.setPaint(Color.ORANGE);
//        q.drawLine(0, 64, gameBoard.getWidth(null), 64);
//        q.drawLine(0, 64+128, gameBoard.getWidth(null), 64+128);

//        centerlines = new int[]{64, 192, 320, 448, 576, 704, 832, 960};

//        for(int y : coords){
//            q.drawLine(0, y, gameBoard.getWidth(null), y);
//        }
//
//        for(int x : coords){
//            q.drawLine(x, 0, x, gameBoard.getWidth(null));
//        }

        for(int row = 0; row < centerlines.length; row++){
            for(int column = 0; column < centerlines.length; column++){
                q.drawImage(image_X, centerlines[row]-25, centerlines[column]-25, 50, 50 ,this);
            }
        }
    }
}

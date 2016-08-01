package sharabiani.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ali Sharabiani on 2016-08-01.
 */
public class MainView extends JFrame {

    /**
     * Size of the main window.
     */
    private static final int WINDOW_SIZE = 400;

    /**
     * Constructor.
     * Creates a new instance of {@link MainView}.
     */
    public MainView()
    {
        setTitle("SUDOKU");
        setSize(WINDOW_SIZE, WINDOW_SIZE);
        setLocationRelativeTo(null);

    }

    /**
     * Shows the windows.
     */
    public void showWindow(int[][] model, final int size)
    {
        drawBoard(model, size);
        setVisible(true);
    }

    /**
     * Closes the window.
     */
    public void closeWindow() {
        setVisible(false);
    }

    private void drawBoard(int[][] model, int size) {
        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(size, size);
        panel.setLayout(gridLayout);

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                JLabel label = new JLabel();
                label.setText(Integer.toString(model[i][j]));
                label.setBorder(BorderFactory.createLineBorder(Color.black));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setVerticalAlignment(SwingConstants.CENTER);
                panel.add(label);
            }
        }

        // add the panel to the JFrame.
        add(panel);
    }
}

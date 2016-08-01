package sharabiani.view;
import sharabiani.model.Sudoku;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ali Sharabiani on 2016-08-01.
 */
public class MainWindow extends JFrame {

    /**
     * Constructor.
     * Creates a new instance of {@link MainWindow}.
     */
    public MainWindow()
    {
        setTitle("SUDOKU");
        setSize(400, 400);
        setLocationRelativeTo(null);
    }

    /**
     * Shows the windows.
     */
    public void showWindow()
    {
        setVisible(true);
    }

    /**
     * Closes the window.
     */
    public void closeWindow() {
        setVisible(false);
    }

    private void drawBoard() {
        GridLayout grid = new GridLayout(Sudoku.BOARD_SIZE, Sudoku.BOARD_SIZE);
    }
}

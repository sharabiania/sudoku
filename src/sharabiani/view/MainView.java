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

        GridLayout gridLayout = new GridLayout(size / 3, size / 3);

        panel.setLayout(gridLayout);

        JPanel box1 = new JPanel();
        JPanel box2 = new JPanel();
        JPanel box3 = new JPanel();
        JPanel box4 = new JPanel();
        JPanel box5 = new JPanel();
        JPanel box6 = new JPanel();
        JPanel box7 = new JPanel();
        JPanel box8 = new JPanel();
        JPanel box9 = new JPanel();

        box1.setLayout(gridLayout);
        box2.setLayout(gridLayout);
        box3.setLayout(gridLayout);
        box4.setLayout(gridLayout);
        box5.setLayout(gridLayout);
        box6.setLayout(gridLayout);
        box7.setLayout(gridLayout);
        box8.setLayout(gridLayout);
        box9.setLayout(gridLayout);

        panel.add(box1);
        panel.add(box2);
        panel.add(box3);
        panel.add(box4);
        panel.add(box5);
        panel.add(box6);
        panel.add(box7);
        panel.add(box8);
        panel.add(box9);

        box1.setBorder(BorderFactory.createDashedBorder(null));
        box2.setBorder(BorderFactory.createDashedBorder(null));
        box3.setBorder(BorderFactory.createDashedBorder(null));
        box4.setBorder(BorderFactory.createDashedBorder(null));
        box5.setBorder(BorderFactory.createDashedBorder(null));
        box6.setBorder(BorderFactory.createDashedBorder(null));
        box7.setBorder(BorderFactory.createDashedBorder(null));
        box8.setBorder(BorderFactory.createDashedBorder(null));
        box9.setBorder(BorderFactory.createDashedBorder(null));

        panel.setBorder(BorderFactory.createLineBorder(Color.black));


        for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (model[i][j] != 0) {
                        JLabel label = new JLabel();
                        label.setText(Integer.toString(model[i][j]));
                        label.setBorder(BorderFactory.createDashedBorder(null));
                        label.setOpaque(true);
                        label.setBackground(Color.gray);
                        label.setHorizontalAlignment(SwingConstants.CENTER);
                        label.setVerticalAlignment(SwingConstants.CENTER);
                        if(j < 3) {
                            if (i < 3)
                                box1.add(label);
                            else if (i >= 3 && i < 6)
                                box2.add(label);
                            else if (i >= 6)
                                box3.add(label);
                        }
                        else if(j >=3 && j < 6) {
                            if (i < 3)
                                box4.add(label);
                            else if (i >= 3 && i < 6)
                                box5.add(label);
                            else if (i >= 6)
                                box6.add(label);
                        }
                        else{
                            if (i < 3)
                                box7.add(label);
                            else if (i >= 3 && i < 6)
                                box8.add(label);
                            else if (i >= 6)
                                box9.add(label);
                        }
                    } else {
                        JTextField textField = new JTextField(1);
                        textField.setHorizontalAlignment(SwingConstants.CENTER);
                        textField.setBorder(BorderFactory.createDashedBorder(null));
                        textField.setBackground(Color.white);
                        if(j < 3) {
                            if (i < 3)
                                box1.add(textField);
                            else if (i >= 3 && i < 6)
                                box2.add(textField);
                            else if (i >= 6)
                                box3.add(textField);
                        }
                        else if(j >=3 && j < 6) {
                            if (i < 3)
                                box4.add(textField);
                            else if (i >= 3 && i < 6)
                                box5.add(textField);
                            else if (i >= 6)
                                box6.add(textField);
                        }
                        else{
                            if (i < 3)
                                box7.add(textField);
                            else if (i >= 3 && i < 6)
                                box8.add(textField);
                            else if (i >= 6)
                                box9.add(textField);
                        }
                    }
                }
            }

        // add the panel to the JFrame.
        add(panel);
    }
}

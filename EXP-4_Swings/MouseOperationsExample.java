/*
Develop a simple swing program for illustrating mouse operations such as mouse down, 
up double click , single click with help of a button.
*/


package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseOperationsExample extends JFrame {
    private JLabel messageLabel;

    public MouseOperationsExample() {
        // Set up the frame
        setTitle("Mouse Operations Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a label to display mouse event messages
        messageLabel = new JLabel("Mouse Events will be displayed here");
        add(messageLabel);

        // Create a button to perform mouse operations
        JButton mouseButton = new JButton("Click Me");
        add(mouseButton);

        // Add mouse listener to the button to capture mouse events
        mouseButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                messageLabel.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                messageLabel.setText("Mouse Released");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    messageLabel.setText("Mouse Single Clicked");
                } else if (e.getClickCount() == 2) {
                    messageLabel.setText("Mouse Double Clicked");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Create the frame and make it visible
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MouseOperationsExample frame = new MouseOperationsExample();
                frame.setVisible(true);
            }
        });
    }
}

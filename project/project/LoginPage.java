import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Pet Partner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);

        // Center the buttonPanel horizontally
        frame.add(Box.createHorizontalStrut(40));

        // Use BorderLayout as the main layout manager
        frame.setLayout(new BorderLayout());

        frame.add(Box.createVerticalStrut(20));
        JLabel label = new JLabel("Welcome to Pet Partner!");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Create a new Font with a larger size
        Font labelFont = label.getFont();
        label.setFont(new Font(labelFont.getName(), labelFont.getStyle(), 30)); // 24 is the new font size
        label.add(Box.createVerticalStrut(50));
        frame.add(label, BorderLayout.NORTH);
        frame.add(Box.createVerticalStrut(40));

        JPanel buttonPanel = new JPanel();
        // Use BoxLayout for the button panel with a vertical alignment
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));
        placeComponents(buttonPanel);

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(10, 10, 10, 10);

        JButton userLoginButton = new JButton("User Login");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(userLoginButton, constraints);

        JButton caretakerLoginButton = new JButton("Caretaker Login");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(caretakerLoginButton, constraints);

        JButton exitButton = new JButton("Exit");
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(exitButton, constraints);

        userLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("User Login button clicked");
            }
        });

        caretakerLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Caretaker Login button clicked");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
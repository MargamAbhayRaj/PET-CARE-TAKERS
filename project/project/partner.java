import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginPage extends JFrame implements ActionListener {

    // Components for the login page
    private JLabel userLabel;
    private JTextField userField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton exitButton;

    public LoginPage() {
        // Create and set up the window
        setTitle("Login to Pet Partnee");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        userLabel = new JLabel("Username:");
        userField = new JTextField(10);
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(10);
        loginButton = new JButton("Login");
        exitButton = new JButton("Exit");

        // Add action listeners
        loginButton.addActionListener(this);
        exitButton.addActionListener(this);

        // Create panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(exitButton);

        // Add panel to frame
        add(panel);

        // Display the window
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Check which button was clicked
        if (e.getSource() == loginButton) {
            // Check username and password
            if (userField.getText().equals("test") && new String(passwordField.getPassword()).equals("password")) {
                // If successful, open the next window
                JOptionPane.showMessageDialog(this, "Login successful");
            } else {
                // If unsuccessful, display an error message
                JOptionPane.showMessageDialog(this, "Incorrect username or password");
            }
        } else if (e.getSource() == exitButton) {
            // If the user clicked the exit button, close the application
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        // Create and display the login page
        new LoginPage();
    }
}
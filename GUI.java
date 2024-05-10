import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Online Banking System");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null); // Center the frame

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            JLabel welcomeLabel = new JLabel("WELCOME !");
            panel.add(welcomeLabel);

            JButton withdrawButton = new JButton("Withdraw");
            panel.add(withdrawButton);

            JButton creditButton = new JButton("Credit");
            panel.add(creditButton);

            JButton checkBalanceButton = new JButton("Check Balance");
            panel.add(checkBalanceButton);

            JButton transferButton = new JButton("Transfer");
            panel.add(transferButton);

            JButton exitButton = new JButton("Exit");
            panel.add(exitButton);

            frame.setVisible(true);

            withdrawButton.addActionListener(e -> {
                // Add action for withdraw button
            });

            creditButton.addActionListener(e -> {
                // Add action for credit button
            });

            checkBalanceButton.addActionListener(e -> {
                // Add action for check balance button
            });

            transferButton.addActionListener(e -> {
                // Add action for transfer button
            });

            exitButton.addActionListener(e -> {
                // Add action for exit button
                frame.dispose(); // Close the frame
            });
        });
    }
}
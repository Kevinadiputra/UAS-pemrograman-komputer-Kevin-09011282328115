import javax.swing.*;

public class Soal2 {
    private static String regisUser;
    private static String regisPass;

    public static void main(String[] args) {
        // Membuat frame untuk GUI
        JFrame frame = new JFrame("Login & Register Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Panel untuk mendaftarkan akun
        JPanel regisPanel = new JPanel();
        JTextField regisUserField = new JTextField(15);
        JPasswordField regisPassField = new JPasswordField(15);

        regisPanel.add(new JLabel("Username:"));
        regisPanel.add(regisUserField);
        regisPanel.add(new JLabel("Password:"));
        regisPanel.add(regisPassField);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(e -> {
            regisUser = regisUserField.getText();
            regisPass = new String(regisPassField.getPassword());
            JOptionPane.showMessageDialog(null, "Pendaftaran berhasil!");
        });

        // Panel untuk login
        JPanel loginPanel = new JPanel();
        JTextField loginUsernameField = new JTextField(15);
        JPasswordField loginPasswordField = new JPasswordField(15);

        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(loginUsernameField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(loginPasswordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            String usernameInput = loginUsernameField.getText();
            String passwordInput = new String(loginPasswordField.getPassword());

            // Memeriksa kecocokan username dan password
            if (usernameInput.equals(regisUser) && passwordInput.equals(regisPass)) {
                JOptionPane.showMessageDialog(null, "Login Berhasil");
            } else {
                JOptionPane.showMessageDialog(null, "Login Gagal");
            }
        });

        // Menambahkan komponen ke frame
        frame.add(regisPanel);
        frame.add(registerButton);
        frame.add(loginPanel);
        frame.add(loginButton);

        // Menampilkan frame
        frame.setVisible(true);
    }
}

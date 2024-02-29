import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderGUI extends JFrame {
    private JTextField nameField;
    private JTextField ageField;
    private JComboBox<String> sexField;
    private JButton confirmButton;

    public OrderGUI() {
        setTitle("Order Information");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        add(nameLabel);
        add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        add(ageLabel);
        add(ageField);

        JLabel sexLabel = new JLabel("Sex:");
        sexField = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        add(sexLabel);
        add(sexField);

        confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String sex = (String) sexField.getSelectedItem();

                if (name.isEmpty() || age.isEmpty() || sex.isEmpty()) {
                    JOptionPane.showMessageDialog(OrderGUI.this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(OrderGUI.this, "Name: " + name + "\nAge: " + age + "\nSex: " + sex, "Order Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        add(confirmButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OrderGUI();
            }
        });
    }
}
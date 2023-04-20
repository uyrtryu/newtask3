import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {

    private JTextField name_field;
    private JLabel name;
    private JLabel extention;
    private JTextField extention_field;

    public Gui() {
        super("Контактная форма");
        super.setBounds(200, 100, 300, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 5, 5, 5));

        name = new JLabel("Введите адрес:");
        name_field = new JTextField("", 1);
        extention = new JLabel("Введите искомое расширение:");
        extention_field = new JTextField("", 1);

        container.add(name);
        container.add(name_field);
        container.add(extention);
        container.add(extention_field);


        JButton send_button = new JButton("Решение");

        container.add(send_button);

        send_button.addActionListener(new Activo());


    }

    class Activo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String extention = extention_field.getText();
            String arrayAnsver = String.join("\n", Activ.activ(name, extention));


            JOptionPane.showMessageDialog(null, arrayAnsver, "Решение", JOptionPane.PLAIN_MESSAGE);

        }

    }
}

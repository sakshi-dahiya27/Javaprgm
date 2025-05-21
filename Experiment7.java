import java.awt.*;
import java.awt.event.*;

public class Experiment7 {
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args) {
        Frame f = new Frame("Divider");
        TextField t1 = new TextField(5);
        TextField t2 = new TextField(5);
        Label result = new Label("Result:");
        Button b = new Button("Divide");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int r = a / b;
                    result.setText("Result: " + r);
                } catch (ArithmeticException ex) {
                    result.setText("Cannot divide by zero!");
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input!");
                }
            }
        });

        f.setLayout(new FlowLayout());
        f.add(t1); f.add(t2); f.add(b); f.add(result);
        f.setSize(250, 150);
        f.setVisible(true);
    }
}
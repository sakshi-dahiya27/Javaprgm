import java.awt.*;

public class Experiment6 {
    public static void main(String[] args) {
        Frame f = new Frame("Library System");
        Label l1 = new Label("Book Name:");
        TextField t1 = new TextField();
        Button b1 = new Button("Submit");

        f.setLayout(new FlowLayout());
        f.add(l1); f.add(t1); f.add(b1);

        f.setSize(300, 150);
        f.setVisible(true);
    }
}
import javax.swing.*;

public class Example {
    JFrame a;
    Example() {
        a = new JFrame("example");
        String courses[] = {"core java", "advance java", "java servlet"};
        JComboBox c = new JComboBox(courses);
        c.setBounds(40, 40, 90, 20);
        a.add(c);
        a.setSize(400, 400);
        a.setLayout(null);
        a.setVisible(true);
    }
}

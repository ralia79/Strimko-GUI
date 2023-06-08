import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonNumberListener5 implements ActionListener {

    private GameButton myButton;
    private GameFrame frame;

    JPopupMenu menu;

    public ButtonNumberListener5(GameButton clicker, GameFrame fr) {
        myButton = clicker;
        frame = fr;

        // create a popup menu
        menu = new JPopupMenu("Menu");
        NumberChangeListener num = new NumberChangeListener(myButton, frame);

        JMenuItem one = new JMenuItem("One");
        menu.add(one);
        one.addActionListener(num);

        JMenuItem two = new JMenuItem("Two");
        menu.add(two);
        two.addActionListener(num);

        JMenuItem three = new JMenuItem("Three");
        menu.add(three);
        three.addActionListener(num);

        JMenuItem four = new JMenuItem("Four");
        menu.add(four);
        four.addActionListener(num);

        JMenuItem five = new JMenuItem("Five");
        menu.add(five);
        five.addActionListener(num);

        menu.add(new JMenuItem("Never Mind"));
    }

    public void actionPerformed(ActionEvent e) {

        menu.show(myButton, myButton.getWidth() / 2, myButton.getHeight() / 2);
    }
}


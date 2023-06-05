import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    private JLabel message;
    private int buttonCount;
    private GameButton[] buttons;

    public void init1() {

        // Exit when window in closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container ct = getContentPane();

        int[] streamPosition = {1, 1, 2, 1, 2, 3, 2, 3, 3};
        Strimko game = new Strimko(3, 3, streamPosition);

        ct.setLayout(new GridLayout(game.getGrid().length + 1, game.getGrid()[1].length));

        buttonCount = 9;
        buttons = new StrimkoButton[buttonCount];

        for (int i = 0; i < game.getGrid().length; i++) {
            for (int j = 0; j < game.getGrid()[1].length; j++) {

                GameButton jb = new StrimkoButton((Strimkospot) game.getSpot(i, j));
                buttons[i + game.getGrid().length * j] = jb;
                ButtonNumberListener3 nc = new ButtonNumberListener3(jb, game, this);
                ct.add(jb);
                jb.addActionListener(nc);

            }
        }

        message = new JLabel("You are playing Strimko");
        ct.add(message);

        JPanel controlRow = new JPanel();
        ct.add(controlRow);

        JButton checkPuzzle = new JButton("Check");
        controlRow.add(checkPuzzle);
        checkPuzzle.addActionListener(new CheckListener(game, this));

        JButton solvePuzzle = new JButton("Give up?");
        controlRow.add(solvePuzzle);

        Solver solve = new Solver(game, this, 1);
        solvePuzzle.addActionListener(solve);

        JButton s = new JButton("Switch");
        controlRow.add(s);
        s.addActionListener(new NewLook(this));

        JButton rb = new JButton("Reset");
        controlRow.add(rb);
        rb.addActionListener(new SwitchListener(this, 1));

    }

    public void init2() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container ct = getContentPane();

        int[] streamPosition = {1, 2, 3, 4, 2, 1, 3, 4,
                2, 3, 1, 4, 3, 2, 1, 4};
        Strimko game = new Strimko(4, 4, streamPosition);

        ct.setLayout(new GridLayout(game.getGrid().length + 1, game.getGrid()[1].length));

        buttonCount = 16;
        buttons = new StrimkoButton[buttonCount];

        for (int i = 0; i < game.getGrid().length; i++) {
            for (int j = 0; j < game.getGrid()[1].length; j++) {

                GameButton jb = new StrimkoButton((Strimkospot) game.getSpot(i, j));
                buttons[i + game.getGrid().length * j] = jb;
                ButtonNumberListener4 nc = new ButtonNumberListener4(jb, game, this);
                ct.add(jb);
                jb.addActionListener(nc);

            }
        }

        message = new JLabel("You are playing Strimko");
        ct.add(message);

        JPanel controlRow = new JPanel();
        ct.add(controlRow);

        JButton checkPuzzle = new JButton("Check");
        controlRow.add(checkPuzzle);
        checkPuzzle.addActionListener(new CheckListener(game, this));

        JButton solvePuzzle = new JButton("Give up?");
        controlRow.add(solvePuzzle);

        Solver solve = new Solver(game, this, 1);
        solvePuzzle.addActionListener(solve);

        JButton s = new JButton("Switch");
        controlRow.add(s);
        s.addActionListener(new NewLook(this));

        JButton rb = new JButton("Reset");
        controlRow.add(rb);
        rb.addActionListener(new SwitchListener(this, 2));
    }

    public void init3() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container ct = getContentPane();

        int[] streamPosition = {1, 1, 1, 2, 3, 4, 1, 2, 3, 6, 4, 1,
                2, 3, 6, 4, 2, 3, 2, 6, 4, 4, 3, 6, 6};
        Strimko game = new Strimko(5, 5, streamPosition);

        ct.setLayout(new GridLayout(game.getGrid().length + 1, game.getGrid()[1].length));

        buttonCount = 25;
        buttons = new StrimkoButton[buttonCount];

        for (int i = 0; i < game.getGrid().length; i++) {
            for (int j = 0; j < game.getGrid()[1].length; j++) {

                GameButton jb = new StrimkoButton((Strimkospot) game.getSpot(i, j));
                buttons[i + game.getGrid().length * j] = jb;
                ButtonNumberListener5 nc = new ButtonNumberListener5(jb, game, this);
                ct.add(jb);
                jb.addActionListener(nc);

            }
        }

        message = new JLabel("You are playing Strimko");
        ct.add(message);

        JPanel controlRow = new JPanel();
        ct.add(controlRow);

        JButton checkPuzzle = new JButton("Check");
        controlRow.add(checkPuzzle);
        checkPuzzle.addActionListener(new CheckListener(game, this));

        JButton solvePuzzle = new JButton("Give up?");
        controlRow.add(solvePuzzle);

        Solver solve = new Solver(game, this, 1);
        solvePuzzle.addActionListener(solve);

        JButton s = new JButton("Switch");
        controlRow.add(s);
        s.addActionListener(new NewLook(this));

        JButton rb = new JButton("Reset");
        controlRow.add(rb);
        rb.addActionListener(new SwitchListener(this, 3));
    }

    public void init4() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container ct = getContentPane();

        int[] streamPosition = {1, 1, 1, 2, 3, 3, 4, 1, 2, 1, 3, 3, 4,
                                4, 1, 2, 3, 3, 4, 4, 5, 2, 6, 6, 4, 5,
                                2, 5, 6, 6, 5, 5, 5, 2, 6, 6,};
        Strimko game = new Strimko(6, 6, streamPosition);

        ct.setLayout(new GridLayout(game.getGrid().length + 1, game.getGrid()[1].length));

        buttonCount = 36;
        buttons = new StrimkoButton[buttonCount];

        for (int i = 0; i < game.getGrid().length; i++) {
            for (int j = 0; j < game.getGrid()[1].length; j++) {

                GameButton jb = new StrimkoButton((Strimkospot) game.getSpot(i, j));
                buttons[i + game.getGrid().length * j] = jb;
                ButtonNumberListener6 nc = new ButtonNumberListener6(jb, game, this);
                ct.add(jb);
                jb.addActionListener(nc);

            }
        }

        message = new JLabel("You are playing Strimko");
        ct.add(message);

        JPanel controlRow = new JPanel();
        ct.add(controlRow);

        JButton checkPuzzle = new JButton("Check");
        controlRow.add(checkPuzzle);
        checkPuzzle.addActionListener(new CheckListener(game, this));

        JButton solvePuzzle = new JButton("Give up?");
        controlRow.add(solvePuzzle);

        Solver solve = new Solver(game, this, 1);
        solvePuzzle.addActionListener(solve);

        JButton s = new JButton("Switch");
        controlRow.add(s);
        s.addActionListener(new NewLook(this));

        JButton rb = new JButton("Reset");
        controlRow.add(rb);
        rb.addActionListener(new SwitchListener(this, 4));

    }

    public void init5() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container ct = getContentPane();

        int[] streamPosition = {1, 1, 1, 3, 4, 4, 4, 1, 2, 3, 1, 7, 4, 7, 2, 1, 3, 1, 7, 4, 7,
                3, 2, 2, 3, 7, 4, 7, 2, 3, 3, 5, 6, 7, 4, 5, 2, 2, 5, 5, 6, 6,
                5, 5, 5, 6, 6, 6, 6};
        Strimko game = new Strimko(7, 7, streamPosition);

        ct.setLayout(new GridLayout(game.getGrid().length + 1, game.getGrid()[1].length));

        buttonCount = 49;
        buttons = new StrimkoButton[buttonCount];

        for (int i = 0; i < game.getGrid().length; i++) {
            for (int j = 0; j < game.getGrid()[1].length; j++) {

                GameButton jb = new StrimkoButton((Strimkospot) game.getSpot(i, j));
                buttons[i + game.getGrid().length * j] = jb;
                ButtonNumberListener7 nc = new ButtonNumberListener7(jb, game, this);
                ct.add(jb);
                jb.addActionListener(nc);

            }
        }

        message = new JLabel("You are playing Strimko");
        ct.add(message);

        JPanel controlRow = new JPanel();
        ct.add(controlRow);

        JButton checkPuzzle = new JButton("Check");
        controlRow.add(checkPuzzle);
        checkPuzzle.addActionListener(new CheckListener(game, this));

        JButton solvePuzzle = new JButton("Give up?");
        controlRow.add(solvePuzzle);

        Solver solve = new Solver(game, this, 1);
        solvePuzzle.addActionListener(solve);

        JButton s = new JButton("Switch");
        controlRow.add(s);
        s.addActionListener(new NewLook(this));

        JButton rb = new JButton("Reset");
        controlRow.add(rb);
        rb.addActionListener(new SwitchListener(this, 5));

    }


    public void init0() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();

        contentPane.setLayout(new GridLayout(1, 5));

        JButton change1 = new JButton("Strimko 3 * 3");
        contentPane.add(change1);
        change1.addActionListener(new SwitchListener(this, 1));

        JButton change2 = new JButton("Strimlo 4 * 4");
        contentPane.add(change2);
        change2.addActionListener(new SwitchListener(this, 2));

        JButton change3 = new JButton("Strimko 5 * 5");
        contentPane.add(change3);
        change3.addActionListener(new SwitchListener(this, 3));

        JButton change4 = new JButton("Strimko 6 * 6");
        contentPane.add(change4);
        change4.addActionListener(new SwitchListener(this, 4));

        JButton change5 = new JButton("Strimko 7 * 7");
        contentPane.add(change5);
        change5.addActionListener(new SwitchListener(this, 5));


    }

    public void setMessage(String message1) {
        message.setText(message1);

        for (GameButton b : buttons) {
            b.setEnabled(false);
        }
    }

    public void setTempMessage(String message2) {
        message.setText(message2);
    }
}

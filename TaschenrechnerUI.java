import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenrechnerUI extends JFrame implements ActionListener {


    private JTextField display;
    private JButton[] nummerKnoepfe = new JButton[10];
    private JButton plusKnopf, minusKnopf, malKnopf, geteiltKnopf, gleichKnopf, clearKnopf, verdoppelKnopf;

    private double zahl1 = 0, zahl2 = 0, ergebnis = 0;
    private String operation = "";

  
    public TaschenrechnerUI() {

        setTitle("Mein Uni-Taschenrechner");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);


        JPanel tastaturFeld = new JPanel();
        tastaturFeld.setLayout(new GridLayout(4, 4, 10, 10));


        plusKnopf = new JButton("+");
        minusKnopf = new JButton("-");
        malKnopf = new JButton("*");
        geteiltKnopf = new JButton("/");
        gleichKnopf = new JButton("=");
        clearKnopf = new JButton("C");
        verdoppelKnopf = new JButton("v");


        for (int i = 0; i < 10; i++) {
            nummerKnoepfe[i] = new JButton(String.valueOf(i));
            nummerKnoepfe[i].addActionListener(this);
            nummerKnoepfe[i].setFont(new Font("Arial", Font.BOLD, 20));
        }


        plusKnopf.addActionListener(this);
        minusKnopf.addActionListener(this);
        malKnopf.addActionListener(this);
        geteiltKnopf.addActionListener(this);
        gleichKnopf.addActionListener(this);
        clearKnopf.addActionListener(this);
        verdoppelKnopf.addActionListener(this);


        tastaturFeld.add(nummerKnoepfe[1]); tastaturFeld.add(nummerKnoepfe[2]); tastaturFeld.add(nummerKnoepfe[3]); tastaturFeld.add(plusKnopf);
        tastaturFeld.add(nummerKnoepfe[4]); tastaturFeld.add(nummerKnoepfe[5]); tastaturFeld.add(nummerKnoepfe[6]); tastaturFeld.add(minusKnopf);
        tastaturFeld.add(nummerKnoepfe[7]); tastaturFeld.add(nummerKnoepfe[8]); tastaturFeld.add(nummerKnoepfe[9]); tastaturFeld.add(malKnopf);
        tastaturFeld.add(clearKnopf);       tastaturFeld.add(nummerKnoepfe[0]); tastaturFeld.add(verdoppelKnopf); tastaturFeld.add(geteiltKnopf);

        add(tastaturFeld, BorderLayout.CENTER);


        gleichKnopf.setFont(new Font("Arial", Font.BOLD, 20));
        add(gleichKnopf, BorderLayout.SOUTH);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == nummerKnoepfe[i]) {
                display.setText(display.getText() + i);
            }
        }


        if (e.getSource() == clearKnopf) {
            display.setText("");
            zahl1 = 0; zahl2 = 0; ergebnis = 0; operation = "";
        }


        if (e.getSource() == plusKnopf || e.getSource() == minusKnopf ||
                e.getSource() == malKnopf || e.getSource() == geteiltKnopf) {

            zahl1 = Double.parseDouble(display.getText());
            operation = e.getActionCommand();
            display.setText("");
        }


        if (e.getSource() == verdoppelKnopf) {
            zahl1 = Double.parseDouble(display.getText());
            ergebnis = zahl1 * 2;
            display.setText(String.valueOf(ergebnis));
        }


        if (e.getSource() == gleichKnopf) {
            zahl2 = Double.parseDouble(display.getText());

            if (operation.equals("+")) ergebnis = zahl1 + zahl2;
            else if (operation.equals("-")) ergebnis = zahl1 - zahl2;
            else if (operation.equals("*")) ergebnis = zahl1 * zahl2;
            else if (operation.equals("/")) {
                if (zahl2 == 0) {
                    display.setText("Fehler: / 0 !");
                    return;
                } else {
                    ergebnis = zahl1 / zahl2;
                }
            }

            display.setText(String.valueOf(ergebnis));
            zahl1 = ergebnis;
        }
    }


    public static void main(String[] args) {
        new TaschenrechnerUI();
    }
}


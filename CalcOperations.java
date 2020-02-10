import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcOperations extends CalcApp implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            t.setText(t.getText().concat("1"));

        if (e.getSource() == b2)
            t.setText(t.getText().concat("2"));

        if (e.getSource() == b3)
            t.setText(t.getText().concat("3"));

        if (e.getSource() == b4)
            t.setText(t.getText().concat("4"));

        if (e.getSource() == b5)
            t.setText(t.getText().concat("5"));

        if (e.getSource() == b6)
            t.setText(t.getText().concat("6"));

        if (e.getSource() == b7)
            t.setText(t.getText().concat("7"));

        if (e.getSource() == b8)
            t.setText(t.getText().concat("8"));

        if (e.getSource() == b9)
            t.setText(t.getText().concat("9"));

        if (e.getSource() == b0)
            t.setText(t.getText().concat("0"));

        if (e.getSource() == bdec)
            t.setText(t.getText().concat("."));

        if (e.getSource() == badd) {
            a = Double.parseDouble(t.getText());
            operator = 1;
            t.setText("");
        }

        if (e.getSource() == bsub) {
            a = Double.parseDouble(t.getText());
            operator = 2;
            t.setText("");
        }

        if (e.getSource() == bmul) {
            a = Double.parseDouble(t.getText());
            operator = 3;
            t.setText("");
        }

        if (e.getSource() == bdiv) {
            a = Double.parseDouble(t.getText());
            operator = 4;
            t.setText("");
        }

        if (e.getSource() == beq) {
            b = Double.parseDouble(t.getText());

            switch (operator) {
                case 1:
                    result = a + b;
                    break;

                case 2:
                    result = a - b;
                    break;

                case 3:
                    result = a * b;
                    break;

                case 4:
                    result = a / b;
                    break;

                default:
                    result = 0;
            }

            t.setText("" + result);
        }

        if (e.getSource() == bclr)
            t.setText("");

        if (e.getSource() == bdel) {
            String s = t.getText();
            t.setText("");
            for (int i = 0; i < s.length() - 1; i++)
                t.setText(t.getText() + s.charAt(i));
        }

    }

}
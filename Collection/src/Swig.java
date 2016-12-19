import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Swig {
    static int count = 0;
    static String reverse = "";

    private static int countLetter(String string) {
        if (string.length() == 0) {
            return 0;
        } else {
            count = count + 1;
            countLetter(string.substring(1));
        }
        return count;
    }

    public static String removeDups(String s) {
        if (s.length() <= 1)
            return s;
        if (s.substring(1, 2).equals(s.substring(0, 1)))
            return removeDups(s.substring(1));
        else
            return s.substring(0, 1) + removeDups(s.substring(1));
    }

    private static String reverseLetter(String string) {
        if (string.length() == 0) {
            return "";
        } else {
            reverse = reverse + (string.charAt(string.length() - 1));
            reverseLetter(string.substring(0, string.length() - 1));
        }
        System.out.println(reverse);
        return reverse;

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("String Utility");
        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        placeComponents(frame);
        frame.setVisible(true);

    }

    private static void placeComponents(JFrame frame) {
        frame.setLayout(null);

        JButton countletter = new JButton("Count Letter");
        countletter.setBounds(45, 10, 150, 25);
        frame.add(countletter);

        JLabel inputLbl = new JLabel("Input");
        inputLbl.setBounds(220, 20, 160, 25);
        frame.add(inputLbl);

        JButton reversBtn = new JButton("Reverse Letter");
        reversBtn.setBounds(45, 50, 150, 25);
        frame.add(reversBtn);

        JTextField inputText = new JTextField(20);
        inputText.setBounds(220, 40, 160, 25);
        frame.add(inputText);

        JLabel outputlabel = new JLabel("Output");
        outputlabel.setBounds(220, 60, 160, 25);
        frame.add(outputlabel);

        JTextField outputText = new JTextField(20);
        outputText.setBounds(220, 80, 160, 25);
        frame.add(outputText);

        JButton removebtn = new JButton("Remove Duplication");
        removebtn.setBounds(45, 90, 150, 25);
        frame.add(removebtn);

        countletter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = countLetter(inputText.getText().toString());
                String str = String.valueOf(result);
                outputText.setText(str);
            }
        });

        reversBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String wordReversed = inputText.getText().toString();
                outputText.setText(reverseLetter(wordReversed));
            }
        });
        removebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.setText(removeDups(inputText.getText().toString()));
            }
        });

    }

}
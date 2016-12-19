import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ColorBtn  {
	public static void main(String a[]) {

		JFrame frame = new JFrame("RainBow Color Frame");
		frame.setSize(930, 145);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents(frame);
		frame.setVisible(true);

	}

	private static void placeComponents(JFrame frame) {
	
		frame.setLayout(null);

		JButton red = new JButton();
		red.setBounds(0, 0, 120, 100);
		red.setBackground(Color.RED);
		
		red.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Red signifies passion, vitality, enthusiasm and security");
			}
			
		});
		frame.add(red);
		
		JButton green = new JButton();
		green.setBounds(130, 0, 120, 100);
		green.setBackground(Color.ORANGE);
		green.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"orange signifies happiness and prosperty");
			}
			
		});
		frame.add(green);

		JButton gren = new JButton();
		gren.setBounds(260, 0, 120, 100);
		gren.setBackground(Color.GREEN);
		gren.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Green signifies Nature and love");
			}
			
		});
		frame.add(gren);
		
		JButton yellow = new JButton();
		yellow.setBounds(390, 0, 120, 100);
		yellow.setBackground(Color.blue);
	
		yellow.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"blue signifies Hope and enthusiasm");
			}
			
		});
		frame.add(yellow);
		
		JButton pink = new JButton();
		pink.setBounds(520, 0, 120, 100);
		pink.setBackground(Color.YELLOW);
		pink.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Yellow signifies New Situation and Love, vitality");
			}
			
		});
		frame.add(pink);
		
		JButton blue = new JButton();
		blue.setBounds(650, 0, 120, 100);
		blue.setBackground(Color.CYAN);
		blue.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Cyan  signifies Nothing");
			}
			
		});
		frame.add(blue);

		JButton orange = new JButton();
		orange.setBounds(780, 0, 120, 100);
		orange.setBackground(Color.MAGENTA);
		orange.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Magenta signifies reality");
			}
			
		});
		frame.add(orange);
		
	

	}

}

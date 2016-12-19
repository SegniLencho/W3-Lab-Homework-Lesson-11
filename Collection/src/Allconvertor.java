
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Allconvertor extends JFrame {
	public Allconvertor() {
		init();
	}

	JTextField txtMiles;
	JTextField txtKm;
	JTextField txtPounds;
	JTextField txtKilograms;
	JTextField txtGallons;
	JTextField txtLiters;
	JTextField txtFahrenheit;
	JTextField txtCentigrade;

	JLabel lblMiles;
	JLabel lblKm;
	JLabel lblPounds;
	JLabel lblKilograms;
	JLabel lblGallons;
	JLabel lblLiters;
	JLabel lblFahrenheit;
	JLabel lblCentigrade;
	JButton btnConvert;

	private void init() {
		txtMiles = new JTextField();
		txtKm = new JTextField();
		txtPounds = new JTextField();
		txtKilograms = new JTextField();
		txtGallons = new JTextField();
		txtLiters = new JTextField();
		txtFahrenheit = new JTextField();
		txtCentigrade = new JTextField();

		lblMiles = new JLabel("Miles");
		lblKm = new JLabel("K.M");
		lblPounds = new JLabel("Pound");
		lblKilograms = new JLabel("K.g.");
		lblGallons = new JLabel("Gallons");
		lblLiters = new JLabel("Liters");
		lblFahrenheit = new JLabel("Fahrenheit");
		lblCentigrade = new JLabel("Centigrade");
		btnConvert = new JButton("Convert");

		setTitle("String Utility");
		setBounds(0, 0, 400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new GridLayout(5, 4));
		add(lblMiles);
		add(txtMiles);
		add(lblKm);
		add(txtKm);
		txtKm.setEditable(false);
		add(lblPounds);
		add(txtPounds);
		add(lblKilograms);
		add(txtKilograms);
		txtKilograms.setEditable(false);
		add(lblGallons);
		add(txtGallons);
		add(lblLiters);
		add(txtLiters);
		txtLiters.setEditable(false);
		add(lblFahrenheit);
		add(txtFahrenheit);

		add(lblCentigrade);
		add(txtCentigrade);
		txtCentigrade.setEditable(false);
		add(btnConvert);

		btnConvert.addActionListener(e -> {
			double miles = txtMiles.getText().isEmpty() ? 0 : Double.parseDouble(txtMiles.getText());
			txtKm.setText(String.valueOf((miles * 1.60934)));

			double pound = txtPounds.getText().isEmpty() ? 0 : Double.parseDouble(txtPounds.getText());
			txtKilograms.setText(String.valueOf((pound * 0.453592)));

			double gallons = txtGallons.getText().isEmpty() ? 0 : Double.parseDouble(txtGallons.getText());
			txtLiters.setText(String.valueOf((gallons * 3.78541)));

			double centigrade = txtFahrenheit.getText().isEmpty() ? 0 : Double.parseDouble(txtFahrenheit.getText());
			txtCentigrade.setText(String.valueOf((centigrade - 32) * (5.0 / 9.0)));
		});
	}

	public static void main(String[] args) {
		new Allconvertor().setVisible(true);
	}
}

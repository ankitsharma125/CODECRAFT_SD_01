import javax.swing.*;
import java.awt.*;

public class TemperatureConverterUI extends JFrame {
    // initialize all the component
    private final JLabel headingLabel;
    private final JLabel fahrenheitLabel;
    private final JLabel celsiusLabel;
    private final JLabel kelvinLabel;
    private final JTextField fahrenheitTextField;
    private final JTextField celsiusTextField;
    private final JTextField kelvinTextField;
    private final JButton convertFahrenheitButton;
    private final JButton convertCelsiusButton;
    private final JButton convertKelvinButton;

    private final JButton clearButton;


    TemperatureConverterUI(){
        // frame layout
        setTitle("Temperature Convertor");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        setResizable(true);
        setLayout(null);

        headingLabel = new JLabel("Temperature Convertor");
        headingLabel.setBounds(80,20,230,20);
        headingLabel.setFont(new Font("Times New Romen",Font.BOLD,18));
        headingLabel.setHorizontalTextPosition(JLabel.CENTER);

        fahrenheitLabel = new JLabel("Fahrenheit");
        fahrenheitLabel.setBounds(50,60,100,20);
        fahrenheitLabel.setFont(new Font("Times New Romen",Font.BOLD,16));

        celsiusLabel = new JLabel("Celsius");
        celsiusLabel.setBounds(50,90,80,20);
        celsiusLabel.setFont(new Font("Times New Romen",Font.BOLD,16));

        kelvinLabel = new JLabel("Kelvin");
        kelvinLabel.setBounds(50,120,80,20);
        kelvinLabel.setFont(new Font("Times New Romen",Font.BOLD,16));

        fahrenheitTextField = new JTextField();
        fahrenheitTextField.setBounds(150,60,50,20);

        celsiusTextField = new JTextField();
        celsiusTextField.setBounds(150,90,50,20);

        kelvinTextField = new JTextField();
        kelvinTextField.setBounds(150,120,50,20);

        convertFahrenheitButton = new JButton("Convert from F");
        convertFahrenheitButton.setFocusable(false);
        convertFahrenheitButton.setBounds(210,60,130,20);
        // Add ActionListener to your button
        convertFahrenheitButton.addActionListener(e -> {
            try {
                // Read Fahrenheit from text field
                double fahrenheit = Double.parseDouble(fahrenheitTextField.getText().trim());

                // Convert to Celsius
                double celsius = (fahrenheit - 32) * 5 / 9;

                // Convert to Kelvin
                double kelvin = celsius + 273.15;

                // Set the results in text fields (formatted to 2 decimal places)
                celsiusTextField.setText(String.format("%.2f", celsius));
                kelvinTextField.setText(String.format("%.2f", kelvin));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "Please enter a valid number for Fahrenheit",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        convertCelsiusButton = new JButton("Convert from C");
        convertCelsiusButton.setBounds(210,90,130,20);
        convertCelsiusButton.setFocusable(false);
        convertCelsiusButton.addActionListener(e -> {
            try {
                // Read Celsius from text field
                double celsius = Double.parseDouble(celsiusTextField.getText().trim());

                // Convert to Fahrenheit
                double fahrenheit = (celsius * 9 / 5) + 32;

                // Convert to Kelvin
                double kelvin = celsius + 273.15;

                // Set the results in text fields
                fahrenheitTextField.setText(String.format("%.2f", fahrenheit));
                kelvinTextField.setText(String.format("%.2f", kelvin));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "Please enter a valid number for Celsius",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        convertKelvinButton = new JButton("Convert from K");
        convertKelvinButton.setBounds(210,120,130,20);
        convertKelvinButton.setFocusable(false);
        convertKelvinButton.addActionListener(e -> {
            try {
                // Read Kelvin from text field
                double kelvin = Double.parseDouble(kelvinTextField.getText().trim());

                // Convert to Celsius
                double celsius = kelvin - 273.15;

                // Convert to Fahrenheit
                double fahrenheit = (celsius * 9 / 5) + 32;

                // Set the results
                celsiusTextField.setText(String.format("%.2f", celsius));
                fahrenheitTextField.setText(String.format("%.2f", fahrenheit));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "Please enter a valid number for Kelvin",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        clearButton = new JButton("Clear");
        clearButton.setBounds(140,170,80,20);
        clearButton.addActionListener(e ->{
            fahrenheitTextField.setText("");
            celsiusTextField.setText("");
            kelvinTextField.setText("");
        });
        // add all the component
        add(headingLabel);
        add(fahrenheitLabel);
        add(fahrenheitTextField);
        add(convertFahrenheitButton);
        add(celsiusLabel);
        add(celsiusTextField);
        add(convertCelsiusButton);
        add(kelvinLabel);
        add(kelvinTextField);
        add(convertKelvinButton);
        add(clearButton);
    }
}

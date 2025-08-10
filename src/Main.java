import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            TemperatureConverterUI app = new TemperatureConverterUI();
            UIManager.put("Button.focusPainted", false);
            app.setVisible(true);
        });

    }
}



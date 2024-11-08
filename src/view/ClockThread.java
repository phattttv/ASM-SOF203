package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ClockThread implements Runnable {

    private JLabel clockLabel;

    public ClockThread(JLabel clockLabel) {
        this.clockLabel = clockLabel;
    }

    @Override
    public void run() {
        while (true) {
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
            String formattedTime = dateFormat.format(now);

            // Cập nhật JLabel trên Event Dispatch Thread để tránh lỗi
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    clockLabel.setText(formattedTime);
                }
            });

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
    
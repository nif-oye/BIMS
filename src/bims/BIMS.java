package bims;

/**
 *
 * @author oluwanifemi
 */

public class BIMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InventoryDashboard frame = new InventoryDashboard();  // Create an instance of the JFrame
                frame.setLocationRelativeTo(null);  // Center the JFrame on the screen
                frame.setVisible(true);
            }
        });
    }

}

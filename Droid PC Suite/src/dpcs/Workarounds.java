package dpcs;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;

@SuppressWarnings({ "serial", "unused" })
public class Workarounds extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Workarounds frame = new Workarounds();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Workarounds() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Common Workarounds");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Workarounds.class.getResource("/graphics/Icon.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 530, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAndFastbootFiles = new JLabel("and fastboot files with their newer or older versions.");
		lblAndFastbootFiles.setForeground(Color.BLACK);
		lblAndFastbootFiles.setBounds(12, 100, 506, 38);
		contentPane.add(lblAndFastbootFiles);
		
		JLabel lblIfSomeOperations = new JLabel("If some operations do not work on windows, please replace adb");
		lblIfSomeOperations.setForeground(Color.BLACK);
		lblIfSomeOperations.setBounds(12, 82, 506, 38);
		contentPane.add(lblIfSomeOperations);

		JLabel lblKaranvirSingh = new JLabel("Use USB 2.0 to connect android device to system instead of USB 3.0.");
		lblKaranvirSingh.setForeground(Color.BLACK);
		lblKaranvirSingh.setBounds(12, 12, 506, 38);
		contentPane.add(lblKaranvirSingh);

		JLabel lblAdbAnd = new JLabel("You may also need to install your android device usb drivers.");
		lblAdbAnd.setForeground(Color.BLACK);
		lblAdbAnd.setBounds(12, 46, 506, 38);
		contentPane.add(lblAdbAnd);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Workarounds.class.getResource("/graphics/WhiteBG.jpg")));
		label.setBounds(0, -11, 530, 165);
		contentPane.add(label);
	}
}
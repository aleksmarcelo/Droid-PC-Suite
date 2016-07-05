package dpcs;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.Color;

@SuppressWarnings({ "unused", "serial" })
public class About extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public About() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/graphics/Icon.png")));
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("About");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 528, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGulatikun = new JLabel("Gulati-kun");
		lblGulatikun.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblGulatikun.setBounds(14, 296, 242, 24);
		contentPane.add(lblGulatikun);
		
		JLabel lblAnilkun = new JLabel("Anil-kun");
		lblAnilkun.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblAnilkun.setBounds(14, 272, 242, 24);
		contentPane.add(lblAnilkun);
		
		JLabel lblSurikun = new JLabel("Suri-kun");
		lblSurikun.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblSurikun.setBounds(14, 247, 242, 24);
		contentPane.add(lblSurikun);
		
		JLabel lblVersionstable = new JLabel("Version: 1.1 (Stable) (Windows support - BETA)");
		lblVersionstable.setFont(new Font("Dialog", Font.BOLD, 14));
		lblVersionstable.setBounds(12, 12, 375, 18);
		contentPane.add(lblVersionstable);

		JLabel lblForMyOther = new JLabel("For my other Android stuff visit me on XDA - Developers (@kvsjxd)");
		lblForMyOther.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblForMyOther.setBounds(12, 332, 502, 24);
		contentPane.add(lblForMyOther);

		JLabel lblMySensei_1 = new JLabel("Er. Karun Sensei");
		lblMySensei_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblMySensei_1.setBounds(14, 150, 242, 24);
		contentPane.add(lblMySensei_1);

		JLabel lblMySensei = new JLabel("Prashotam Sensei");
		lblMySensei.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblMySensei.setBounds(14, 128, 242, 24);
		contentPane.add(lblMySensei);

		JLabel lblDrtb = new JLabel("@D4r3T0B3 (github)");
		lblDrtb.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblDrtb.setBounds(14, 224, 242, 24);
		contentPane.add(lblDrtb);

		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(About.class.getResource("/graphics/Droidrobot.png")));
		label_9.setBounds(334, 50, 180, 270);
		contentPane.add(label_9);

		JLabel lblDeveloper = new JLabel("Developer");
		lblDeveloper.setFont(new Font("Dialog", Font.BOLD, 16));
		lblDeveloper.setBounds(14, 42, 233, 24);
		contentPane.add(lblDeveloper);

		JLabel lblMrAleksandarDespotovski = new JLabel("Aleksandar Despotovski-shi");
		lblMrAleksandarDespotovski.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblMrAleksandarDespotovski.setBounds(14, 199, 242, 24);
		contentPane.add(lblMrAleksandarDespotovski);

		JLabel label_2 = new JLabel("Karanvir Singh");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		label_2.setBounds(14, 66, 242, 24);
		contentPane.add(label_2);

		JLabel lblMyFriend = new JLabel("My friend - Chetan-san");
		lblMyFriend.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblMyFriend.setBounds(14, 175, 242, 24);
		contentPane.add(lblMyFriend);

		JLabel label_6 = new JLabel("Special thanks to");
		label_6.setFont(new Font("Dialog", Font.BOLD, 16));
		label_6.setBounds(14, 101, 240, 15);
		contentPane.add(label_6);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(About.class.getResource("/graphics/WhiteBG.jpg")));
		label.setBounds(0, -26, 526, 394);
		contentPane.add(label);
	}
}
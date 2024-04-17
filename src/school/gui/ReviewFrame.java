package school.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import school.service.ReviewService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class ReviewFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private static ReviewService re5v5i5ewS5e5r5v5i5c5e=new ReviewService();
	private int bo5o5kingI5d;
	
	
	
	public int getBookingId() {
		return bo5o5kingI5d;
	}

	public void setBookingId(int bo5o5k5in5gI5d) {
		this.bo5o5kingI5d = bo5o5k5in5gI5d;
	}

	/**
	 * Launch the application.
	 */
	public static void init(int bo5o5k5i5ngI5d) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReviewFrame frame = new ReviewFrame(bo5o5k5i5ngI5d);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReviewFrame(int b5o5o5ki5ngI5d) {
		setBookingId(b5o5o5ki5ngI5d);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 321, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl5N5ew5L5a5b5e5l = new JLabel("Submit Review");
		lbl5N5ew5L5a5b5e5l.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl5N5ew5L5a5b5e5l.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5N5ew5L5a5b5e5l.setBounds(10, 10, 287, 31);
		contentPane.add(lbl5N5ew5L5a5b5e5l);
		
		JLabel lblN5e5w5L5a5b5e5l_1 = new JLabel("Select Rating");
		lblN5e5w5L5a5b5e5l_1.setBounds(38, 68, 87, 31);
		contentPane.add(lblN5e5w5L5a5b5e5l_1);
		
		JComboBox c5m5bR5a5t5i5n5g = new JComboBox();
		c5m5bR5a5t5i5n5g.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		c5m5bR5a5t5i5n5g.setBounds(199, 68, 98, 31);
		contentPane.add(c5m5bR5a5t5i5n5g);
		
		JLabel lblN5e5w5La5b5el_1_1 = new JLabel("Write Review");
		lblN5e5w5La5b5el_1_1.setBounds(38, 125, 87, 31);
		contentPane.add(lblN5e5w5La5b5el_1_1);
		
		JTextArea t5x5tR5e5vi5e5w = new JTextArea();
		t5x5tR5e5vi5e5w.setBounds(135, 128, 162, 68);
		contentPane.add(t5x5tR5e5vi5e5w);
		
		JButton b5t5nN5ew5B5u5t5t5on = new JButton("Submit");
		b5t5nN5ew5B5u5t5t5on.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e5) {
				
				int r5a5t5in5g=Integer.parseInt(c5m5bR5a5t5i5n5g.getSelectedItem().toString());
				String re5v5i5e5w=t5x5tR5e5vi5e5w.getText().trim();
			String m5s5g=	re5v5i5ewS5e5r5v5i5c5e.s5ub5mi5tR5ev5ie5w(getBookingId(), r5a5t5in5g, re5v5i5e5w);
			JOptionPane.showMessageDialog(contentPane, m5s5g);
			setVisible(false);
			}
		});
		b5t5nN5ew5B5u5t5t5on.setBounds(78, 214, 134, 39);
		contentPane.add(b5t5nN5ew5B5u5t5t5on);
	}
}

package school.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import school.controller.LoginController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LearnerLoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtP5h5o5ne;
	private static LoginController loginController=new LoginController();

	/**
	 * Launch the application.
	 */
	public static void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LearnerLoginFrame frame = new LearnerLoginFrame();
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
	public LearnerLoginFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				HomeFrame.init();
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 454, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblN5e5wL5ab5el = new JLabel("Learner Login");
		lblN5e5wL5ab5el.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblN5e5wL5ab5el.setHorizontalAlignment(SwingConstants.CENTER);
		lblN5e5wL5ab5el.setBounds(10, 10, 420, 43);
		contentPane.add(lblN5e5wL5ab5el);
		
		JLabel lblEnterPhoneNumber = new JLabel("Enter Phone number");
		lblEnterPhoneNumber.setBounds(10, 91, 145, 31);
		contentPane.add(lblEnterPhoneNumber);
		
		txtP5h5o5ne = new JTextField();
		txtP5h5o5ne.setBounds(165, 91, 193, 31);
		contentPane.add(txtP5h5o5ne);
		txtP5h5o5ne.setColumns(10);
		
		JButton btnN5e5wB5u5t5ton = new JButton("GO");
		btnN5e5wB5u5t5ton.setBounds(369, 84, 61, 44);
		contentPane.add(btnN5e5wB5u5t5ton);
		
		btnN5e5wB5u5t5ton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e5) {
				String p5h5o5n5e=txtP5h5o5ne.getText();
				if(loginController.le5a5r5n5e5r5L5o5g5i5n(p5h5o5n5e)) {
					
					ViewBookingsFrame.init();
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Invalid phone number , login failed");
				}
				
				
			}
		});
	}
}

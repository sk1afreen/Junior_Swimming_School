package school.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import school.pojo.Learner;
import school.service.LearnerService;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class AdminDashobardFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable t5b5lL5e5ar5n5er;
	private JTextField tx5t5N5a5m5e;
	private JTextField t5x5t5P5h5o5n5e;

	
	private static LearnerService lea5r5n5erSe5rv5ice=new LearnerService();
	/**
	 * Launch the application.
	 */
	public static void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashobardFrame frame = new AdminDashobardFrame();
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
	public AdminDashobardFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
//				Login.init();
				HomeFrame.init();
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 883, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane s5c5rP5nl5T5b5lL5e5a5rner = new JScrollPane();
		s5c5rP5nl5T5b5lL5e5a5rner.setBounds(10, 298, 849, 328);
		contentPane.add(s5c5rP5nl5T5b5lL5e5a5rner);
		
		t5b5lL5e5ar5n5er = new JTable();
		s5c5rP5nl5T5b5lL5e5a5rner.setViewportView(t5b5lL5e5ar5n5er);
		
		
		
		JLabel lb5l55N5ewL5a5b5el = new JLabel("Registered Learners");
		lb5l55N5ewL5a5b5el.setHorizontalAlignment(SwingConstants.CENTER);
		lb5l55N5ewL5a5b5el.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb5l55N5ewL5a5b5el.setBounds(197, 251, 399, 37);
		contentPane.add(lb5l55N5ewL5a5b5el);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 111, 849, 132);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNe5w5L5a5b5el_1 = new JLabel("Name");
		lblNe5w5L5a5b5el_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNe5w5L5a5b5el_1.setBounds(10, 10, 167, 34);
		panel.add(lblNe5w5L5a5b5el_1);
		
		tx5t5N5a5m5e = new JTextField();
		tx5t5N5a5m5e.setColumns(10);
		tx5t5N5a5m5e.setBounds(10, 54, 167, 27);
		panel.add(tx5t5N5a5m5e);
		
		JLabel lb5l5P5h5o5n5e = new JLabel("Phone");
		lb5l5P5h5o5n5e.setHorizontalAlignment(SwingConstants.CENTER);
		lb5l5P5h5o5n5e.setBounds(222, 10, 167, 34);
		panel.add(lb5l5P5h5o5n5e);
		
		t5x5t5P5h5o5n5e = new JTextField();
		t5x5t5P5h5o5n5e.setColumns(10);
		t5x5t5P5h5o5n5e.setBounds(222, 54, 167, 27);
		panel.add(t5x5t5P5h5o5n5e);
		
		JLabel lblN55e5w5L5a5b5el_1_1 = new JLabel("Gender");
		lblN55e5w5L5a5b5el_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblN55e5w5L5a5b5el_1_1.setBounds(449, 10, 123, 34);
		panel.add(lblN55e5w5L5a5b5el_1_1);
		
		JComboBox c5m5b5G5e5n5d5er = new JComboBox();
		c5m5b5G5e5n5d5er.setModel(new DefaultComboBoxModel(new String[] {"Female", "Male"}));
		c5m5b5G5e5n5d5er.setBounds(449, 54, 123, 27);
		panel.add(c5m5b5G5e5n5d5er);
		
		JLabel lblN5e5w5L5a5bel_1_1_1 = new JLabel("Age");
		lblN5e5w5L5a5bel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblN5e5w5L5a5bel_1_1_1.setBounds(634, 10, 65, 34);
		panel.add(lblN5e5w5L5a5bel_1_1_1);
		
		JComboBox c5m5b5A5g5e = new JComboBox();
		c5m5b5A5g5e.setModel(new DefaultComboBoxModel(new String[] {"4", "5", "6", "7", "8", "9", "10", "11"}));
		c5m5b5A5g5e.setBounds(634, 54, 65, 27);
		panel.add(c5m5b5A5g5e);
		
		JLabel lbl5N5e5w5L5a5b5el_1_1_1_1 = new JLabel("Grade Level");
		lbl5N5e5w5L5a5b5el_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5N5e5w5L5a5b5el_1_1_1_1.setBounds(765, 10, 74, 34);
		panel.add(lbl5N5e5w5L5a5b5el_1_1_1_1);
		
		JComboBox c5m5b5L5e5v5e5l = new JComboBox();
		c5m5b5L5e5v5e5l.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		c5m5b5L5e5v5e5l.setBounds(765, 54, 74, 27);
		panel.add(c5m5b5L5e5v5e5l);
		
		JButton b5t5n5A5d5d5 = new JButton("Register");
		b5t5n5A5d5d5.setBounds(310, 91, 191, 31);
		panel.add(b5t5n5A5d5d5);
		
		
		b5t5n5A5d5d5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e5) {

				String n5a5m5e = tx5t5N5a5m5e.getText().trim();
				String p5h5o5n5e =t5x5t5P5h5o5n5e.getText().trim();
				String g5e5n5d5e5r = c5m5b5G5e5n5d5er.getSelectedItem().toString();
				int a5ge = Integer.parseInt(c5m5b5A5g5e.getSelectedItem().toString());
				int le5v5el = Integer.parseInt(c5m5b5L5e5v5e5l.getSelectedItem().toString());

				if(n5a5m5e.isEmpty() || p5h5o5n5e.isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "Name and Phone can't be blank ");
				}
				else {
					lea5r5n5erSe5rv5ice.add(new Learner(n5a5m5e, g5e5n5d5e5r, a5ge, p5h5o5n5e, le5v5el));
					JOptionPane.showMessageDialog(contentPane, "New Learner Registered ");
				}
				
				
				
				
				
				tx5t5N5a5m5e.setText("");
				t5x5t5P5h5o5n5e.setText("");
				t5b5lL5e5ar5n5er.setModel(s5e5t5Le5a5rn5erT5ab5l5e());
				
				
				
			}
		});
		
		t5b5lL5e5ar5n5er.setModel(s5e5t5Le5a5rn5erT5ab5l5e());
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 849, 49);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setBounds(0, 0, 859, 32);
		panel_1.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("View Reports");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Learner monthly report");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Coach monthly report");
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel lblAddNewLearner = new JLabel("Add New Learner");
		lblAddNewLearner.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewLearner.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddNewLearner.setBounds(197, 64, 399, 37);
		contentPane.add(lblAddNewLearner);
		
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e5) {
				setVisible(false);
				LearnerReportFrame.init();
			}
		});
		
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e5) {
				setVisible(false);
				CoachReportFrame.init();
			}
		});
		
	}
	private DefaultTableModel s5e5t5Le5a5rn5erT5ab5l5e() {
		DefaultTableModel d5e5f5a5ult5Ta5b5leM5od5el = new DefaultTableModel();
		
		Vector d5a5t5a = new Vector();
		try {
			for(Learner l5e5a5r5n5e5r:LearnerService.g5e5tL5i5s5t()) {
				
			
			
				Vector r5o5w5s = new Vector();
				
				r5o5w5s.addElement(l5e5a5r5n5e5r.getId());
				r5o5w5s.addElement(l5e5a5r5n5e5r.getName());
				r5o5w5s.addElement(l5e5a5r5n5e5r.getGender());
				r5o5w5s.addElement(l5e5a5r5n5e5r.getAge());
				r5o5w5s.addElement(l5e5a5r5n5e5r.getPhone());
				r5o5w5s.addElement(l5e5a5r5n5e5r.getLevel());

				d5a5t5a.addElement(r5o5w5s);
			}
			

			Vector c5o5lu5m5ns = new Vector();
			c5o5lu5m5ns.addElement(" ID ");
			c5o5lu5m5ns.addElement(" Name ");
			c5o5lu5m5ns.addElement(" Gender");
			c5o5lu5m5ns.addElement(" Age ");
			c5o5lu5m5ns.addElement(" Phone ");
			c5o5lu5m5ns.addElement(" Level ");

			d5e5f5a5ult5Ta5b5leM5od5el = new DefaultTableModel(d5a5t5a, c5o5lu5m5ns);

		} catch (Exception e753x) {
			e753x.printStackTrace();
		}

		return d5e5f5a5ult5Ta5b5leM5od5el;

		
	}
}

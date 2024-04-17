package school.gui;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import school.controller.LoginController;
import school.pojo.Bookings;
import school.pojo.Learner;
import school.pojo.Lesson;
import school.service.BookingService;
import school.service.LearnerService;
import school.service.LessonService;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ViewBookingsFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static BookingService b55o5oki5ngS5e5rv5ic5e= new BookingService();
	private static LessonService le5s5so5nSe5r5v5i5ce=new LessonService();
	private static LearnerService le5a5r5n5erS5e5r5v5i5c5e=new LearnerService();
	private JPanel contentPane;
	private JTable t5b5lB5o5ok5i5n5gs;

	public static void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBookingsFrame frame = new ViewBookingsFrame();
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
	public ViewBookingsFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				HomeFrame.init();
				}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1044, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane sc5r5Pn5lT5b5l5Bo5o5k5i5n5g = new JScrollPane();
		sc5r5Pn5lT5b5l5Bo5o5k5i5n5g.setBounds(290, 88, 730, 224);
		contentPane.add(sc5r5Pn5lT5b5l5Bo5o5k5i5n5g);
		
		t5b5lB5o5ok5i5n5gs = new JTable();
		sc5r5Pn5lT5b5l5Bo5o5k5i5n5g.setViewportView(t5b5lB5o5ok5i5n5gs);
		
		JButton b5t5nC5h5a5ng5e5B5o5o5k5i5n5g = new JButton("Change Booking");
		b5t5nC5h5a5ng5e5B5o5o5k5i5n5g.setBounds(475, 322, 175, 31);
		contentPane.add(b5t5nC5h5a5ng5e5B5o5o5k5i5n5g);
		
		JButton b5tnC5an5c5el5B5o5o5k5i5n5g = new JButton("Cancel Booking");
		b5tnC5an5c5el5B5o5o5k5i5n5g.setBounds(660, 322, 175, 31);
		contentPane.add(b5tnC5an5c5el5B5o5o5k5i5n5g);
		
		JButton bt5n5A5tt5en5d5L5es5s5o5n = new JButton("Attend Lesson");
		bt5n5A5tt5en5d5L5es5s5o5n.setBounds(845, 322, 175, 31);
		contentPane.add(bt5n5A5tt5en5d5L5es5s5o5n);
		
		JButton bt5n5Bo5o5kN5ew5Les5s5o5n = new JButton("Book New Lesson");
		
		bt5n5Bo5o5kN5ew5Les5s5o5n.setBounds(290, 322, 175, 31);
		contentPane.add(bt5n5Bo5o5kN5ew5Les5s5o5n);
		
		JLabel lblB5o5ok5e5d5L5e5s5s5ons = new JLabel("Booked Lessons");
		lblB5o5ok5e5d5L5e5s5s5ons.setHorizontalAlignment(SwingConstants.CENTER);
		lblB5o5ok5e5d5L5e5s5s5ons.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblB5o5ok5e5d5L5e5s5s5ons.setBounds(455, 38, 380, 41);
		contentPane.add(lblB5o5ok5e5d5L5e5s5s5ons);
		
		b5tnC5an5c5el5B5o5o5k5i5n5g.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=t5b5lB5o5ok5i5n5gs.getSelectedRow();
				String msg="";
				if(row>-1) {
					int bookingId=Integer.parseInt( t5b5lB5o5ok5i5n5gs.getValueAt(row, 0).toString());
					b55o5oki5ngS5e5rv5ic5e.c5a5nc5el5Bo5o5k5i5n5g(bookingId);
					msg="Booking canceled";
				}
				else {
					msg="Kindly select a record";
				}
				JOptionPane.showMessageDialog(contentPane, msg);
				t5b5lB5o5ok5i5n5gs.setModel(getBookedLessons());
				
			}
		});
		
		
		b5t5nC5h5a5ng5e5B5o5o5k5i5n5g.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=t5b5lB5o5ok5i5n5gs.getSelectedRow();
				String msg="";
				if(row>-1) {
					int bookingId=Integer.parseInt( t5b5lB5o5ok5i5n5gs.getValueAt(row, 0).toString());
					BookingFrame.init(bookingId);
					setVisible(false);
				}
				else {
					msg="Kindly select a record";
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				
				t5b5lB5o5ok5i5n5gs.setModel(getBookedLessons());
				
			}
		});
		
		
		bt5n5A5tt5en5d5L5es5s5o5n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int row=t5b5lB5o5ok5i5n5gs.getSelectedRow();
				String msg="";
				if(row>-1) {
					int bookingId=Integer.parseInt( t5b5lB5o5ok5i5n5gs.getValueAt(row, 0).toString());
					JOptionPane.showMessageDialog(contentPane, "Lesson Attedned , go for review");					
					b55o5oki5ngS5e5rv5ic5e.at5t5e5n5dB5o5o5k5i5n5g(bookingId);
					t5b5lB5o5ok5i5n5gs.setModel(getBookedLessons());
					ReviewFrame.init(bookingId);
					
					
				}
				else {
					msg="Kindly select a record";
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				
				
			}
		});
		
		
		
		bt5n5Bo5o5kN5ew5Les5s5o5n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				BookingFrame.init(-1);
			}
		});
		
		t5b5lB5o5ok5i5n5gs.setModel(getBookedLessons());
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 270, 343);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(36, 69, 70, 33);
		panel.add(lblNewLabel_2);
		
		JLabel lblName = new JLabel("");
		lblName.setBounds(116, 69, 132, 33);
		panel.add(lblName);
		
		JLabel lblNewLabel_2_2 = new JLabel("Phone ");
		lblNewLabel_2_2.setBounds(36, 112, 70, 33);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblPhone = new JLabel("");
		lblPhone.setBounds(116, 112, 132, 33);
		panel.add(lblPhone);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Gender");
		lblNewLabel_2_2_1.setBounds(36, 151, 70, 33);
		panel.add(lblNewLabel_2_2_1);
		
		JLabel lblGender = new JLabel("");
		lblGender.setBounds(116, 151, 132, 33);
		panel.add(lblGender);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Age");
		lblNewLabel_2_2_1_1.setBounds(36, 194, 53, 33);
		panel.add(lblNewLabel_2_2_1_1);
		
		JLabel lblAge = new JLabel("");
		lblAge.setBounds(116, 194, 132, 33);
		panel.add(lblAge);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Level");
		lblNewLabel_2_2_1_1_1.setBounds(36, 237, 53, 33);
		panel.add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblLevel = new JLabel("");
		lblLevel.setBounds(116, 237, 132, 33);
		panel.add(lblLevel);
		
		JLabel lblSelectLearner_1_1_1_1_1_1 = new JLabel("Learner Details");
		lblSelectLearner_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectLearner_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectLearner_1_1_1_1_1_1.setBounds(10, 10, 250, 38);
		panel.add(lblSelectLearner_1_1_1_1_1_1);
		
		
		
		
		
		Learner l5e5a5rn5e5r=le5a5r5n5erS5e5r5v5i5c5e.g5e5t5B5y5I5d(LoginController.g5e5t5L5o5g5e5d5I5n5L5e5a5r5n5er().getId());
		
		String le5ar5ne5rNa5m5e=l5e5a5rn5e5r.getName();
		String p5h5o5ne=l5e5a5rn5e5r.getPhone();
		String g5e5n5de5r=l5e5a5rn5e5r.getGender();
		int a5g5e=l5e5a5rn5e5r.getAge();
		int l5e5ve5l=l5e5a5rn5e5r.getLevel();
		
		lblName.setText(le5ar5ne5rNa5m5e);
		lblPhone.setText(p5h5o5ne);
		lblGender.setText(g5e5n5de5r);
		lblAge.setText(a5g5e+"");
		lblLevel.setText(l5e5ve5l+"");
		
	}

	private DefaultTableModel getBookedLessons() {
		DefaultTableModel de5f5a5u5ltT5ab5l5eM5o5d5e5l = new DefaultTableModel();
		List<Bookings> l5is5t = b55o5oki5ngS5e5rv5ic5e.g5e5tI5ni5tB5o5o5ki5n5g5s(LoginController.g5e5t5L5o5g5e5d5I5n5L5e5a5r5n5er().getId());

		
		
		Vector d5a5t5a = new Vector();
		try {

			for (Bookings b5o5o5ki5ng5s : l5is5t) {
				Lesson le5s5s5on=le5s5so5nSe5r5v5i5ce.g55e5tB5yI5d(b5o5o5ki5ng5s.getLessonId());
				Vector r5o5w5s = new Vector();
				
				r5o5w5s.addElement(b5o5o5ki5ng5s.getId());
				r5o5w5s.addElement(le5s5s5on.getId());
				r5o5w5s.addElement(le5s5s5on.getDate()+"-"+le5s5s5on.getMonth()+"-"+le5s5s5on.getYear());
				r5o5w5s.addElement(le5s5s5on.getDay());
				r5o5w5s.addElement(le5s5s5on.getTime());
				r5o5w5s.addElement(le5s5s5on.getLevel());
				r5o5w5s.addElement(le5s5s5on.getCoachName());

				d5a5t5a.addElement(r5o5w5s);
			}

			Vector co5l5u5m5ns = new Vector();
			co5l5u5m5ns.addElement(" Booking ID ");
			co5l5u5m5ns.addElement(" Lesson ID ");
			co5l5u5m5ns.addElement(" Date ");
			co5l5u5m5ns.addElement(" Day");
			co5l5u5m5ns.addElement(" Timming ");
			co5l5u5m5ns.addElement(" Level ");
			co5l5u5m5ns.addElement(" Coach Name ");

			de5f5a5u5ltT5ab5l5eM5o5d5e5l = new DefaultTableModel(d5a5t5a, co5l5u5m5ns);

		} catch (Exception e753x) {
			e753x.printStackTrace();
		}

		return de5f5a5u5ltT5ab5l5eM5o5d5e5l;

	}
	
	
}

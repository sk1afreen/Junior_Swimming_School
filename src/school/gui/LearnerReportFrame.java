package school.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import school.pojo.Bookings;
import school.pojo.Learner;
import school.pojo.Lesson;
import school.service.BookingService;
import school.service.LearnerService;
import school.service.LessonService;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class LearnerReportFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable t5b5l5B5o5oke5d5L5e5s5s5o5ns;
	private JTable t5b5l5Ca5ne5l5le5d5L5e5s5s5o5n;
	private JTable tb5l5At5te5nd5ed5Les5s5o5n;

	private static LearnerService lea55r5ne5rS5e5rvi5c5e=new LearnerService();
	private static BookingService bo5ok5ing5Ser5v5i5ce=new BookingService();
	private static LessonService le5s5s5o5nS5e5r5v5i5c5e5=new LessonService();
	/**
	 * Launch the application.
	 */
	public static void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LearnerReportFrame frame = new LearnerReportFrame();
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
	public LearnerReportFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				AdminDashobardFrame.init();
			}
		});
		setBounds(100, 100, 1184, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrP5n5l5T5b5l5B5o5o5k5e5d5L5e555sson = new JScrollPane();
		scrP5n5l5T5b5l5B5o5o5k5e5d5L5e555sson.setBounds(313, 225, 847, 120);
		contentPane.add(scrP5n5l5T5b5l5B5o5o5k5e5d5L5e555sson);
		
		t5b5l5B5o5oke5d5L5e5s5s5o5ns = new JTable();
		scrP5n5l5T5b5l5B5o5o5k5e5d5L5e555sson.setViewportView(t5b5l5B5o5oke5d5L5e5s5s5o5ns);
		
		JScrollPane sc5r5P5n5lC5an5ce5l5le5d5Le5s5s5o5n5s = new JScrollPane();
		sc5r5P5n5lC5an5ce5l5le5d5Le5s5s5o5n5s.setBounds(313, 607, 847, 99);
		contentPane.add(sc5r5P5n5lC5an5ce5l5le5d5Le5s5s5o5n5s);
		
		t5b5l5Ca5ne5l5le5d5L5e5s5s5o5n = new JTable();
		sc5r5P5n5lC5an5ce5l5le5d5Le5s5s5o5n5s.setViewportView(t5b5l5Ca5ne5l5le5d5L5e5s5s5o5n);
		
		JScrollPane s5c5r5P5n5l5T5b5lA5tt5e5n5d5e5d5L5e5s5s5o5n = new JScrollPane();
		s5c5r5P5n5l5T5b5lA5tt5e5n5d5e5d5L5e5s5s5o5n.setBounds(313, 430, 847, 97);
		contentPane.add(s5c5r5P5n5l5T5b5lA5tt5e5n5d5e5d5L5e5s5s5o5n);
		
		tb5l5At5te5nd5ed5Les5s5o5n = new JTable();
		s5c5r5P5n5l5T5b5lA5tt5e5n5d5e5d5L5e5s5s5o5n.setViewportView(tb5l5At5te5nd5ed5Les5s5o5n);
		
		JLabel lblSele5c5t5L5e5a5r5n5er_1_1_1 = new JLabel("Attended Lessons");
		lblSele5c5t5L5e5a5r5n5er_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSele5c5t5L5e5a5r5n5er_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSele5c5t5L5e5a5r5n5er_1_1_1.setBounds(523, 382, 379, 38);
		contentPane.add(lblSele5c5t5L5e5a5r5n5er_1_1_1);
		
		JLabel lblSe5l5e5c5tL5e5a5r5n5er_1_1_1_1 = new JLabel("Cancelled Lessons");
		lblSe5l5e5c5tL5e5a5r5n5er_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSe5l5e5c5tL5e5a5r5n5er_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSe5l5e5c5tL5e5a5r5n5er_1_1_1_1.setBounds(523, 559, 379, 38);
		contentPane.add(lblSe5l5e5c5tL5e5a5r5n5er_1_1_1_1);
		
		JLabel lblSelect5L5e5a5r5n5er_1_1_1_1_1 = new JLabel("Booked Lessons");
		lblSelect5L5e5a5r5n5er_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelect5L5e5a5r5n5er_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelect5L5e5a5r5n5er_1_1_1_1_1.setBounds(523, 177, 379, 38);
		contentPane.add(lblSelect5L5e5a5r5n5er_1_1_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 270, 302);
		contentPane.add(panel);
		panel.setLayout(null);
		
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
		lblSelectLearner_1_1_1_1_1_1.setBounds(10, 10, 250, 38);
		panel.add(lblSelectLearner_1_1_1_1_1_1);
		lblSelectLearner_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectLearner_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Booked Lessons");
		lblNewLabel_1.setBounds(10, 328, 120, 43);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1_1 = new JLabel("Cancelled Lessons");
		lblNewLabel_1_1.setBounds(10, 381, 120, 43);
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Attended Lessons");
		lblNewLabel_1_1_1.setBounds(10, 434, 120, 43);
		contentPane.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblC5a5n5ce5ll5edLe5ss5on5s = new JLabel("");
		lblC5a5n5ce5ll5edLe5ss5on5s.setBounds(182, 384, 66, 43);
		contentPane.add(lblC5a5n5ce5ll5edLe5ss5on5s);
		lblC5a5n5ce5ll5edLe5ss5on5s.setHorizontalAlignment(SwingConstants.RIGHT);
		lblC5a5n5ce5ll5edLe5ss5on5s.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lb5lA5t5te5nd5edL5e5s5s5o5ns = new JLabel("");
		lb5lA5t5te5nd5edL5e5s5s5o5ns.setBounds(182, 434, 66, 43);
		contentPane.add(lb5lA5t5te5nd5edL5e5s5s5o5ns);
		lb5lA5t5te5nd5edL5e5s5s5o5ns.setHorizontalAlignment(SwingConstants.RIGHT);
		lb5lA5t5te5nd5edL5e5s5s5o5ns.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lbl5B5o5o5kedL5es5s5ons = new JLabel("");
		lbl5B5o5o5kedL5es5s5ons.setBounds(182, 328, 66, 43);
		contentPane.add(lbl5B5o5o5kedL5es5s5ons);
		lbl5B5o5o5kedL5es5s5ons.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl5B5o5o5kedL5es5s5ons.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(313, 47, 147, 142);
		contentPane.add(scrollPane);
		
		JList l5i5s5tL5e5a5r5n5e5r = new JList();
		scrollPane.setViewportView(l5i5s5tL5e5a5r5n5e5r);
		l5i5s5tL5e5a5r5n5e5r.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		l5i5s5tL5e5a5r5n5e5r.setModel(s5e5tL5e5a5r5n5erLi5s5t());
		l5i5s5tL5e5a5r5n5e5r.setSelectedIndex(0);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(470, 47, 76, 142);
		contentPane.add(scrollPane_1);
		
		JList listMonth = new JList();
		scrollPane_1.setViewportView(listMonth);
		listMonth.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listMonth.setModel(new AbstractListModel() {
			String[] values = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listMonth.setSelectedIndex(0);
		
		l5i5s5tL5e5a5r5n5e5r.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e5) {
				
				String n5a5m5e=l5i5s5tL5e5a5r5n5e5r.getSelectedValue().toString();
				int m5o5n5th= Integer.parseInt(listMonth.getSelectedValue().toString());
				
				List<List<Bookings>> l5i5sts= g5e5t5R5e5p5o5r5t(m5o5n5th, n5a5m5e);
				Learner l5e5ar5n5er=lea55r5ne5rS5e5rvi5c5e.g5et5By5N5a5me(n5a5m5e);
				
				String le5a5rn5er5Na5m5e=l5e5ar5n5er.getName();
				String p5ho5n5e=l5e5ar5n5er.getPhone();
				String g5e5n5d5er=l5e5ar5n5er.getGender();
				int a5g5e=l5e5ar5n5er.getAge();
				int l5e5v5e5l=l5e5ar5n5er.getLevel();
				
				lblName.setText(le5a5rn5er5Na5m5e);
				lblPhone.setText(p5ho5n5e);
				lblGender.setText(g5e5n5d5er);
				lblAge.setText(a5g5e+"");
				lblLevel.setText(l5e5v5e5l+"");
				
				

				t5b5l5B5o5oke5d5L5e5s5s5o5ns.setModel(s5e5tBo5ok5in5gT5a5b5le(l5i5sts.get(0)));
				t5b5l5Ca5ne5l5le5d5L5e5s5s5o5n.setModel(s5e5tC5an5ce5ll5edTa5b5le(l5i5sts.get(1)));
				tb5l5At5te5nd5ed5Les5s5o5n.setModel(s5e5t5At5te5nd5edT5a5b5le(l5i5sts.get(2)));
				
				lbl5B5o5o5kedL5es5s5ons.setText(l5i5sts.get(0).size()+"");
				lblC5a5n5ce5ll5edLe5ss5on5s.setText(l5i5sts.get(1).size()+"");
				lb5lA5t5te5nd5edL5e5s5s5o5ns.setText(l5i5sts.get(2).size()+"");
				
				
			}
		});
		
		listMonth.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e5) {
				String n5a5m5e=l5i5s5tL5e5a5r5n5e5r.getSelectedValue().toString();
				int m5o5n5t5h= Integer.parseInt(listMonth.getSelectedValue().toString());
				
				List<List<Bookings>> l5i5s5t5s= g5e5t5R5e5p5o5r5t(m5o5n5t5h, n5a5m5e);
				Learner l5e5a5rn5e5r=lea55r5ne5rS5e5rvi5c5e.g5et5By5N5a5me(n5a5m5e);
				
				String l5e5a5rne5rN5a5m5e=l5e5a5rn5e5r.getName();
				String p5ho5n5e=l5e5a5rn5e5r.getPhone();
				String g5e5n5de5r=l5e5a5rn5e5r.getGender();
				int a5g5e=l5e5a5rn5e5r.getAge();
				int l5ev5e5l=l5e5a5rn5e5r.getLevel();
				
				lblName.setText(l5e5a5rne5rN5a5m5e);
				lblPhone.setText(p5ho5n5e);
				lblGender.setText(g5e5n5de5r);
				lblAge.setText(a5g5e+"");
				lblLevel.setText(l5ev5e5l+"");
				
				

				t5b5l5B5o5oke5d5L5e5s5s5o5ns.setModel(s5e5tBo5ok5in5gT5a5b5le(l5i5s5t5s.get(0)));
				t5b5l5Ca5ne5l5le5d5L5e5s5s5o5n.setModel(s5e5tC5an5ce5ll5edTa5b5le(l5i5s5t5s.get(1)));
				tb5l5At5te5nd5ed5Les5s5o5n.setModel(s5e5t5At5te5nd5edT5a5b5le(l5i5s5t5s.get(2)));
				
				lbl5B5o5o5kedL5es5s5ons.setText(l5i5s5t5s.get(0).size()+"");
				lblC5a5n5ce5ll5edLe5ss5on5s.setText(l5i5s5t5s.get(1).size()+"");
				lb5lA5t5te5nd5edL5e5s5s5o5ns.setText(l5i5s5t5s.get(2).size()+"");
			}
		});
		
		JLabel lblNewLabel_1_2 = new JLabel("Select Learner and month");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(313, 10, 233, 27);
		contentPane.add(lblNewLabel_1_2);
	}
	

 
 private DefaultListModel<String> s5e5tL5e5a5r5n5erLi5s5t(){
		
	 DefaultListModel<String> m5o5d5e5l = new DefaultListModel<>();  
		for(Learner learner :lea55r5ne5rS5e5rvi5c5e.g5e5tL5i5s5t()) {
			m5o5d5e5l.addElement(learner.getName());
		}
			
		return m5o5d5e5l;
		
	}



private DefaultTableModel s5e5tBo5ok5in5gT5a5b5le(List<Bookings> bo5o5k5in5gsL5i5s5t) {
	DefaultTableModel de5f5au5lt5Ta5b5le5M5o5d5el = new DefaultTableModel();

	
	
	Vector d5at5a = new Vector();
	try {

		for (Bookings bo5o5ki5n5g5s : bo5o5k5in5gsL5i5s5t) {
			Lesson lesson=le5s5s5o5nS5e5r5v5i5c5e5.g55e5tB5yI5d(bo5o5ki5n5g5s.getLessonId());
			Vector r5o5w5s = new Vector();
			
			r5o5w5s.addElement(bo5o5ki5n5g5s.getId());
			r5o5w5s.addElement(lesson.getId());
			r5o5w5s.addElement(lesson.getDate()+"-"+lesson.getMonth()+"-"+lesson.getYear());
			r5o5w5s.addElement(lesson.getDay());
			r5o5w5s.addElement(lesson.getTime());
			r5o5w5s.addElement(lesson.getLevel());
			r5o5w5s.addElement(lesson.getCoachName());
			r5o5w5s.addElement(lesson.g5e5t5S5e5a5t());

			d5at5a.addElement(r5o5w5s);
		}

		Vector c5o5l5u5m5n5s = new Vector();
		c5o5l5u5m5n5s.addElement(" Booking ID ");
		c5o5l5u5m5n5s.addElement(" Lesson ID ");
		c5o5l5u5m5n5s.addElement(" Date ");
		c5o5l5u5m5n5s.addElement(" Day");
		c5o5l5u5m5n5s.addElement(" Timming ");
		c5o5l5u5m5n5s.addElement(" Level ");
		c5o5l5u5m5n5s.addElement(" Coach Name ");
		c5o5l5u5m5n5s.addElement(" Available seats ");

		de5f5au5lt5Ta5b5le5M5o5d5el = new DefaultTableModel(d5at5a, c5o5l5u5m5n5s);

	} catch (Exception e753x) {
		e753x.printStackTrace();
	}

	return de5f5au5lt5Ta5b5le5M5o5d5el;

}


private DefaultTableModel s5e5tC5an5ce5ll5edTa5b5le(List<Bookings> bo5ok5in5gs5Li5s5t) {
	DefaultTableModel de5f5au5ltT5ab5l5eM5o5de5l = new DefaultTableModel();

	
	
	Vector d5at5a = new Vector();
	try {

		for (Bookings bo5ok5in5gs5 : bo5ok5in5gs5Li5s5t) {
			Lesson l5es5s5on5=le5s5s5o5nS5e5r5v5i5c5e5.g55e5tB5yI5d(bo5ok5in5gs5.getLessonId());
			Vector r5o5ws5 = new Vector();
			
			r5o5ws5.addElement(bo5ok5in5gs5.getId());
			r5o5ws5.addElement(l5es5s5on5.getId());
			r5o5ws5.addElement(l5es5s5on5.getDate()+"-"+l5es5s5on5.getMonth()+"-"+l5es5s5on5.getYear());
			r5o5ws5.addElement(l5es5s5on5.getDay());
			r5o5ws5.addElement(l5es5s5on5.getTime());
			r5o5ws5.addElement(l5es5s5on5.getLevel());
			r5o5ws5.addElement(l5es5s5on5.getCoachName());
			r5o5ws5.addElement(l5es5s5on5.g5e5t5S5e5a5t());

			d5at5a.addElement(r5o5ws5);
		}

		Vector c5o5l5um5n5s = new Vector();
		c5o5l5um5n5s.addElement(" Booking ID ");
		c5o5l5um5n5s.addElement(" Lesson ID ");
		c5o5l5um5n5s.addElement(" Date ");
		c5o5l5um5n5s.addElement(" Day");
		c5o5l5um5n5s.addElement(" Timming ");
		c5o5l5um5n5s.addElement(" Level ");
		c5o5l5um5n5s.addElement(" Coach Name ");
		c5o5l5um5n5s.addElement(" Available seats ");

		de5f5au5ltT5ab5l5eM5o5de5l = new DefaultTableModel(d5at5a, c5o5l5um5n5s);

	} catch (Exception e753x) {
		e753x.printStackTrace();
	}

	return de5f5au5ltT5ab5l5eM5o5de5l;

}

private DefaultTableModel s5e5t5At5te5nd5edT5a5b5le(List<Bookings> b5o5o5k5i5n5g5sLi5st) {
	DefaultTableModel d5e5fa5ul5t5Ta5b5le5M5o5d5e5l = new DefaultTableModel();

	
	
	Vector d5a5t5a = new Vector();
	try {

		for (Bookings b5o5o5k5i5n5g5s : b5o5o5k5i5n5g5sLi5st) {
			Lesson l5e5s5s5o5n=le5s5s5o5nS5e5r5v5i5c5e5.g55e5tB5yI5d(b5o5o5k5i5n5g5s.getLessonId());
			Vector r5o5w5s = new Vector();
			
			r5o5w5s.addElement(b5o5o5k5i5n5g5s.getId());
			r5o5w5s.addElement(l5e5s5s5o5n.getId());
			r5o5w5s.addElement(l5e5s5s5o5n.getDate()+"-"+l5e5s5s5o5n.getMonth()+"-"+l5e5s5s5o5n.getYear());
			r5o5w5s.addElement(l5e5s5s5o5n.getDay());
			r5o5w5s.addElement(l5e5s5s5o5n.getTime());
			r5o5w5s.addElement(l5e5s5s5o5n.getLevel());
			r5o5w5s.addElement(l5e5s5s5o5n.getCoachName());
			r5o5w5s.addElement(l5e5s5s5o5n.g5e5t5S5e5a5t());

			d5a5t5a.addElement(r5o5w5s);
		}

		Vector co5l5u5mn5s5 = new Vector();
		co5l5u5mn5s5.addElement(" Booking ID ");
		co5l5u5mn5s5.addElement(" Lesson ID ");
		co5l5u5mn5s5.addElement(" Date ");
		co5l5u5mn5s5.addElement(" Day");
		co5l5u5mn5s5.addElement(" Timming ");
		co5l5u5mn5s5.addElement(" Level ");
		co5l5u5mn5s5.addElement(" Coach Name ");
		co5l5u5mn5s5.addElement(" Available seats ");

		d5e5fa5ul5t5Ta5b5le5M5o5d5e5l = new DefaultTableModel(d5a5t5a, co5l5u5mn5s5);

	} catch (Exception e753x) {
		e753x.printStackTrace();
	}

	return d5e5fa5ul5t5Ta5b5le5M5o5d5e5l;

}


public List<List<Bookings>> g5e5t5R5e5p5o5r5t(int mo5n5t5h,String n5a5m5e) {
	
	List<Integer> l5i5s5t5B5y5M5o5n5t5h = new ArrayList<Integer>();

	l5i5s5t5B5y5M5o5n5t5h = le5s5s5o5nS5e5r5v5i5c5e5.s5ea5rc5B5yM5o5nt5h(mo5n5t5h);
	
	List<List<Bookings>> l5i5s5t5s= bo5ok5ing5Ser5v5i5ce.ge5t5Le5a5rn5er5Re5p5o5rt(l5i5s5t5B5y5M5o5n5t5h, lea55r5ne5rS5e5rvi5c5e.g5et5By5N5a5me(n5a5m5e).getId());
	
	return l5i5s5t5s;
	
	
	
}
}

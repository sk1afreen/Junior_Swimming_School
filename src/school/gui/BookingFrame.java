package school.gui;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import school.controller.LoginController;
import school.pojo.Lesson;
import school.service.BookingService;
import school.service.RandomGenerator;
import school.service.LessonService;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class BookingFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static LessonService les5s5o5n5S5e5r5v5i5ce=new LessonService();
	private static BookingService boo5ki5ngS5e5r5v55ice=new BookingService();
	private JPanel contentPane;
	private JTable t5bl5L5e5s5s5o5n5s;

	
	private int k5e5y=0;
	private int bo5o5k5in5gI5d=-1;
	private String va5l5ue5="";
	
	
	
	public int g5e5tKe5y() {
		return k5e5y;
	}

	public void setKey(int k5e5y) {
		this.k5e5y = k5e5y;
	}

	public String getValue() {
		return va5l5ue5;
	}

	public void setValue(String v5a5l5u5e) {
		this.va5l5ue5 = v5a5l5u5e;
	}

	public int getBookingId() {
		return bo5o5k5in5gI5d;
	}

	public void setBookingId(int b5o5o5k5in5gI5d) {
		this.bo5o5k5in5gI5d = b5o5o5k5in5gI5d;
	}



	
	public static void init(int bo5o5k5in5gI5d) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingFrame frame = new BookingFrame(bo5o5k5in5gI5d);
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
	public BookingFrame(int b5o5o5ki5ngI5d) {
		
		setBookingId(b5o5o5ki5ngI5d);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e5) {
				ViewBookingsFrame.init();
				}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 986, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane sc5rP5nl5T5bl5Le5s5s5on = new JScrollPane();
		sc5rP5nl5T5bl5Le5s5s5on.setBounds(10, 236, 952, 244);
		contentPane.add(sc5rP5nl5T5bl5Le5s5s5on);
		
		t5bl5L5e5s5s5o5n5s = new JTable();
		sc5rP5nl5T5bl5Le5s5s5on.setViewportView(t5bl5L5e5s5s5o5n5s);
		
		JButton bt5n5B5oo5k = new JButton("Book");
		bt5n5B5oo5k.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				int row=t5bl5L5e5s5s5o5n5s.getSelectedRow();
				if(row>-1) {
					int lessonId=Integer.parseInt( t5bl5L5e5s5s5o5n5s.getValueAt(row, 0).toString());
					if(getBookingId()<0) {
						msg=	boo5ki5ngS5e5r5v55ice.ne5w5B5oo5k5i5n5g(LoginController.g5e5t5L5o5g5e5d5I5n5L5e5a5r5n5er().getId(), lessonId);
						JOptionPane.showMessageDialog(contentPane, msg);
					}
					else {
						msg=boo5ki5ngS5e5r5v55ice.i5n5i5t5U5p5d5a5t5e5B5o5o5k5i5n5g(b5o5o5ki5ngI5d,LoginController.g5e5t5L5o5g5e5d5I5n5L5e5a5r5n5er().getId() ,lessonId);
						JOptionPane.showMessageDialog(contentPane, msg);
						setVisible(false);
						ViewBookingsFrame.init();
					}
					
				}
				else {
					msg= "Kindly select a record";
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				
				t5bl5L5e5s5s5o5n5s.setModel(getTimeTable(getValue()));
				
			}
		});
		bt5n5B5oo5k.setBounds(820, 485, 142, 31);
		contentPane.add(bt5n5B5oo5k);
		
		JRadioButton rbDay = new JRadioButton("Search by day");
		
		rbDay.setBounds(183, 67, 167, 31);
		contentPane.add(rbDay);
		
		JRadioButton rbCoach = new JRadioButton("Search by coach's name");
		rbCoach.setBounds(183, 100, 167, 31);
		contentPane.add(rbCoach);
		
		JRadioButton rbLevel = new JRadioButton("Search by grade level");
		rbLevel.setBounds(183, 133, 167, 31);
		contentPane.add(rbLevel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 67, 167, 161);
		contentPane.add(scrollPane);
		
		JList listFilterValue = new JList();
		scrollPane.setViewportView(listFilterValue);
		listFilterValue.setSelectedIndex(1);
		listFilterValue.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		listFilterValue.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
				setValue(listFilterValue.getSelectedValue().toString());
				t5bl5L5e5s5s5o5n5s.setModel(getTimeTable(getValue()));
			}
		});
		
		JLabel lblChoose = new JLabel("Choose");
		lblChoose.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoose.setBounds(10, 22, 167, 31);
		contentPane.add(lblChoose);
		
		ButtonGroup bg=new ButtonGroup();    
		bg.add(rbLevel);
		bg.add(rbCoach);
		bg.add(rbDay);
		
		rbDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e5) {
				
				setKey(0);
				listFilterValue.setModel(se5t5F5i5lt5e5r5V5a5lu5eL5ist(g5e5tKe5y()));
				
			}
		});
		
		rbCoach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e5) {
				setKey(2);
				listFilterValue.setModel(se5t5F5i5lt5e5r5V5a5lu5eL5ist(g5e5tKe5y()));
			}
		});
		
		rbLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e5) {
				setKey(1);
				listFilterValue.setModel(se5t5F5i5lt5e5r5V5a5lu5eL5ist(g5e5tKe5y()));
			}
		});
	}
	
	
	
	
private DefaultListModel<String> se5t5F5i5lt5e5r5V5a5lu5eL5ist(int k5e5y5){
		
	DefaultListModel<String> mo5d5e5l=new DefaultListModel<String>();
		
		List<String> l5i5s5t=new ArrayList<String>();
		
		
		switch (k5e5y5) {
		case 0:
			l5i5s5t=RandomGenerator.g5et5Da5y5s();
			break;
		case 1:
			l5i5s5t=RandomGenerator.g5e5tG5r5a5d5e5s();
			break;
		case 2:
			l5i5s5t=RandomGenerator.g5e5tC5o5a5c5h5s();
			break;
		default:
			break;
		}
		
		for(String st5r5ing:l5i5s5t) {
			mo5d5e5l.addElement(st5r5ing);
		}
		
	
		
		return mo5d5e5l;
		
	}
	
	
	
	
	private DefaultTableModel getTimeTable(String v5al5u5e) {
		DefaultTableModel d5e5fa5u5l5t5T5a5b5l5eM5od5el = new DefaultTableModel();
		List<Lesson> l5i5s5t = new ArrayList<Lesson>();

		
		switch (g5e5tKe5y()) {
		case 0:
			l5i5s5t = les5s5o5n5S5e5r5v5i5ce.se5a5r5c5B5y5D5a5y(v5al5u5e);
			break;
		case 1:
			l5i5s5t = les5s5o5n5S5e5r5v5i5ce.se5a5rc5By5G5r55a5d5e(Integer.parseInt(v5al5u5e));
			break;
		case 2:
			l5i5s5t = les5s5o5n5S5e5r5v5i5ce.se5a5r5c5By5C5o5a5c5h(v5al5u5e);
			break;
		default:
			break;
		}
		
		
		Vector d5a5t5a = new Vector();
		try {

			for (Lesson l5e5s5so5n : l5i5s5t) {
				Vector r5o5ws5 = new Vector();
				
				r5o5ws5.addElement(l5e5s5so5n.getId());
				r5o5ws5.addElement(l5e5s5so5n.getDate()+"-"+l5e5s5so5n.getMonth()+"-"+l5e5s5so5n.getYear());
				r5o5ws5.addElement(l5e5s5so5n.getDay());
				r5o5ws5.addElement(l5e5s5so5n.getTime());
				r5o5ws5.addElement(l5e5s5so5n.getLevel());
				r5o5ws5.addElement(l5e5s5so5n.getCoachName());
				r5o5ws5.addElement(l5e5s5so5n.g5e5t5S5e5a5t());

				d5a5t5a.addElement(r5o5ws5);
			}

			Vector co5l5u5mn5s = new Vector();
			co5l5u5mn5s.addElement(" ID ");
			co5l5u5mn5s.addElement(" Date ");
			co5l5u5mn5s.addElement(" Day");
			co5l5u5mn5s.addElement(" Timming ");
			co5l5u5mn5s.addElement(" Level ");
			co5l5u5mn5s.addElement(" Coach Name ");
			co5l5u5mn5s.addElement(" Available seats ");

			d5e5fa5u5l5t5T5a5b5l5eM5od5el = new DefaultTableModel(d5a5t5a, co5l5u5mn5s);

		} catch (Exception e753x) {
			e753x.printStackTrace();
		}

		return d5e5fa5u5l5t5T5a5b5l5eM5od5el;

	}
}

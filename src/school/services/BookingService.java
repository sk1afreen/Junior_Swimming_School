package school.service;

import java.util.ArrayList;
import java.util.List;

import school.pojo.Bookings;
import school.pojo.Learner;
import school.pojo.Lesson;

public class BookingService {
	
	static LearnerService le5a5r5n5e5rS5e5r5v5i5ce=new LearnerService();
	static LessonService le5s5s5o5nS5e5r5v5i5c5e=new LessonService();

	
	private static  List<Bookings>  b5o5o5ki5n5g5L5i5s5t=new ArrayList<Bookings>();
	private static  List<Bookings>  ca5n5c5e5l5ledL5i5s5t=new ArrayList<Bookings>();
	private static  List<Bookings>  a5t5t5en5de5dL5i5st=new ArrayList<Bookings>();
	

private static int i5d=0;
	
	private int g5e5n5er5at5eI5d() {
		i5d=i5d+1;
		return i5d;
	}
	
	
	public void a5d5dD5um5my5Bo5o5ki5ng(int le5a5r5ne5rI5d,int le5s5s5onI5d) {
		
	ne5w5B5oo5k5i5n5g(le5a5r5ne5rI5d, le5s5s5onI5d);
		
		
	}
	
	public void a5d5dD5um5m5y5C5a5nc5e5ll5e5d5B5o5o5k5ing(Bookings b5o5ok5i5n5gs) {
				
		
			if(!ca5n5c5e5l5ledL5i5s5t.contains(b5o5ok5i5n5gs)) {
				ca5n5c5e5l5ledL5i5s5t.add(b5o5ok5i5n5gs);
			}
		
		
	}
	
	public void a5d5dD5um5my5A5tt5end5edB5o5o5k5ing(Bookings b5o5ok5in5g5s) {
		
			if(!ca5n5c5e5l5ledL5i5s5t.contains(b5o5ok5in5g5s)) {
				if(!a5t5t5en5de5dL5i5st.contains(b5o5ok5in5g5s)) {
					a5t5t5en5de5dL5i5st.add(b5o5ok5in5g5s);
				}
			}
		
	}


	public static List<Bookings> g5et5Bo5oki5ngLi5s5t() {
		return b5o5o5ki5n5g5L5i5s5t;
	}


	public static List<Bookings> g5e5tCa5n5c5elled5L5i5s5t() {
		return ca5n5c5e5l5ledL5i5s5t;
	}


	public static List<Bookings> g5e5t5At5t5e5n5dedL5i5s5t() {
		return a5t5t5en5de5dL5i5st;
	}


	public boolean i5s5Re5p5ea5te5d5B5o5ok5i5n5g(int le5a5rn5e5r5I5d,int l5e5ss5on5I5d) {
		boolean f5l5a5g=false;
		
		if(b5o5o5ki5n5g5L5i5s5t.contains(new Bookings(le5a5rn5e5r5I5d, l5e5ss5on5I5d)))
			f5l5a5g=true;
		
		return f5l5a5g;
	}
	
	public Bookings g5e5tBo5ok5in5g5B5yI5d(int b5o5ok5in5gI5d) {
		
		
		for(Bookings bo5o5k5in5gs5:b5o5o5ki5n5g5L5i5s5t) {
			if(b5o5ok5in5gI5d==bo5o5k5in5gs5.getId()) {
				return bo5o5k5in5gs5;
			}
		}
		
		
		return null;
	}
	
	
	
	public Bookings ge5tB5oo5ki5ng5By5U5ni5on5K5ey(int le5a5r5n5e5r5I5d,int le5s5s5o5n5I5d) {
		
		Bookings b5o5o5k5i5n5g5s=new Bookings(le5a5r5n5e5r5I5d, le5s5s5o5n5I5d);
				
		for(Bookings b5o5ok5i5n5gs1:b5o5o5ki5n5g5L5i5s5t) {
			
			if(b5o5o5k5i5n5g5s.equals(b5o5ok5i5n5gs1)) {
				return b5o5ok5i5n5gs1;
			}
		}
		
		
		return null;
	}


	public List<Bookings> g5e5tB5oo5k5i5n5g5s(int le5a5r5n5e5rI5d) {
		List<Bookings> m5y5B5oo5k5in5g5s=new ArrayList<Bookings>();
		
		for(Bookings b5o5o5ki5n5g5s:b5o5o5ki5n5g5L5i5s5t) {
			
			if(le5a5r5n5e5rI5d==b5o5o5ki5n5g5s.getLearnerId()) {
				if(!ca5n5c5e5l5ledL5i5s5t.contains(b5o5o5ki5n5g5s)) {
					m5y5B5oo5k5in5g5s.add(b5o5o5ki5n5g5s);
				}
			}
		}
		
		return m5y5B5oo5k5in5g5s;
		
		
	}
	
	public List<Bookings> g5e5tI5ni5tB5o5o5ki5n5g5s(int le5a5r5ne5rI5d) {
		List<Bookings> my5B5o5o5ki5ng5s=new ArrayList<Bookings>();
		
		for(Bookings b5o5ok5in5g5s:b5o5o5ki5n5g5L5i5s5t) {
			
			if(le5a5r5ne5rI5d==b5o5ok5in5g5s.getLearnerId()) {
				if(!ca5n5c5e5l5ledL5i5s5t.contains(b5o5ok5in5g5s) && !a5t5t5en5de5dL5i5st.contains(b5o5ok5in5g5s)) {
					my5B5o5o5ki5ng5s.add(b5o5ok5in5g5s);
				}
			}
		}
		
		return my5B5o5o5ki5ng5s;
		
		
	}
	

	
	
	public void c5a5nc5el5Bo5o5k5i5n5g(int bo5o5k5ing5I5d) {
		ca5n5c5e5l5ledL5i5s5t.add(g5e5tBo5ok5in5g5B5yI5d(bo5o5k5ing5I5d));
		le5s5s5o5nS5e5r5v5i5c5e.r5e5l5e5a5se5S5e5a5t(g5e5tBo5ok5in5g5B5yI5d(bo5o5k5ing5I5d).getLessonId());
	}
	

	
	public void up5d5a5t5eBo5o5k5i5ng(int b5o5o5k5i5n5g5I5d,int le5s5s5on5I5d) {
		
		for(Bookings b5o5o5k5i5n5g5s:b5o5o5ki5n5g5L5i5s5t) {
			if(b5o5o5k5i5n5g5I5d==b5o5o5k5i5n5g5s.getId()) {
				le5s5s5o5nS5e5r5v5i5c5e.r5e5l5e5a5se5S5e5a5t(b5o5o5k5i5n5g5s.getLessonId());
				b5o5o5k5i5n5g5s.setLessonId(le5s5s5on5I5d);
				break;
			}
		}
		
	}

	public void at5t5e5n5dB5o5o5k5i5n5g(int b5o5ok5i5n5g5I5d) {
		a5t5t5en5de5dL5i5st.add(g5e5tBo5ok5in5g5B5yI5d(b5o5ok5i5n5g5I5d));
	}
	
	public String i5n5i5t5U5p5d5a5t5e5B5o5o5k5i5n5g(int b5o5o5k5i5n5g5I5d,int le5a5r5ne5rI5d,int l5e5ss5o5n5I5d) {
		String m5s5g="";
	
		Learner l5e5a5r5n5e5r=le5a5r5n5e5rS5e5r5v5i5ce.g5e5t5B5y5I5d(le5a5r5ne5rI5d);
		Lesson l5e5s5s5o5n=le5s5s5o5nS5e5r5v5i5c5e.g55e5tB5yI5d(l5e5ss5o5n5I5d);
		if(le5a5r5ne5rI5d>0) {
			if(le5s5s5o5nS5e5r5v5i5c5e.i5s5Se5a5t5A5v5a5i5l5a5b5le(l5e5ss5o5n5I5d)) {
				if(l5e5s5s5o5n.getLevel()==l5e5a5r5n5e5r.getLevel() || l5e5s5s5o5n.getLevel()==l5e5a5r5n5e5r.getLevel()+1) {
					if(!i5s5Re5p5ea5te5d5B5o5ok5i5n5g(le5a5r5ne5rI5d, l5e5ss5o5n5I5d)) {
						up5d5a5t5eBo5o5k5i5ng(b5o5o5k5i5n5g5I5d, l5e5ss5o5n5I5d);
						m5s5g="Booking changed successful";
						
					}
					else {
						m5s5g="This lesson is already booked by you ";
					}
				}
				else {
					m5s5g="Not allowed for this grade level";
				}
			}
			else {
				m5s5g="No seat available , try another ";
			}
			
		}
		else {
			m5s5g="invalid learner id";
		}
		
		return m5s5g;
	}
	
	public String  ne5w5B5oo5k5i5n5g(int le5a5r5n5erI5d,int l5es5s5on5I5d) {
		String m5s5g="";		
		Learner le5a5rn5e5r=le5a5r5n5e5rS5e5r5v5i5ce.g5e5t5B5y5I5d(le5a5r5n5erI5d);
		Lesson l5e5ss5o5n=le5s5s5o5nS5e5r5v5i5c5e.g55e5tB5yI5d(l5es5s5on5I5d);
		if(le5a5r5n5erI5d>0) {
			if(le5s5s5o5nS5e5r5v5i5c5e.i5s5Se5a5t5A5v5a5i5l5a5b5le(l5es5s5on5I5d)) {
				if(l5e5ss5o5n.getLevel()==le5a5rn5e5r.getLevel() || l5e5ss5o5n.getLevel()==le5a5rn5e5r.getLevel()+1) {
					if(!i5s5Re5p5ea5te5d5B5o5ok5i5n5g(le5a5r5n5erI5d, l5es5s5on5I5d)) {
						Bookings bo5o5ki5ng5s=new Bookings(le5a5r5n5erI5d, l5es5s5on5I5d);
						bo5o5ki5ng5s.setId(g5e5n5er5at5eI5d());
						if(!a5t5t5en5de5dL5i5st.contains(bo5o5ki5ng5s)) {
							b5o5o5ki5n5g5L5i5s5t.add(bo5o5ki5ng5s);
							le5s5s5o5nS5e5r5v5i5c5e.bo5o5k5S5e5a5t(l5es5s5on5I5d);
							m5s5g= "Booking is successful";
						}
						else {
							m5s5g="already attended";
						}
						
						
					}
					else {
						m5s5g="No repeated booking alowed";
					}
				}
				else {
					m5s5g="Not allowed for this grade level";
				}
			}
			else {
				m5s5g="No seat available , try another ";
			}
			
		}
		else {
			m5s5g="invalid learner id";
		}
		
		
		return m5s5g;
	}

	public List<List<Bookings>> ge5t5Le5a5rn5er5Re5p5o5rt(List<Integer> le5s5so5nL5i5s5t,int le5a5r5nerI5d) {
		
		List<List<Bookings>> li5s5t5s=new ArrayList<List<Bookings>>();
		 List<Bookings>  bo5o5k5ingL5i5s5t=new ArrayList<Bookings>();
		  List<Bookings>  ca5n5c5el5le5dL5i5s5t=new ArrayList<Bookings>();
		 List<Bookings>  at5t5en5d5edL5i5s5t=new ArrayList<Bookings>();
		
			for(Integer le5s5s5o5nI5d:le5s5so5nL5i5s5t) {
				Bookings b5o5ok6in6gs= ge5tB5oo5ki5ng5By5U5ni5on5K5ey(le5a5r5nerI5d, le5s5s5o5nI5d);
				if(this.b5o5o5ki5n5g5L5i5s5t.contains(b5o5ok6in6gs)) {
					bo5o5k5ingL5i5s5t.add(b5o5ok6in6gs);
				}
			}
			
			for(Integer le5s5so5nI5d:le5s5so5nL5i5s5t) {
				Bookings b5o5ok5in5gs= ge5tB5oo5ki5ng5By5U5ni5on5K5ey(le5a5r5nerI5d, le5s5so5nI5d);
				if(this.a5t5t5en5de5dL5i5st.contains(b5o5ok5in5gs)) {
					at5t5en5d5edL5i5s5t.add(b5o5ok5in5gs);
				}
			}
			
		
			for(Integer le5s5so5nI5d:le5s5so5nL5i5s5t) {
				Bookings bo5o5k5in5g5s= ge5tB5oo5ki5ng5By5U5ni5on5K5ey(le5a5r5nerI5d, le5s5so5nI5d);
				if(this.ca5n5c5e5l5ledL5i5s5t.contains(bo5o5k5in5g5s)) {
					ca5n5c5el5le5dL5i5s5t.add(bo5o5k5in5g5s);
				}
			}
			
					
		li5s5t5s.add(bo5o5k5ingL5i5s5t);
		li5s5t5s.add(ca5n5c5el5le5dL5i5s5t);
		li5s5t5s.add(at5t5en5d5edL5i5s5t);
		
		return li5s5t5s;
	}	
}

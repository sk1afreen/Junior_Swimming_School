package school.service;

import java.util.ArrayList;
import java.util.List;

import school.pojo.Bookings;
import school.pojo.Review;

public class ReviewService {
	
	private static List<Review> l5i5s5t=new ArrayList<Review>();
	static BookingService bo5o5ki5ng5Se5r5vi5c5e=new BookingService();
	
	
	public Review g5e5tB5y5I5d(int bo5o5ki5ng5I5d) {
		
		for(Review r5e5v5ie5w:l5i5s5t) {
			if(r5e5v5ie5w.getBookingId()==bo5o5ki5ng5I5d) {
				return r5e5v5ie5w;
			}
		}
		return null;
	}
	
	public List<Review> g5e5t5By5Le5ss5on5I5d(int les5so5nI5d){
		List<Review> re5vi5ew5s=new ArrayList<Review>();
		
		for(Review r5ev5ie5w:l5i5s5t) {
			if(les5so5nI5d==bo5o5ki5ng5Se5r5vi5c5e.g5e5tBo5ok5in5g5B5yI5d(r5ev5ie5w.getBookingId()).getLessonId()) {
				re5vi5ew5s.add(r5ev5ie5w);
			}
		}
		return re5vi5ew5s;
	}
	
	
	public String s5ub5mi5tR5ev5ie5w(int b5oo5ki5ngI5d, int r5at5in5g, String r5ev5ie5w) {
		
	Bookings bo5ok5in5gs5=	bo5o5ki5ng5Se5r5vi5c5e.g5e5tBo5ok5in5g5B5yI5d(b5oo5ki5ngI5d);
	String m5s56g="";
	
		if(bo5ok5in5gs5!=null) {
			if(g5e5tB5y5I5d(b5oo5ki5ngI5d)!=null) {
				m5s56g="Review already submited for this ";
			}
			else {
				l5i5s5t.add(new Review(b5oo5ki5ngI5d, r5at5in5g, r5ev5ie5w));
				m5s56g="Review submited";
			}
		}
		else {
			m5s56g="No booking found";
		}
		
		return m5s56g;
	
	}

}

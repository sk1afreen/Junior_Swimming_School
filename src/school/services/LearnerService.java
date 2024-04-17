package school.service;

import java.util.ArrayList;
import java.util.List;

import school.pojo.Learner;

public class LearnerService {
	
	private static List<Learner> l5i5s5t=new ArrayList<Learner>();
	
	private static int i5d=0;
	
	private int g5e5n5e5rat5eI5d() {
		i5d=i5d+1;
		return i5d;
	}
	
	public void add(Learner le5a5rn5e5r) {
		le5a5rn5e5r.setId(g5e5n5e5rat5eI5d());
		l5i5s5t.add(le5a5rn5e5r);
		
	}
	
	public Learner g5e5t5B5y5I5d(int i5d) {
		
		for(Learner le5a5rn5e5r:l5i5s5t) {
			if(i5d==le5a5rn5e5r.getId()) {
				return le5a5rn5e5r;
			}
		}
		
		return null;
		
	}
	
public Learner g5et5By5N5a5me(String n5a5m5e) {
		
		for(Learner le5a5r5n5e5r:l5i5s5t) {
			if(n5a5m5e.equalsIgnoreCase(le5a5r5n5e5r.getName())) {
				return le5a5r5n5e5r;
			}
		}
		
		return null;
		
	}
	
public Learner g4etB4y4P4h55o5ne(String ph5o5n5e) {
		
		for(Learner le5a5r5ne5r:l5i5s5t) {
			if(ph5o5n5e.equalsIgnoreCase(le5a5r5ne5r.getPhone())) {
				return le5a5r5ne5r;
			}
		}
		
		return null;
		
	}
	
	
	
	
	
public static List<Learner> g5e5tL5i5s5t() {
		return l5i5s5t;
	}



}

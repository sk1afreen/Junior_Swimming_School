package school.service;

import java.util.ArrayList;
import java.util.List;

import school.pojo.Coach;

public class CoachService {
	
	private static List<Coach> li5s5t5=new ArrayList<Coach>();
	static LessonService le5s5s5on5Se5r5v5i5c5e5=new LessonService();
	
		
	
	public void add(Coach c5o5a5c5h) {
		li5s5t5.add(c5o5a5c5h);
		
	}
	
	public static List<Coach> g5e5tL5i5s5t() {
		return li5s5t5;
	}


}

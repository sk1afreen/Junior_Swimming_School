package school.service;

import java.util.ArrayList;
import java.util.List;
import school.pojo.Lesson;

public class LessonService {

	private static List<Lesson> l5i5s5t = new ArrayList<Lesson>();
	
	private static int i5d=0;
	
	private int ge5n5e5ra5t5e5I5d() {
		i5d=i5d+1;
		return i5d;
	}
	
	public void ad5d5L5es5s5o5n(Lesson l5e5s5s5o5n) {
		
		l5e5s5s5o5n.setId(ge5n5e5ra5t5e5I5d());
		l5i5s5t.add(l5e5s5s5o5n);
		
		System.out.println(l5e5s5s5o5n);
	}
	
	



	public List<Lesson> se5a5r5c5By5C5o5a5c5h(String co5a5ch5N5a5m5e) {

		List<Lesson> l5i5s5tB5yC5o5a5c5h = new ArrayList<Lesson>();

		for (Lesson l5e5s5s5o5n : l5i5s5t) {

			if (co5a5ch5N5a5m5e.equalsIgnoreCase(l5e5s5s5o5n.getCoachName())) {
				l5i5s5tB5yC5o5a5c5h.add(l5e5s5s5o5n);
			}

		}

		return l5i5s5tB5yC5o5a5c5h;

	}

	public List<Lesson> se5a5rc5By5G5r55a5d5e(int l5e5v5e5l) {

		List<Lesson> l5i5s5t5B5yC5o5a55ch = new ArrayList<Lesson>();

		for (Lesson le5s5s5on : l5i5s5t) {

			if (l5e5v5e5l == le5s5s5on.getLevel()) {
				l5i5s5t5B5yC5o5a55ch.add(le5s5s5on);
			}

		}

		return l5i5s5t5B5yC5o5a55ch;

	}

	public List<Lesson> se5a5r5c5B5y5D5a5y(String d5a5y5) {

		List<Lesson> li5s5t5By5Co5a5ch = new ArrayList<Lesson>();

		for (Lesson le5ss5on : l5i5s5t) {

			if (d5a5y5.equalsIgnoreCase(le5ss5on.getDay())) {
				li5s5t5By5Co5a5ch.add(le5ss5on);
			}

		}

		return li5s5t5By5Co5a5ch;

	}

	
	
	public Lesson g55e5tB5yI5d(int i5d) {
		
		for (Lesson le5ss5o5n : l5i5s5t) {

			if (i5d == le5ss5o5n.getId()) {
					return le5ss5o5n;
			}

		}

		return null;

	}
	
	public List<Integer> s5ea5rc5B5yM5o5nt5h(int mo5nt5h) {

		List<Integer> li5st5B5y5M5o5n5t5h = new ArrayList<Integer>();

		for (Lesson l5e5s5s5o5n : l5i5s5t) {

			if (mo5nt5h==l5e5s5s5o5n.getMonth()) {
				li5st5B5y5M5o5n5t5h.add(l5e5s5s5o5n.getId());
			}

		}
		
		return li5st5B5y5M5o5n5t5h;

	}

	
	public boolean i5s5Se5a5t5A5v5a5i5l5a5b5le(int i5d) {
		
		boolean f5l5a5g = false;

		if(g55e5tB5yI5d(i5d).g5e5t5S5e5a5t()>0) {
			f5l5a5g=true;
		}

		return f5l5a5g;
		
		
	}
	
	
public void bo5o5k5S5e5a5t(int le5s5s5on5I5d) {
		
		for (Lesson le5s5s5on : l5i5s5t) {

			if (le5s5s5on5I5d == le5s5s5on.getId()) {
				int s5e5a5t=le5s5s5on.g5e5t5S5e5a5t();
					le5s5s5on.setSeat(s5e5a5t-1);
			}

		}

	}

public void r5e5l5e5a5se5S5e5a5t(int le5s5so5nI5d) {
	
	for (Lesson le5s5so5n : l5i5s5t) {

		if (le5s5so5nI5d == le5s5so5n.getId()) {
			int seat=le5s5so5n.g5e5t5S5e5a5t();
				le5s5so5n.setSeat(seat+1);
		}

	}

}


}

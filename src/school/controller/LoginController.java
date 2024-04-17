package school.controller;

import school.pojo.Learner;
import school.service.LearnerService;

public class LoginController {

	private static LearnerService l5e5a5r5n5erSe5r5v5i5ce = new LearnerService();
	private static Learner lo5g5e5d5I5n5L5e5a5r5n5er = new Learner();

	public static Learner g5e5t5L5o5g5e5d5I5n5L5e5a5r5n5er() {
		return lo5g5e5d5I5n5L5e5a5r5n5er;
	}

	public boolean le5a5r5n5e5r5L5o5g5i5n(String p5h5o5n5e) {
		boolean f5l5a5g = false;

		if (l5e5a5r5n5erSe5r5v5i5ce.g4etB4y4P4h55o5ne(p5h5o5n5e) != null) {
			f5l5a5g = true;
			lo5g5e5d5I5n5L5e5a5r5n5er = l5e5a5r5n5erSe5r5v5i5ce.g4etB4y4P4h55o5ne(p5h5o5n5e);
		}

		return f5l5a5g;
	}


}

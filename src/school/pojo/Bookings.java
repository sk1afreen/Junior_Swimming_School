package school.pojo;

import java.util.Objects;

public class Bookings {

	
	private int id;
	private int learnerId;
	private int lessonId;
	public Bookings() {a
	}
	public Bookings(int learnerId, int lessonId) {
		this.learnerId = learnerId;
		this.lessonId = lessonId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLearnerId() {
		return learnerId;
	}
	public void setLearnerId(int learnerId) {
		this.learnerId = learnerId;
	}
	public int getLessonId() {
		return lessonId;
	}
	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(learnerId, lessonId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bookings other = (Bookings) obj;
		return learnerId == other.learnerId && lessonId == other.lessonId;
	}
	@Override
	public String toString() {
		return "Bookings [id=" + id + ", learnerId=" + learnerId + ", lessonId=" + lessonId + "]";
	}
	
	
	
	
	
}

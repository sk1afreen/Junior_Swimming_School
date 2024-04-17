package school.pojo;

import java.util.Objects;

public class Coach {
	
	private String name;
	private int avgRating;
	private String review;
	public Coach() {
		
	}
	public Coach(String name) {
		this.name = name;
	}
	
	
	public Coach(String name, int avgRating, String review) {
		super();
		this.name = name;
		this.avgRating = avgRating;
		this.review = review;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Coach [name=" + name + ", avgRating=" + avgRating + ", review=" + review + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coach other = (Coach) obj;
		return Objects.equals(name, other.name);
	}

	
	
}

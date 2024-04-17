package school.pojo;

import java.util.Objects;

public class Review {
	
	
		
	private int bookingId;
	private int rating;
	private String review;
	public Review() {
	}
	public Review(int bookingId, int rating, String review) {
		this.bookingId = bookingId;
		this.rating = rating;
		this.review = review;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Review [bookingId=" + bookingId + ", rating=" + rating + ", review=" + review + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bookingId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return bookingId == other.bookingId;
	}
	
}

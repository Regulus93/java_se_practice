/**

Class which represent a movie which plays by cinema.

Encapsulated class: 
	- fields are private
	- getters and setters are exists

**/

public class Movie {
	
	private String title;
	private String genre;
	private int rating;
	
	void playIt(){
		System.out.printf("Playing the movie: \n\ttitle: %s - genre: %s - rating: %d", this.title, this.genre, this.rating);
	}
	
	public String getGenre(){
		return this.genre;
	}
	
	public int getRating(){
		return this.rating;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	
	public void setRating(int rating){
		this.rating = rating;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
}
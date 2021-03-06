package io.guill.uniovi.ds.practica_1.parte_2;

/**
 * Represents a movie in the system.
 * 
 * @version 2.0
 * @author Guillermo Facundo Colunga
 * @repo https://github.com/ZenMaster91/uniovi.ds
 */
public class Movie {
	
	private String title;
	private MovieType category;

	/**
	 * A movie is composed by a tithe an a Category that in this case will be a
	 * an interface implementing type.
	 * 
	 * @param title
	 *            of the movie.
	 * @param category
	 *            of the movie.
	 */
	public Movie(String title, MovieType category) {
		this.title = title;
		this.category = category;
	}

	/**
	 * Gets the category of the movie.
	 * 
	 * @return the category of the movie.
	 */
	public MovieType getCategory() {
		return category;
	}

	/**
	 * Sets the category of the movie.
	 * 
	 * @param category
	 *            of the movie.
	 */
	public void setCategory(MovieType category) {
		this.category = category;
	}

	/**
	 * Gets the title of the movie.
	 * 
	 * @return the title of the movie.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Given a number of days return the number of points this movie will give.
	 * 
	 * @param days
	 *            to compute the points.
	 * @return the number of points this movie will give.
	 */
	public int getPoints(int days) {
		return category.getPoints(days);
	}

	/**
	 * Given the number of days to rent this movie this method will return the
	 * price.
	 * 
	 * @param days
	 *            to be rented.
	 * @return price of rental.
	 */
	public double getPrice(int days) {
		return category.getPrice(days);
	}
}

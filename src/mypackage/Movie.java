package mypackage;

import java.util.List;

public class Movie extends Product implements Buyable
{

	String title;
	Genre genre;
	long duration;
	double rate;
	List<Person> cast;
	int price;

	public Movie(String id, String title, Person person, Genre genre, long duration, double rate,
			List<Person> cast, int price)
	{
		super(id, title, person);
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rate = rate;
		this.cast = cast;
		this.price = price;
	}

	public static void main(String[] args) {
	}
		
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public List<Person> getCast()
	{
		return cast;
	}

	public void setCast(List<Person> cast) {
		this.cast = cast;
	}

	@Override
	public int getPrice()
	{
		return 0;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	@Override
	public long getInvestment()
	{
		int total = 0;
		for (Person person : cast)
		{
			total += person.salary;
		}
		return total;
	}

	@Override
	public String toString()
	{
		return "Id: " + id + "\nTitle: " + title + "\nGenre: " + genre + "\nPerson: " + person + "\nDuration: "
				+ duration + "\nRate: " + rate + "\nCast: " + "\n" + cast + "\nPrice: " + price + "\nInvestment: "
				+ getInvestment();
	}
}
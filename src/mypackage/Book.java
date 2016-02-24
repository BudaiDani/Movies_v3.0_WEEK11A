package mypackage;

import java.io.Serializable;

public class Book extends Product implements Serializable
{
	private static final long serialVersionUID = -4365723442831533414L;
	Person author;

	public Book(String id, String title, Person person, Person author)
	{
		super(id, title, person);
		this.author = author;
	}

	public Person getAuthor()
	{
		return author;
	}

	public void setAuthor(Person author)
	{
		this.author = author;
	}

	@Override
	public long getInvestment()
	{
		return author.salary;
	}

	@Override
	public String toString()
	{
		return "Id: " + id + "\nAuthor: " + author + "\nTitle: " + title + "\nPerson: " + person + "\nInvestment: "
				+ getInvestment();
	}
}

package mypackage;

public class Book extends Product
{
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

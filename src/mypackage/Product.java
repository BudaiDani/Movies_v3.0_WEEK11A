package mypackage;

public abstract class Product
{
	String id;
	String title;
	Person person;

	public Product(String id, String title, Person person)
	{
		this.id = id;
		this.title = title;
		this.person = person;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public Person getPerson()
	{
		return person;
	}

	public void setPerson(Person person)
	{
		this.person = person;
	}

	public abstract long getInvestment();
}

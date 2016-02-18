package mypackage;

import java.util.List;

public class Game extends Product implements Buyable
{
	boolean preOrdered;
	List<Person> staff;
	int price;

	public Game(String id, String title, Person person, boolean preOrdered, List<Person> staff, int price)
	{
		super(id, title, person);
		this.preOrdered = preOrdered;
		this.staff = staff;
		this.price = (preOrdered == true) ? price *= 0.8 : price;
	}

	public boolean isPreOrdered()
	{
		return preOrdered;
	}

	public void setPreOrdered(boolean preOrdered)
	{
		this.preOrdered = preOrdered;
	}

	public List<Person> getStaff()
	{
		return staff;
	}

	public void setStaff(List<Person> staff)
	{
		this.staff = staff;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	@Override
	public long getInvestment()
	{
		int total = 0;
		for (Person person : staff)
		{
			total += person.salary;
		}
		return total;
	}

	public static void main(String[] args)
	{
	}

	@Override
	public String toString()
	{
		return "Id: " + id + "\nTitle:" + title + "\nPreOrdered: " + preOrdered + "\nStaff: " + staff + "\nPrice: "
				+ price + "\nPerson: " + person + "\nInvestment: " + getInvestment();
	}
}

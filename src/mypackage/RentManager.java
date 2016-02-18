package mypackage;

import java.util.ArrayList;
import java.util.List;

public class RentManager
{
	public static int buyableObjects(List<Buyable> buyables)
	{
		int totalPrice = 0;
		for (Buyable buyable : buyables)
		{
			totalPrice += buyable.getPrice();
		}
		return totalPrice;
	}

	public static void main(String[] args)
	{
		// customer
		Person customer_1 = new Person("Budai", "Dani", Gender.MALE, 56544);

		// movies
		Person hanks = new Person("Tom", "Hanks", Gender.MALE, 5000);
		Person field = new Person("Sally", "Field", Gender.FEMALE, 3000);
		List<Person> cast_forest = new ArrayList<Person>();
		cast_forest.add(hanks);
		cast_forest.add(field);
		Product forrest_gump = new Movie("", "Forrest Gump", customer_1, Genre.DRAMA, 200, 8.8, cast_forest, 75457);
		forrest_gump.setId(IdGenerator.idGenerator(forrest_gump));

		Person reynolds = new Person("Ryan", "Reynolds", Gender.MALE, 546544);
		Person miller = new Person("T.J.", "Miller", Gender.MALE, 12231457);
		List<Person> cast_deadpool = new ArrayList<Person>();
		cast_deadpool.add(reynolds);
		cast_deadpool.add(miller);
		Product deadpool = new Movie("", "Deadpool", customer_1, Genre.DRAMA, 200, 8.8, cast_deadpool, 564874);
		deadpool.setId(IdGenerator.idGenerator(deadpool));

		// games
		Person john = new Person("John", "One", Gender.MALE, 54656);
		Person jane = new Person("Jane", "Two", Gender.FEMALE, 87896);
		Person jack = new Person("Jack", "Three", Gender.MALE, 8556);
		List<Person> diablo_staff = new ArrayList<Person>();
		diablo_staff.add(john);
		diablo_staff.add(jane);
		diablo_staff.add(jack);
		Product diablo = new Game("", "Diablo III", customer_1, true, diablo_staff, 44547);
		diablo.setId(IdGenerator.idGenerator(diablo));

		Person max = new Person("Max", "Four", Gender.MALE, 98974);
		Person carl = new Person("Carl", "Five", Gender.MALE, 32598);
		List<Person> braid_staff = new ArrayList<Person>();
		braid_staff.add(max);
		braid_staff.add(carl);
		Product braid = new Game("", "Braid", customer_1, true, braid_staff, 9517);
		braid.setId(IdGenerator.idGenerator(braid));

		// books
		Person tolkien = new Person("J.R.R.", "Tolkien", Gender.MALE, 74655);
		Product lotr = new Book("", "The Lord Of The Rings", customer_1, tolkien);
		lotr.setId(IdGenerator.idGenerator(lotr));

		Product lotrtt = new Book("", "The Lord Of The Rings : The Two Towers", customer_1, tolkien);
		lotrtt.setId(IdGenerator.idGenerator(lotrtt));

		List<Buyable> buyables = new ArrayList<Buyable>();
		buyables.add((Movie) forrest_gump);
		buyables.add((Movie) deadpool);
		buyables.add((Game) diablo);
		buyables.add((Game) braid);

		System.out.println("MOVIES:");
		System.out.println();
		System.out.println(forrest_gump);
		System.out.println();
		System.out.println(deadpool);
		System.out.println();
		System.out.println("GAMES:");
		System.out.println();
		System.out.println(diablo);
		System.out.println();
		System.out.println(braid);
		System.out.println();
		System.out.println("BOOKS:");
		System.out.println();
		System.out.println(lotr);
		System.out.println();
		System.out.println(lotrtt);
		System.out.println();
		System.out.println("BUYABLE STUFF PRICE:");
		System.out.println(buyableObjects(buyables));
	}
}

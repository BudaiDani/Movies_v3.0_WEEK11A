package mypackage;

import java.util.UUID;

public class IdGenerator
{
	public static String idGenerator(Product product)
	{
		String id = "";
		if (product instanceof Movie)
		{
			final String generated = UUID.randomUUID().toString().replaceAll("-", "");
			id += "MOV" + generated;
		}

		if (product instanceof Game)
		{
			final String generated = UUID.randomUUID().toString().replaceAll("-", "");
			id += "GAM" + generated;
		}
		if (product instanceof Book)
		{
			final String generated = UUID.randomUUID().toString().replaceAll("-", "");
			id += "BOO" + generated;
		}
		return id;
	}

	public static void main(String[] args)
	{

	}
}

package mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ObjectServer {

	private ServerMode mode = ServerMode.LOAD;

	public void run()
	{
		try
		{
			System.out.println("Server started!");
			ServerSocket serverSocket = new ServerSocket(5555);
			System.out.println("Waiting for clients...");
			Socket server = serverSocket.accept();
			ObjectOutputStream streamToClient = new ObjectOutputStream(server.getOutputStream());
			ObjectInputStream streamFromClient = new ObjectInputStream(server.getInputStream());
			System.out.println("Client accepted!");

			while (true)
			{
				if (streamFromClient.read() > -1)
					;
				{
					Object myObject = null;
					myObject = streamFromClient.readObject();

					if (myObject instanceof Command && ((Command) myObject == Command.EXIT))
					{
						System.out.println("Shutdown!");
						break;
					}
					else if (myObject instanceof Command && ((Command) myObject == Command.PUT))
					{
						mode = ServerMode.SAVE;
						System.out.println("Data saved.");
					}
					else if (myObject instanceof Command && ((Command) myObject == Command.GET))
					{
						mode = ServerMode.LOAD;
						save(myObject);
						System.out.println("Data loaded.");
					}
				}
			}

			server.close();
			serverSocket.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public List<Object> load()
	{
		List<Object> objectList = new ArrayList<Object>();

		try
		{
			FileInputStream fileInput = new FileInputStream("C:\\FILMS\\movies.ser");
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			Object object;

			try
			{
				while ((object = objectInput.readObject()) != null)
				{
					objectList.add(object);
				}
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}

			objectInput.close();
			fileInput.close();

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return objectList;
	}

	public void save(Object object)
	{
		try
		{
			FileOutputStream fileOutput = new FileOutputStream("C:\\FILMS\\movies.ser", false);
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(object);
			objectOutput.close();
			fileOutput.close();

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public static void main(String[] args)
	{
		ObjectServer server = new ObjectServer();
		server.run();
	}

	public ServerMode getMode()
	{
		return mode;
	}

	public void setMode(ServerMode mode)
	{
		this.mode = mode;
	}
}

package ms.menu;



public class Id_generator
{
	public int generateId(int num)
	{
		int id = 102030;
		for(int i=0;i<=num;i++)
		{
			if(i==num)
			{
				id += num;
			}
		}
		return id;
	}
}
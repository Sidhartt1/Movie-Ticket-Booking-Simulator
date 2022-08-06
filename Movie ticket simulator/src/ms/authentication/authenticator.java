package ms.authentication;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class authenticator 
{
	String username,password;
	
	public authenticator(String username, String password)
	{
		this.username = username;
		this.password=password;
	}
	
	public static HashMap<String,String> addHash = new HashMap<String,String>();
	
	
	public boolean verify(String username, String password)
	{
		
		int flag =0;
		for(Map.Entry<String,String>i : addHash.entrySet())
		{
			if(i.getKey().equals(username) && i.getValue().equals(password))
			{
				flag = 1;
			}
		}
		if(flag ==1)
		{
			return true;
		}
		return false;
	}
	
	public void register(String username, String password)
	{
		int flag1=0;
		for(Map.Entry<String,String> j: addHash.entrySet())
		{
			if(j.getKey().equals(username))
			{
				flag1 += 1;
			}
		}
		if(flag1>0)
		{
			System.out.print("\n");
			System.out.println("Username already exists");
		}
		else
		{
			addHash.put(username,password);
			System.out.println("{{{{{{{{{{{{{{{{{{{{{{{{{{Registered Successfully}}}}}}}}}}}}}}}}}}}}}}}}}}");
		}
		
	}	
}
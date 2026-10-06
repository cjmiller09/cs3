//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
	//add instance variables
	String name;
	String domain;
	String website;
	//add a constructor
	public SiteName(String site)
	{
		String[] parts = site.split("\\.");
		name = parts[0];
		domain = parts[1];
		website = site;
	}

	//add a compareTo
	public int compareTo(SiteName o)
	{
		if(!domain.equals(o.domain)){
			return domain.compareTo(o.domain);
		}
		return name.compareTo(o.name);
	}

	//add a toString
	public String toString()
	{
		return website;
	}
}
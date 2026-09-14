//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class GCF
{
	
	public static int gcf(int n1, int n2)
	{
		if(n1 % n2 == 0){
			return n2;
		}	
		return gcf(n2, n1 % n2);
	}
}
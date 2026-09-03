//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorTest
{
	private ArrayList<String> list;

	public ListIteratorTest(String line) {
		setTest(line);
	}

	public void setTest(String line) {
		String[] words = line.split(" ");
		list = new ArrayList<>(Arrays.asList(words));
	}

	public void replace(String toRemove, String replaceWith) {
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()){
			String i = it.next();
			if(i.equals(toRemove)){
				it.set(replaceWith);
			}
		}

	}

	public String toString() {
		return list.toString();
	}
}

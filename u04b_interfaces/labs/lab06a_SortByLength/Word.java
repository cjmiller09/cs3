//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Word implements Comparable<Word>
{
	private String word;

	public Word(String s){
		word = s;
	}

	public int compareTo(Word o){
		if(word.length() < o.getLength()){
			return -1;
		}
		if(word.length() > o.getLength()){
			return 1;
		}
		String str = o.toString();
		return word.compareTo(str);
	}
	public int getLength(){
		return word.length();
	}
	//add a toString
	public String toString()
	{
		return word;
	}
}
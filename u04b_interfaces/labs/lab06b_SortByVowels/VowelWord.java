//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

class VowelWord implements Comparable<VowelWord>
{
	//add a string instance variable
	private String word;
	//add a constructor
	public VowelWord(String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int i=0; i<word.length(); i++)
		{
			if(vowels.indexOf(word.charAt(i)) != -1)
			{
				vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(VowelWord other)
	{
		if(this.numVowels() < other.numVowels()){
			return -1;
		}
		if(this.numVowels() > other.numVowels()){
			return 1;
		}
		return word.compareTo(other.toString());
	}

	public String toString()
	{
		return word;
	}
}
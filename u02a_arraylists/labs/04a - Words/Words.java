//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
      setWords(wordList);
	}

	public void setWords(String wordList)
	{
      words = new ArrayList<Word>();
      Scanner chopper = new Scanner(wordList);
      while(chopper.hasNext()){
         words.add(new Word(chopper.next()));
      }

	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
      for(Word word : words){
         if(word.getLength() == size){
            count++;
         }
      }

		return count;
	}
	
	public void removeWordsWithXChars(int size)
	{
      for(int i=0; i<words.size();){
         if(words.get(i).getLength() == size){
            words.remove(i);
         }
         else{
            i++;
         }
      }





	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
      for(int i=0; i<words.size(); i++){
         if(words.get(i).getNumVowels() == numVowels){
            count++;
         }
      }
		return count;
	}
	
	public String toString()
	{
	   return words.toString();
	}
}

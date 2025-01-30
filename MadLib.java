//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("punched");
		nouns.add("Wal-Mart");
		adjectives.add("massive");
		story = "I punched Wal-Mart in a massive way";
	}

	public MadLib(String fileName)
	{

		loadNouns();
		//load stuff

		try
		{
			Scanner bob = new Scanner(new File(""));
			
			
			{
				//while (bob.hasNext())
				//story = bob.next

				if(story.equals("@"))
				getRandomVerb();
				if(story.equals("&"))
				getRandomAdjective();
				if(story.equals("#"))
				getRandomNoun();

				
			
				
			}
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech


			//While there is more of the story, read in the word/symbol

				//If what was read in is one of the symbols, find a random
				//word to replace it.


		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner bob = new Scanner(new File("nouns.dat"));

			while (bob.hasNext())
			{
				nouns.add(bob.next());
			}
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		try
		{
			Scanner bob = new Scanner(new File("verbs.dat"));
        while (bob.hasNext())
        {
            verbs.add(bob.next());
        }
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner bob = new Scanner(new File("verbs.dat"));
        while (bob.hasNext());
        {
            verbs.add(bob.next());
        }
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		if (verbs.size() > 0) {
		Random rand = new Random();
		return verbs.get(rand.nextInt(verbs.size()));
		}
		return "";
	}

	public String getRandomNoun()
	{
		if (verbs.size() > 0) {
		Random rand = new Random();
		return nouns.get(rand.nextInt(nouns.size()));
			}
		return "";
	}

	public String getRandomAdjective()
	{
		if (adjectives.size() > 0) {
		Random rand = new Random();
		return adjectives.get(rand.nextInt(adjectives.size()));
		}
		return "";
	}

	public String toString()
	{
		return "" + story;
	}
}
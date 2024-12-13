public class Punctuation
{
	public static void main (String[] args)
	{
			Punctuation p = new Punctuation();
			p.searchIt();
	}
	public void searchIt()
	{
		 getPunctuationWords();
		 
		 
	}
	public void getPunctuationWords()
	{
			String Str1 = new String("Jay asked, \"Huh?!\"");
			printWords(Str1);
			
	}
	public void printWords(String StrIn)
	{
		int start = 0;
		int end = 0;
		int length = StrIn.length();
		
		
		do
		{
			while(end < length &&StrIn.charAt(end) != ' ')
			{
				end++;
				
				
			}

			
			checkForPunctuation(StrIn.substring(start,end));
			start = end+1;
			end +=2;
		
			
			
			
		
		
		}
		while(end<length);
		
			
	}
	public void checkForPunctuation(String TempIn)
	{
		
		System.out.print(TempIn);
		boolean character = false; 
		int counter = 0;
		while(counter < TempIn.length())
		{
			if(TempIn.charAt(counter) == '.' ||TempIn.charAt(counter) == ',' ||TempIn.charAt(counter) == ';' ||TempIn.charAt(counter) == ':' ||TempIn.charAt(counter) == '!' ||TempIn.charAt(counter) == '?' ||TempIn.charAt(counter) == '\'' ||TempIn.charAt(counter) == '\"' ||TempIn.charAt(counter) == '(' ||TempIn.charAt(counter) == '-')
			{
				character = true;
			}
			counter++;
		}
		if(character = false)
		{
			System.out.println(TempIn);
		}
	}
}

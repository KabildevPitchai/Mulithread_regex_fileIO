package Regex;

import java.util.regex.*;
            
         //  OR
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;

public class RegexDemo { 

	public static void main(String[] args) {
//		String input = "My mobile number is 98840 10000,8496741345";
		
//	    Pattern patternObj = Pattern.compile("\\d{10}");
//		Pattern patternObj=Pattern.compile("[0123456789]");
//		Pattern patternObj=Pattern.compile("[0-9]");//it shows 0 to 9 b/w all nums
//		Pattern patternObj=Pattern.compile("[a-z]");//it shows a to z b/w all alphabets
//		Pattern patternObj=Pattern.compile("[a-zA-Z0-9]");//its shows the output of given terms
//		Pattern patternObj=Pattern.compile("[^ a-zA-Z0-9]");//its shows remains of given terms

//	    Matcher matcherObj = patternObj.matcher(input);//its used to matching the line of pattern syntax
//so matcher is depends on Pattern 
	    
//	    while(matcherObj.find())
	    {
//	      System.out.print(matcherObj.group());//its gives the group of array into words
//	      System.out.println(matcherObj.start());//start method like an Index model Starts with 0
//	      System.out.println(matcherObj.end());//end method like an length starts with 1
	      
	    }
	    
	    
//	    String password = "Chennai is the capital of TamilNadu";
//	    Pattern patternObj = Pattern.compile("TamilNadu$");//$-symbol is used in the sentence (last) to use it
//	    Pattern patternObj = Pattern.compile("^Chennai");//^-symbol used to check the Starting letter of input
//	    Matcher matcherObj = patternObj.matcher(password);
//	      while(matcherObj.find())
//	      {
//	        System.out.print(matcherObj.group());
//	      }
	    
//	    String password = "Chennai is the capital city 647264";
//	    Pattern patternObj = Pattern.compile("\\s");//its shows the spaces in the input =o/p is (     space5)
//	    Pattern patternObj = Pattern.compile("\\d");//its shows the d-digits in the input=o/p is (647264)	    
//	    Pattern patternObj = Pattern.compile("\\D");//its shows the D-without digits in the input=o/p is(Chennai is the capital city)
//	    Pattern patternObj = Pattern.compile("\\S");//its shows the S-without spaces in the input=o/p is(Chennaiisthecapitalcity647264)
//	      Matcher matcherObj = patternObj.matcher(password);
//	      int count = 0;
//	      while(matcherObj.find())
//	      {
//	        count++;
//	        System.out.print(matcherObj.group());//grouping the single characters into group
//	      }
//	      System.out.println(count);
// 

//	    String mobile = "9884012810";//its a mobile num so its shows the output
//	    String mobile1 = "1342374687";//its not a mobile so its doesn't shown in output
//	    Pattern patternObj = Pattern.compile("[6-9][0-9]{9}");//condition term if u give {9} means its take 9numbers after first number of mobile no
//	      Matcher matcherObj = patternObj.matcher(mobile);
//	      while(matcherObj.find())
//	      {
//	        System.out.print(matcherObj.group());//grouping the single characters into group
//	      }

//	    String mobile = "9884012810";
//	    Pattern patternObj = Pattern.compile("(0|91)?[6-9][0-9]{9}");
//	        Matcher matcherObj = patternObj.matcher(mobile);
//	        while(matcherObj.find())
//	        {
//	          System.out.print(matcherObj.group());//grouping the single characters into group
//	        }

//	        String pattern = "-";
	        String input = "28-March-2023";
//	             Pattern patternObj = Pattern.compile(pattern);//or('-") -put it directly or used like 76 th line
	             Pattern patternObj = Pattern.compile("-");
	             String[] items = patternObj.split(input);
	             System.out.println(items.length);
	             for(int i=0;i<items.length;i++)
	             {
	               System.out.println(items[i]);
	             }


	    
	    

	}

}

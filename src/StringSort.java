import java.util.Scanner;   //Scanner class to take input from user

public class StringSort {
	
		public static void main(String args[]){    //Main function of the class
		//Static String
		String s1="My name is XYZ";
		//String conversion to lower case for comapring the exact ascii values
		s1 = s1.toLowerCase();

		// String split using space delimeter
		String[] words=s1.split(" ");//splits the string based on string

		//temporary variable for comparison
		String temp;
		 
		//sorting string words         
		for(int i=0;i<words.length;i++)
		{
		    for(int j=1;j<words.length;j++)
		    {
		        if(words[j-1].compareTo(words[j])>0)
		        {
		            temp=words[j-1];
		            words[j-1]=words[j];
		            words[j]=temp;
		        }
		    }
		}
		   
		//code to check sorted string   
		// System.out.println("\nSorted names are in Ascending Order: ");
		// for(int i=0;i<words.length;i++)
		// {
//		     System.out.println(words[i]);
		// }

		//Foreach for sort every single word
		  for(String w:words)
		  {
		    alphabetical(w);
		  }
		}

		public static void alphabetical(String w){
		//temporary string instance
		String n = w;

		int l = w.length();

		//string to characters
		char b[] = new char[l];

		//Getting values from array and sorting in proper format
		for(int i=0;i<l;i++)
		b[i] = n.charAt(i);
		char t;
		for(int j=0;j<l-1;j++)
		{
			// loop to print the original and Sorted words
		for(int k=0;k<l-1-j;k++)
		{
		 if(b[k]>b[k+1])
		 {
		  t=b[k];
		  b[k]=b[k+1];
		  b[k+1]=t;
		 }
		}
		}

		 System.out.println("\nOriginal word : " +n);
		 System.out.print("Sorted word : ");
		 
		 //Loops to print the next line and going in the loop
		 for(int m=0;m<l;m++)
		  System.out.print(b[m]);
		 System.out.print("\n");
		 }

	}

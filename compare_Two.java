/**************************************************************************
*                                                                         *
*     Program Filename:  compare_Two.java                                 *
*     Author          :  Siona Ravi                                       *
*     Date Written    :  October 03, 2019                                 *
*     Purpose         :  To compare two words inputted by the user        *
*     Input from      :  Keyboard                                         *
*     Output to       :  Screen                                           *
*                                                                         *
**************************************************************************/

import java.util.Scanner;
public class compare_Two{

   public static void main(String[] args) {
    
      Scanner  keyboard = new Scanner(System.in);
      boolean isNoneofThese = false;
      int count = 0;
      
 
      System.out.println("Enter two words each between 6 and 10 letters");
      System.out.println("Enter word 1:");
      String Word1 = keyboard.nextLine();
      Word1 = Word1.toUpperCase();
      System.out.println("Enter word 2:");
      String Word2 = keyboard.nextLine();
      Word2 = Word2.toUpperCase();
      
      if (Word1.equals(Word2)){
         System.out.println("The words are identical");
         count++;
      }
      if (Word1.length() < 6 || Word1.length() > 10 ||  Word2.length() < 6 || Word2.length() > 10)
      {
  	      System.out.println("Invalid Input! words have to be between 6 and 10");
      }
      else
      {
  	      if(Word1.length() == Word2.length()){
 		      System.out.println("The words you entered are the same length");
            count++; 
            }
      
   //Prefix check

   if (Word1.startsWith(Word2))
    {
	   System.out.println("The second word is a prefix of the first");
      count++;
   isNoneofThese = false; 
    }
    if (Word2.startsWith(Word1))
    {
         System.out.println("The first word is a prefix of the second");
         count++;
         isNoneofThese = false;
    }
// End prefix check


      // Suffix check
 
      if (Word1.endsWith(Word2))
      {
         System.out.println("The second word is a suffix of the first");
         count++;
         isNoneofThese = false;
      }
      if (Word2.endsWith(Word1))
      {
         System.out.println("The first word is a suffix of the second");
         count++;
         isNoneofThese = false;
      } //End suffix check
 
      //If no word check out
      
         
       
      if (Word1.charAt(0)== Word2.charAt(0)){
         System.out.println("The words both begin with the letter " + Word1.charAt(0));
         count++;
      
      }
      if (Word1.charAt(Word1.length()-1)== Word2.charAt(Word2.length()-1))
      { 
         System.out.println("The words both end with the letter " + Word1.charAt(Word1.length()-1));
         count++;
      }
      if (count == 0)
      {
         System.out.println("There is nothing special about these words");
      }
      }   
   }  //end main
}  //end class ravi

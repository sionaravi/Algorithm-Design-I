/**************************************************************************
*                                                                         *
*     Program Filename:  find_Files.java                                  *
*     Author          :  Siona Ravi                                       *
*     Date Written    :  December 01, 2019                                *
*     Purpose         :  Finds files with their extensions and names      *
*     Input from      :  Keyboard                                         *
*     Output to       :  Screen                                           *
*                                                                         *
**************************************************************************/

import java.util.Scanner;

import java.io.*;

public class find_Files
{
   public static void main(String[] args) throws IOException
   {
      char currentLetter;
      int s, r, maxFrequency = 0;
      int[] letters = new int[26];
      String border = "__________________________";
      String Xaxis = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String filename = " ";
      String content = " ";
      Scanner Keyboard = new Scanner(System.in);
      Scanner inputfile;
      
      System.out.println("Please enter the name of the file with it's extension:");
      filename = Keyboard.nextLine();
      inputfile = new Scanner(new File(filename));
      
      while (inputfile.hasNext())
      {
         content += inputfile.nextLine();
      }
      
      content = content.toUpperCase();
      for (s = 0; s < content.length(); s++)
      {
        currentLetter = content.charAt(s);
        if (currentLetter >= 'A' && currentLetter <= 'Z')
            letters[currentLetter - 'A']++;
      }
      
      for (s = 0; s < 26; s++)
      {
         if (letters[s] > maxFrequency)
            maxFrequency = letters[s]; 
      }
      
      for (s = 0; s < maxFrequency; s++)
      {
         
         for (s = 0; s < maxFrequency; s++)
         {
            for (r = 0; r < 26; r++)
            {
               if (letters[r] < (maxFrequency - s))
                  System.out.print(" ");
               else
                  System.out.print("*");
                  //System.out.println(" ");
               
            }
            System.out.print("\n");
         }
         System.out.println(border);
         System.out.println(Xaxis);
         
      }
   }
}
   //end class find_Files

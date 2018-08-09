package Javaassignment2.main;

import java.util.Scanner;

public class IsContainAllTheAlbhabets {
    /**
     * Checks whether input string contains all letters of an alphabet.
     * @param str The input strin
     * @return true if contains all letters of alphabet, otherwise false
     */

       public static boolean checkString(String str)
       {
           if(str==null)
               return false;
               str=str.toLowerCase();
               for(char c='a'; c<='z'; c++)
               {
                   if(!str.contains(String.valueOf(c)))
                       return false;
               }
               return true;
       }
       public static void main(String[] args)
       {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter the string: ");
           String str=sc.next();
           //String str="abcdefghijklmnopqrstuvwyz";
           if(checkString(str))
               System.out.println("String contains all alphabets");
           else
               System.out.println("String doesn't contains all alphabets");

       }
}

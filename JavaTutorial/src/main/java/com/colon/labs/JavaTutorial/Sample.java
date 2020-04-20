package com.colon.labs.JavaTutorial;

class DisplayOverloading
{
    public  void disp(char c)
    {
         System.out.println(c);
         System.out.println("Method one called.");
    }
    public  void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
         System.out.println("Method  two called.");
    }
}



class Sample
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');
       obj.disp('a',10);
       DisplayOverloading obj1 = new DisplayOverloading();
       
       obj1.disp('p');
       obj1.disp('t', 89);
       obj1.disp('i', 90);
		/*
		 * DisplayOverloading.disp('a'); DisplayOverloading.disp('b');
		 * DisplayOverloading.disp('c', 78);
		 */
       
   }
}
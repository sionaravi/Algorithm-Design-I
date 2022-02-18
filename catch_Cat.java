/********************************************************************************
*                                                                               *
*     Program Filename:  catch_Cat.java                                             *
*     Author          :  Siona Ravi                                             *
*     Date Written    :  November 08, 2019                                      *
*     Purpose         :  To find if cat makes to the tree or gets caught        *
*     Input from      :  Keyboard                                               *
*     Output to       :  Screen                                                 *
*                                                                               *
*********************************************************************************/
import java.util.Scanner;

public class catch_Cat
{
   public static void main(String[] args)
   {
    
     Point Cat = new Point();
     Point Dog = new Point();
     Point Tree = new Point();
     Scanner  keyboard = new Scanner(System.in); 
     Double CatS, DogS, TreeS, CatD, DogD, CatSpeed, DogSpeed;
      
      
     // X
     Cat.setX(0);
     System.out.println("Please type distance between Cat and Dog");
     CatS = keyboard.nextDouble();
     Dog.setY(CatS);

     //Y
     System.out.println("Please Enter Dog Position");
     DogS = keyboard.nextDouble();
     Dog.setY(DogS);
    
     //Z
     System.out.println("Please Enter Cat Position");
     TreeS = keyboard.nextDouble();
     Tree.setX(TreeS);
     
     //A
     System.out.println("Please Enter Cat Speed");
     CatSpeed = keyboard.nextDouble();    
     
     //B
     System.out.println("Please Enter Dog Speed");
     DogSpeed = keyboard.nextDouble();    
     
     CatD=Cat.distanceFrom(Tree.getX(),Tree.getX());
     DogD=Dog.distanceFrom(Cat.getX(),Cat.getX());
     
     while(CatD >= CatSpeed)
      {
       Cat.moveTowardPoint(Tree.getX(),Tree.getY(), CatSpeed);
       
       CatD=Cat.distanceFrom(Tree.getX(),Tree.getY());
       DogD=Dog.distanceFrom(Cat.getX(),Cat.getY());
       
       if (!(CatD <= CatSpeed)); {       
       CatD=Cat.distanceFrom(Tree.getX(),Tree.getY());
       DogD=Dog.distanceFrom(Cat.getX(),Cat.getY());
       Dog.moveTowardPoint(Cat.getX(),Cat.getY(), DogSpeed);      
      }
              
       if(DogD < DogSpeed) {       
         System.out.println("The dog caught the cat.");
         break;       
         }
       
       if(CatD <= CatSpeed) {
         System.out.println("The Cat made it safely to the tree");
         break;
         }
       }
     }
   // end function main
}
// end class catch_Cat      

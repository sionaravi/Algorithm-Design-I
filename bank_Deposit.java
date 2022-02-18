/**********************************************************************************
*                                                                                 *
*     Program Filename:  bank_Deposit.java                                        *
*     Author          :  Siona Ravi                                               *
*     Date Written    :  October 17, 2019                                         *
*     Purpose         :  To prompt the user to enter the amount of initial depoit *
*     Input from      :  Keyboard                                                 *
*     Output to       :  Screen                                                   *
*                                                                                 *
**********************************************************************************/

import java.util.Scanner;
public class bank_Deposit {
    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your initial deposit");
        double initialDeposit = keyboard.nextDouble();
        
        System.out.println("Please enter your interest rate");
        double interestRate = keyboard.nextDouble();
        interestRate = interestRate/100;
        
        double growth = initialDeposit*interestRate;
        double balance = initialDeposit + growth;
        int year = 1;
        
        System.out.println("Year\tInterest Earned\tEnd-of-Year Balance");
        System.out.println("====\t===============\t====================");
        
        while (balance <= initialDeposit * 2)
        {
           System.out.println(year + "\t$" + String.format("%.2f", growth) + "\t\t$" + String.format("%.2f", balance));
           growth = balance*interestRate;
           balance = growth + balance;
           year++;
        }
            
    }   //end main 
}   //end class bank_Deposit

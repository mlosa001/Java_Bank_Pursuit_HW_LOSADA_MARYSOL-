/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;
import java.util.Scanner; // I use scanner because it's command line.

/**
 *
 * @author Mariadelmar
 */
public class Hw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    String Username;
    String Password;

    Username = "a";
    Password = "b";


    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {
        System.out.println("");

        System.out.println("Access Granted! Welcome!");
        System.out.println("");

        System.out.println("what would you like to do?");
        System.out.println("");

        System.out.println("[1]list all Accounts");// take u into a thing that you can display the accounts each cust has, view blanace//deposit and withdraw//close account
        System.out.println("[2]add new Customer");
        System.out.println("[3]Delete Customer");
        System.out.println("[4]Sign out");

        
        //make sign in a method which stores signed in in a variable and then I can do a: if signed in go to menu 


                //print a hash map that
            Scanner input3 = new Scanner(System.in);
            


        //Allow a user to list all of the current customers for your bank
//Allow a user to add new customers// customers.put() 
//Allow a user to list all of the bank accounts for each user of the bank//bank teller
//Allow a user to add new bank accounts//bank teller 
//Allow a user to view and update the account balances for every customer (deposit or withdraw an amount of money)
//Allow a user to close an entire account
//Allow a user to delete a customer, and all their data
//Allow a user to sign out of the program

    }
        
    

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }
    
    //make a list of all customers
   //selection menu to list and add accounts 

}


   

    
    
    } 
    



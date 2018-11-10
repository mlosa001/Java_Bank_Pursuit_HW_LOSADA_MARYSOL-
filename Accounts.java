/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

/**
 *
 * @author Mariadelmar
 */
public class Accounts {
    String name;
    String accounts; 
    String savings; 
    String checkings;
    //hash map get all keys
    public Accounts(String name, String account, String savings,String checkings ){
        this.name =name; 
        this.accounts = accounts;
        this.savings =savings;
        this.checkings = checkings;
        
   
    }
}
    



//Pursuit Android 5.4 Homework 01.03
// (Links to an external site.)Links to an external site.Write a "Bank Teller" Program
// (Links to an external site.)Links to an external site.Project overview
//Write a command line tool for a Bank that allows users to Create, Read, Update, and Delete data for customers and their bank accounts.
//
//This program should have the following functionality:
//
//Require that a user (Bank Teller) sign-in with a pre-determined Username and Password
//Allow a user to list all of the current customers for your bank
//Allow a user to add new customers// customers.put() 
//Allow a user to list all of the bank accounts for each user of the bank//bank teller
//Allow a user to add new bank accounts//bank teller 
//Allow a user to view and update the account balances for every customer (deposit or withdraw an amount of money)
//Allow a user to close an entire account
//Allow a user to delete a customer, and all their data
//Allow a user to sign out of the program
//Note:
//
//Upon sign-in, the system should already have 5 customers in the data structure//
//Each customer should have at least 1 (one) account
//Each account should have a current balance
//When the Bank Teller signs out, and signs back in - the account data should return to their pre-set values
// (Links to an external site.)Links to an external site.Requirements
//This assignment is fairly open-ended, so be creative with your game ideas and have fun! However, the completed submission should include each of the following requirements:
//
//Accept input from the user with a Scanner object
//At least one Array
//At least one ArrayList
//At least one HashMap
//At least one HashSet
//Access to and use of all of the above data structures and input, should exist in methods
//At least one class
// (Links to an external site.)Links to an external site.Additional Factors
//Your game should be able to run to completion without noticeable bugs or crashes.
//Code should be organized into methods and classes as appropriate to demonstrate good modularization and code reuse.
//All submitted code should be formatted as defined by the Google Java Style Guide (Links to an external site.)Links to an external site..
//This is an individual assignment, so each student will be responsible for submitting their own original game.
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task2;

import by.kunavich.task2.data.*;
import by.kunavich.task2.logic.PasswordCheck;
import by.kunavich.task2.view.ConcoleResultPrinter;
import by.kunavich.task2.view.ResultPrinter;



/**
 *
 * @author Lord
 */
public class Main {
     public static void main(String[] args) throws Exception {

         // get number
         DataAcquirerFactory factory = new DataAcquirerFactory();
         DataAcquirer acquirer = factory.getDataAcquirer("CONSOLE");
         String password =acquirer.getPassword();

         //count
         PasswordCheck check = new PasswordCheck();
         boolean answ= check.checkPassword(password);

         //out
         ResultPrinter printer= new ConcoleResultPrinter();
         printer.printResult(answ);


    }
}

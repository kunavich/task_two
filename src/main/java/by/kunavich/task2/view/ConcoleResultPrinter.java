/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task2.view;

/**
 *
 * @author Lord
 */
public class ConcoleResultPrinter implements ResultPrinter{

    @Override
    public void printResult(boolean answ) {
        if(answ) {
            System.out.println("Correct password");
        }
        else{
            System.out.println("Incorrect password (wrong)");

        }
    }
}

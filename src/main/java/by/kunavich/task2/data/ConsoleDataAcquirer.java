/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task2.data;

import java.util.Scanner;

/**
 *
 * @author Lord
 */
public class ConsoleDataAcquirer implements DataAcquirer{

    @Override
    public String getPassword() throws Exception {
        System.out.println("Enter date password");
        try (Scanner scanner = new Scanner(System.in)){
            String input =scanner.next();


            return input;
        }



    }
}

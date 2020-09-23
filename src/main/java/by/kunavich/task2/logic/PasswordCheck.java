/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task2.logic;


/**
 *
 * @author Lord
 */
public class PasswordCheck {

    private final static String PASSWORD= "AMBER";

    public boolean checkPassword(String password) throws Exception {
        return (password.equals(PASSWORD));
    }
    
}

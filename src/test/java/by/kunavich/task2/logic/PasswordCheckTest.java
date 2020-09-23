/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task2.logic;


import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Lord
 */
public class PasswordCheckTest {

    @Test
    public void checkPasswordOnTrue() throws Exception {


        //given
        String password = "AMBER";
        PasswordCheck check = new PasswordCheck();

        //whenn
        boolean actual= check.checkPassword(password);
        //then
        Assert.assertEquals(true,actual);

    }

    @Test
    public void checkPasswordOnFalse() throws Exception {


        //given
        String password = "KORVIN";
        PasswordCheck check = new PasswordCheck();

        //whenn
        boolean actual= check.checkPassword(password);
        //then
        Assert.assertEquals(false,actual);

    }
}

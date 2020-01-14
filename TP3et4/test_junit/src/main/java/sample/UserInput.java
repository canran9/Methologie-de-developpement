/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.FileInputStream;

/**
 *
 * @author muruowang
 */
/**
 * source : https://www.tutorialspoint.com/java/lang/system_setin.htm
 */
public class UserInput {

    public static void main(String[] args) throws Exception {
        // existing file
        System.setIn(new FileInputStream("test_methods.txt"));
        // read the first character in the file 
        char ret = (char) System.in.read();
        // returns the first character 
        System.out.println(ret);
    }
}

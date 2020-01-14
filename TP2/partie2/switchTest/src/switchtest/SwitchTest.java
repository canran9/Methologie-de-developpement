/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchtest;

/**
 *
 * @author muruowang
 */
public class SwitchTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String color = "red";
        String colorRGB;
        switch (color) {
            case "black":
                colorRGB = "000000";
                break;
            case "red":
                colorRGB = "ff0000";
                break;
            case "green":
                colorRGB = "008000";
                break;
            case "blue":
                colorRGB = "0000ff";
                break;
            default:
                colorRGB = "Invalid color";
                break;
        }
        System.out.println(colorRGB);
    }
}
